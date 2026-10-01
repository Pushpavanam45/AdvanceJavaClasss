package demo;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class FetchAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root",
	                "Thamizhan@123");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from user");
			
					while(rs.next()) {
						System.out.println("id = "+rs.getInt(1));
						System.out.println("email = "+rs.getString(2));
						System.out.println("name = "+rs.getString(3));
						System.out.println("password = "+rs.getInt(4));
						System.out.println("role = "+rs.getString(5));
System.out.println("---------------------------------");
						
					}
		} catch (ClassNotFoundException | SQLException e) {
			
					e.printStackTrace();
					
		}
	}

}
