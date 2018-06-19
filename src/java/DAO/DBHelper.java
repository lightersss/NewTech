package DAO;


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	public static Connection getConnection() {
		final String URL="jdbc:derby://localhost:1527/NewTechBookStore";
		 final String USER="NewTechBookStore";
		 final String PASSWORD="NewTechBookStore";
		 Connection conn=null;
		 try {
			
			 conn=DriverManager.getConnection(URL,USER,PASSWORD);
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		}
		 return conn;
	}
	
	
	public static void close(ResultSet rs,PreparedStatement ps,Connection con) {
		try {
			if(null!=rs) {
				rs.close();
				rs=null;
			}
			if(null!=ps) {
				 ps.close();
				ps=null;
			}
			if(null!=con) {
				con.close();
				con=null;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
