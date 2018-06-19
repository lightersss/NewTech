/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import DAO.DBHelper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Login extends HttpServlet {

  PrintWriter out;
    Connection c;
    ResultSet rs;
  @Override
    public void init(){
        c=null;
        rs=null;
        out=null;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
         PreparedStatement ps = null ;  
         out=response.getWriter();
        HttpSession session=request.getSession();
        try{
            Cookie cookie;
           String username= request.getParameter("CustumUsername");
            c=DBHelper.getConnection();
             String sql = "select CUSTOMPASSWORD,CUSTOMPINCODE from CUSTOMINFO where CUSTOMUSERNAME=?";  
	            ps= c.prepareStatement(sql);
                    ps.setString(1, username);
	            rs = ps.executeQuery() ;   
                  
                   while(rs.next()){
                       
                        cookie=new Cookie("pincode", rs.getString(2));
                        response.addCookie(cookie);
                        
                         if(request.getParameter("CustemPassword").equals(rs.getString(1)))
                    {
                        
                       session.setAttribute("user", username);
                       System.out.print(session.getAttribute("user"));
                          response.sendRedirect("search.jsp");
                    }else{
                            
                        out.print("<script>alert('密码错误.'); window.location='denglu.jsp' </script>");
                        
                         }
                   }
                   DBHelper.close(rs, ps, c);
                    
	         
                       
                     
                        
                     
              
        }catch(Exception e){
            e.printStackTrace();
        }
    }
      
    

 

    

}
