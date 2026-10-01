package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleSqlConnection {

    public static void main(String[] args) {

        Connection c = null;

        try {

            // 1. Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. Establish connection
            c = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orclroo",
                    "scott",
                    "tiger"
            );

            // 3. Create statement
            Statement s = c.createStatement();

            // 4. Execute query
            ResultSet rs = s.executeQuery("SELECT * FROM EMP");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("EMPNO") + "  " +
                        rs.getString("ENAME") + "  " +
                        rs.getString("JOB") + "  " +
                        rs.getInt("MGR") + "  " +
                        rs.getDate("HIREDATE") + "  " +
                        rs.getDouble("SAL")
                );
            }
            System.out.println("Data retrieved successfully");

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();

        } finally {

            // 5. Close connection safely
            try {
                if (c != null) {
                    c.close();
                    System.out.println("Connection closed");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}