package demo;

import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.*;

public class FetchById {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter id: ");
		
		int id = s.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","Thamizhan@123");
			
			PreparedStatement ps = c.prepareStatement("select * from user where id = ?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println("id = "+rs.getInt(1));
				System.out.println("email = "+rs.getString(2));
				System.out.println("name = "+rs.getString(3));
				System.out.println("password = "+rs.getInt(4));
				System.out.println("role = "+rs.getString(5));
System.out.println("---------------------------------");
			}else {
				System.out.println("the entered id is not present in the database !!");
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
