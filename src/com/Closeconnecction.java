package com;

import java.sql.*;

public class Closeconnecction {
	public static void main(String[] args) {
		Connection c = null;
		try{ c = DriverManager.getConnection("jdbc:mysql://localhost:3306/player_db","root","root");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement s = c.createStatement();
		s.executeUpdate("insert into player values(2,'dohni',07,'csk','cricket'");
		System.out.println("data saved");}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				c.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
