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
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lighters
 */
public class Register extends HttpServlet {

    PrintWriter out;
    Connection c;
    ResultSet rs;

    @Override
    public void init() {
        c = null;
        rs = null;
        out = null;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private String getPincode() {
        String pincode;
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
        pincode = yString + mString + dString + hString + miString + sString + msString;
        System.out.print(pincode);
        return pincode;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PreparedStatement ps = null;
        try {

            c = DBHelper.getConnection();
            String pincodeString = getPincode();
            String address = request.getParameter("CustomAddress");
            String email = request.getParameter("CustomEmail");
            String phonenumber = request.getParameter("CustomPhonenumber");
            String firstname = request.getParameter("CustomFirstname");
            String username = request.getParameter("CustomUsername");
            String password = request.getParameter("CustomPassword");
            String lastname = request.getParameter("Customlastname");
            String gender = request.getParameter("Customgender");
            System.out.print(gender);
            String sql = "insert into CUSTOMINFO(CUSTOMUSERNAME,CustomPassword,CustomPincode,CustomFirstname,CustomLastname,CustomAddress,CustomEmail,CustomGender,CustomPhonenumber) values(?,?,?,?,?,?,?,?,?)";
            ps = c.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, pincodeString);
            ps.setString(4, firstname);
            ps.setString(5, lastname);
            ps.setString(6, address);
            ps.setString(7, email);
            ps.setString(8, gender);
            ps.setString(9, phonenumber);
        

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBHelper.close(rs, ps, c);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
