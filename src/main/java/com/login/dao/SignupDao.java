package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
    // Database Connection Details
    private static final String URL = "jdbc:mysql://localhost:3306/db"; // Replace "db" with your database name
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootcode";

    String checkUserQuery = "SELECT * FROM login WHERE uname=?";
    String insertUserQuery= "INSERT INTO login (uname,password) VALUES (?,?)";

    // Method to Register a New User
    public boolean registerUser(String uname, String pass) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Database Connection
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            PreparedStatement checkStmt = conn.prepareStatement(checkUserQuery);
            checkStmt.setString(1, uname);
            ResultSet rs = checkStmt.executeQuery();
            if(rs.next()) {
                System.out.println("User already exists: "+uname);
                return false;
            }

            PreparedStatement insertStmt = conn.prepareStatement(insertUserQuery);

            // Set Parameters
            insertStmt.setString(1, uname);
            insertStmt.setString(2, pass);

            // Execute the Update
            int rowsInserted = insertStmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("✅ User registered successfully: " + uname);

                return true; // Successfully inserted
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; // Registration failed
    }
}
