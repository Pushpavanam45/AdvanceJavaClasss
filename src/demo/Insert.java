package demo;

import java.sql.*;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			java.sql.Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db",
                "root",
                "Thamizhan@123");
			
			Statement s = c.createStatement();
			
			s.executeUpdate("insert into user values(4,'mahi@gmail.com','dhoni',1737363,'cricket')");
			System.out.println("Successfully inserted");
		} catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
	}

}
