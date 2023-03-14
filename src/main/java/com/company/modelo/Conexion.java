/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author edwar
 */
public class Conexion {
    String url="jdbc:mysql://localhost:3306/bd_ejemplo";
    String user="root",pass="12345678";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {            
        }
        return con;
    }
}
