/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import DAO.DBHelper;
import beans.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static javax.swing.text.html.CSS.getAttribute;

/**
 *
 * @author Lighters
 */
public class order extends HttpServlet {

    PrintWriter out;
    Connection c;
    ResultSet rs;

    @Override
    public void init() {
        c = null;
        rs = null;
        out = null;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PreparedStatement ps = null;
        out=response.getWriter();
        try {
            HttpSession session = request.getSession();
            double price=0;
            int quantity=0;
            HashMap<String, Book> cartsHashMap = (HashMap<String, Book>) session.getAttribute("cart");
            for (Entry<String, Book> entry : cartsHashMap.entrySet()) {
                quantity=quantity+ entry.getValue().getStock();
                price=(entry.getValue().getStock())* entry.getValue().getPrice()+price;
            }  
            System.out.print(quantity);
            System.out.print(price);
         String idString=null;
           Cookie[] cookies= request.getCookies();
           for(Cookie c : cookies) {  
                    if("pincode".equals(c.getName())) {  
                     idString=  c.getValue();
                       System.out.print(c.getValue());
                    }    
                }
           String billNum=getbillnum();
            request.setAttribute("price",price );
          if(idString==null){
                out.print("<script>alert('请先登陆.'); window.location='denglu.jsp' </script>");
          }else{
             
            
            c=DBHelper.getConnection();
           String sql = "insert into ORDERTABLE(ORDERID,QUANTITY,PRICE,CUSTOMID) values(?,?,?,?)";
           ps = c.prepareStatement(sql);
           ps.setString(1,billNum );
            ps.setInt(2, quantity);
            ps.setDouble(3, price);
            ps.setString(4, idString);
            ps.executeUpdate();
              request.setAttribute("ordernum", billNum);
              System.out.print("订单号"+billNum);
             
            request.getRequestDispatcher("pay.jsp").forward(request, response);
          }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        DBHelper.close(rs, ps, c);
    }

    private String getbillnum() {
        String billnum;
        Calendar cc = Calendar.getInstance();
        int y = cc.get(Calendar.YEAR);

        int m = cc.get(Calendar.MONTH);

        int d = cc.get(Calendar.DATE);
        int h = cc.get(Calendar.HOUR_OF_DAY);
        int mi = cc.get(Calendar.MINUTE);
        int s = cc.get(Calendar.SECOND);
        int ms = cc.get(Calendar.MILLISECOND);
        String yString = Integer.toString(y);
        String mString = Integer.toString(m);
        String dString = Integer.toString(d);
        String hString = Integer.toString(h);
        String miString = Integer.toString(mi);
        String sString = Integer.toString(s);
        String msString = Integer.toString(ms);
        billnum = yString + mString + dString + hString + miString + sString + msString;
        System.out.print(billnum);
        return billnum;
    }

}
