package Controlador;

import java.sql.*;

public class Conexion {
    
    public static Connection getConection(){
        String url, user, pass;
        
        url = "jdbc:mysql://localhost:3306/registroalumnos";
        user = "root";
        pass = "InnerUniverse!64";
        
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return con;
    }
    
}
