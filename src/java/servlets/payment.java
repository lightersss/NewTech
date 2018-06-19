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
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lighters
 */
public class payment extends HttpServlet {
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
        try { 
            String custompincode=null;
                 Cookie[] cookies= request.getCookies();
           for(Cookie c : cookies) {  
                    if("pincode".equals(c.getName())) {  
                     custompincode=  c.getValue();
                       System.out.print("PINCEODE"+c.getValue());
                    }    
                }
           String billorder=request.getParameter("pincode");
         
           String cardnumber=request.getParameter("cardnumber");
           String cardtype=request.getParameter("cardtype");
           
            c=DBHelper.getConnection();
           String sql = "insert into PAYMENT(BILL_NUM,CUSTOMPINCODE,CREDITCARD_NUM,CREDITCARD_TYPE) values(?,?,?,?)";
           ps = c.prepareStatement(sql);
           ps.setString(1,billorder );
            ps.setString(2, custompincode);
            ps.setString(3, cardnumber);
            ps.setString(4, cardtype);
            ps.executeUpdate();
           HttpSession session= request.getSession();
          HashMap<String,Book> carts=( HashMap<String,Book>)session.getAttribute("cart");
          if(carts.size()>0)
          carts.clear();
          session.setAttribute("carts", carts);
        
            request.setAttribute("billorder", billorder);
           
            request.getRequestDispatcher("success.jsp").forward(request, response);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBHelper.close(rs, ps, c);
    
    }

    

}
