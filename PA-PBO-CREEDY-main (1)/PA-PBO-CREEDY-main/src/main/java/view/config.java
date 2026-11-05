/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class config {
    private static Connection mysqlconfig;
    
    public static Connection configDB() throws SQLException {
        try {
            // URL Database MySQL (Sesuaikan nama database 'caps_credy' jika berbeda)
            String url = "jdbc:mysql://localhost:3306/pa_creedy"; 
            String user = "root"; // Username default MySQL
            String pass = "";     // Password default (kosongkan jika tidak ada)
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.err.println("Koneksi gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}
