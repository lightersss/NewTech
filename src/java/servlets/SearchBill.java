/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import DAO.DBHelper;
import beans.Pay;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lighters
 */
public class SearchBill extends HttpServlet {
 PrintWriter out;
    Connection c;
    ResultSet rs;
  @Override
    public void init(){
        c=null;
        rs=null;
        out=null;
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PreparedStatement ps = null ;  
         out=response.getWriter();
                 try{
           Cookie[] cookies=request.getCookies();
           String custompincode=null;
            c=DBHelper.getConnection();
                     ArrayList<Pay> pays=new ArrayList<Pay>();
           for(Cookie c : cookies) {  
                    if("pincode".equals(c.getName())) {  
                     custompincode=  c.getValue();
                       System.out.print("PINCEODE"+c.getValue());
                    }    
                }
             String sql = "select * from PAYMENT where CUSTOMPINCODE=?";  
	            ps= c.prepareStatement(sql);
                    ps.setString(1,custompincode);
	            rs = ps.executeQuery() ;   
                  
                   while(rs.next()){
                       Pay p=new Pay();
                       p.setBillnum(rs.getString(1));
                       p.setPincode(rs.getString(2));
                       p.setCredict_num(rs.getString(3));
                       p.setCredict_typeString(rs.getString(4));
                       pays.add(p);
                       
                        
                        
                   }
                   request.setAttribute("pays", pays);
                   request.getRequestDispatcher("orderdetails.jsp").forward(request, response);
                   DBHelper.close(rs, ps, c);
                    
	         
                       
                     
                        
                     
              
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


}
