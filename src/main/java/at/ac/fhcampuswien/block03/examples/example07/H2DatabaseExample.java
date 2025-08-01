package at.ac.fhcampuswien.block03.examples.example07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2DatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:h2:~/moviesdb";
        String user = "sa";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // create table
            String createTableSQL = "CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(255))";
            try (PreparedStatement pstmt = conn.prepareStatement(createTableSQL)) {
                pstmt.executeUpdate();
            }

            // insert data
            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                pstmt.setInt(1, 1);
                pstmt.setString(2, "John Doe");
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}