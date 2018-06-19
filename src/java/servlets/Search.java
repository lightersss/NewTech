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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lighters
 */
public class Search extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          out=response.getWriter();
      PreparedStatement ps = null;
        try {
          String booktype= request.getParameter("SearchArea");
            c=DBHelper.getConnection();
           
             String sql = "select * from BOOKINFO where BOOKTYPE=?";  
	            ps= c.prepareStatement(sql);
                    ps.setString(1, booktype);
	            rs = ps.executeQuery() ;    
                       
                        ArrayList <Book>books=new ArrayList<Book>();
                                
                   while(rs.next()){
                       Book book=new Book();
                       book.setBookname(rs.getString(1));
                       book.setBooisbn(rs.getString(2));
                       book.setBooktype(rs.getString(3));
                       book.setPress(rs.getString(4));
                       book.setStock(rs.getInt(5));
                       book.setAuhor(rs.getString(6));
                       book.setPrice(rs.getDouble(7));
                      
                         books.add(book);
                            
                        
                   }
                   if(books.size()==0)
                   {
                       out.print("<script>alert('meiyoujieguo.'); window.location='search.jsp' </script>");
                   }else{
                   request.setAttribute("books", books);
                   request.getRequestDispatcher("searchresult.jsp").forward(request, response);
                   }
            
    }catch(Exception e){
        e.printStackTrace();
    }
        out.print("</table>");
        DBHelper.close(rs, ps, c);

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    }
}
    


