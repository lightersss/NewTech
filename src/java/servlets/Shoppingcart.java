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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Lighters
 */
public class Shoppingcart extends HttpServlet {

    PrintWriter out;
    Connection c;
    ResultSet rs;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        out=response.getWriter();
        HashMap<String, Book> cartbooks = (HashMap<String, Book>) session.getAttribute("cart");
        if(cartbooks==null){
            cartbooks = new HashMap<>();
        }
        String[] inbss = request.getParameterValues("book");
        if(inbss==null){
          out.print("<script>alert('nihaimeixuan.'); window.location='search.jsp' </script>");
          
        }else{
//        System.out.print(inbss[0] + inbss[1]);
        PreparedStatement ps = null;
        try {
            c = DBHelper.getConnection();
            String sql = "select * from BOOKINFO where BOOKINBS=?";
            for (String s : inbss) {
                ps = c.prepareStatement(sql);
                ps.setString(1, s);
                rs = ps.executeQuery();
                while (rs.next()) {
                  
                   
                    if (rs.getInt(5) > 0) { 
                        if (cartbooks.containsKey(s)) {
                          
                           cartbooks.get(s).setStock(cartbooks.get(s).getStock() + 1);
                        } else {
                           
                            Book book = new Book();
                            book.setBookname(rs.getString(1));
                            book.setBooisbn(rs.getString(2));
                            book.setBooktype(rs.getString(3)); 
                            book.setPress(rs.getString(4));
                            book.setStock(1);

                            book.setAuhor(rs.getString(6));
                            book.setPrice(rs.getDouble(7));
                          
                            cartbooks.put(s, book);
                           
                        }
                    }
                }
                          
                session.setAttribute("cart", cartbooks);
             
               response.sendRedirect("shoppingcart.jsp");
            
            }
        
        }catch(Exception exception){
            exception.printStackTrace();
        }
     
    }
    }

}
