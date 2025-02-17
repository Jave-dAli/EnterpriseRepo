package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    String sql = "select * from login where uname=? and pass=?";
    String url = "jdbc:mysql://localhost:3306/db";
    String username = "root";
    String password = "rootcode";

    public boolean check(String uname, String pass){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  // ✅ Correct Driver

            Connection conn = DriverManager.getConnection(url,username,password);
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, uname);
            stmt.setString(2, pass);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
              return true;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
