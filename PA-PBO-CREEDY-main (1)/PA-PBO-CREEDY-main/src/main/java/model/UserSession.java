/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class UserSession {
    private static String userId;
    private static String namaUser;
    private static String role;

    public static String getUserId() { return userId; }
    public static void setUserId(String id) { userId = id; }

    public static String getNamaUser() { return namaUser; }
    public static void setNamaUser(String nama) { namaUser = nama; }

    public static String getRole() { return role; }
    public static void setRole(String r) { role = r; }
    
    public static void clearSession() {
        userId = null;
        namaUser = null;
        role = null;
    }
}
