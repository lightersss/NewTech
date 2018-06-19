/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import beans.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lighters
 */
public class add extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    

  

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      String actionString=req.getParameter("action");
      System.out.print(actionString);
        String isbn=req.getParameter("isbn");
        HttpSession session= req.getSession();
        HashMap<String,Book> carts=( HashMap<String,Book>)session.getAttribute("cart");
       try{
           
      
        if(actionString.equals("add"))
        {
            System.out.print("add");
            carts.get(isbn).setStock(carts.get(isbn).getStock()+1);
            session.setAttribute("cart", carts);
             resp.sendRedirect("shoppingcart.jsp");
        }
        if(actionString.equals("remove"))
        {
            if(carts.get(isbn).getStock()>=1)
             carts.get(isbn).setStock(carts.get(isbn).getStock()-1); 
            if(carts.get(isbn).getStock()==0){
                carts.remove(isbn);
            }
            session.setAttribute("cart", carts);
             resp.sendRedirect("shoppingcart.jsp");}
        
      
      
    }catch(Exception e){
        e.printStackTrace();
    }
        }


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String actionString=request.getParameter("action");
        String isbn=request.getParameter("isbn");
       System.out.print(actionString);
       System.out.print(isbn);
    }

    

}
