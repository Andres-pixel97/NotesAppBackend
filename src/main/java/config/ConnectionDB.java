/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;

/**
 *
 * @author joang
 */
public class ConnectionDB {

    // Properties
    private static Connection conn = null;
    private String driver, url, user, password;

    // Constructor
    private ConnectionDB() {
        url = "jdbc:mysql://localhost:3306/notesapp?useSSL=false&useTimezone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";
        driver = "com.mysql.cj.jdbc.Driver";
        user = "root";
        password = "1234";
        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Method getConnection
    public static Connection getConnection(){
        if (conn == null) {
            new ConnectionDB();
        }
        return conn;
    }
}
