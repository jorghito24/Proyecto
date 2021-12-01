/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tu_jo
 */
public class Conexion {

    Connection cn = null;

    public Connection obtenerConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/videojuegos", "root", "");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Clase conexion" + e.getMessage());

        }
        return cn;
    }
//    public static void main(String[] args) {
//        Conexion cn = new Conexion();
//        cn.getConnection();
//  }
}
