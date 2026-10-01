package demo;
import java.sql.DriverManager;
import java.sql.SQLException;
public class EstablishConnection {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/player_db",
                "root",
                "Thamizhan@123"
            );

            System.out.println("connection established");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}