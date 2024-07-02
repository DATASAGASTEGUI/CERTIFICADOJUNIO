package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {
    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private String baseDatos;
    private Connection conexion;
    
    public ConexionMysql(String bd) {
       this.baseDatos = bd;
       String url = "jdbc:mysql://localhost:3306/" + baseDatos;
       String usuario = "root";
       String clave = "12345678";
       try {
          conexion = DriverManager.getConnection(url, usuario, clave);
       }catch(SQLException e) {
          conexion = null; 
       }
    }
    
    public Connection getConexion() {
        return this.conexion;
    }
}
