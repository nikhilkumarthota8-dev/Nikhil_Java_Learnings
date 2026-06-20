package JDBC;

import java.sql.*;

public class ConnectMySQL {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        Class.forName("com.mysql.jdbc.Driver");
        String host = "jdbc:mysql://localhost:3306/selenium";
        String user = "Nikhil";
        String password = "Nikhil@77";

        String query = "Select * from seleniumusers";
        try (Connection con = DriverManager.getConnection(host, user, password);
             PreparedStatement pstmt = con.prepareStatement(query)) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {

                    String name = rs.getString("firstname");
                    String email = rs.getString("email");
                    System.out.println("FirstName: " + name + ", Email: " + email);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

