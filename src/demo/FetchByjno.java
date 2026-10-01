package demo;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class FetchByjno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the start jno: ");
		int st = s.nextInt();
		System.out.println("Enter the end jno");
		int ed = s.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db");
			
			PreparedStatement ps = c.prepareStatement("select * from user where password between ? and ?");
			
			ps.setInt(1, st);
			ps.setInt(2, ed);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
                System.out.println("id = " + rs.getInt(1));
                System.out.println("email = " + rs.getString(2));
                System.out.println("name = " + rs.getString(3));
                System.out.println("password = " + rs.getString(4));
                System.out.println("role = " + rs.getString(5));
                System.out.println("---------------------------------");
            }
			
		
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
			
		}
		
	}
}
