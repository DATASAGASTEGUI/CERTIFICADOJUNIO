package mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal1 {

    public static void main(String[] args) {
        ejemplo2();
    }

    //PROBAR LA CONEXION A MYSQL
    //PROTOCOLO (jdbc:mysql)
    //NOMBRESERVIDOR (localhost)
    //PUERTO (3307)
    public static void ejemplo1() {
        String url = "jdbc:mysql://127.0.0.1:3306/";
        String usuario = "WALTER";
        String clave = "12345678";

        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                System.out.println("OK: CONEXION");
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e.getMessage());
        }
    }

    public static void ejemplo2() {
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1";
        String usuario = "WALTER";
        String clave = "12345678";

        Connection conexion = null;

        //String sql = "SELECT * FROM Alumno";
        String sql = "SELECT * FROM Alumno WHERE idAlumno = 6";

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                System.out.println("OK: CONEXION");
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    int idAlumno = rs.getInt("idAlumno");
                    String nombre = rs.getString("nombre");
                    String apellido = rs.getString("apellidos");
                    String grupo = rs.getString("grupo");
                    Date nacimiento = rs.getDate("fechaNacimiento");
                    System.out.println(idAlumno + ";"
                            + nombre + ";"
                            + apellido + ";"
                            + grupo + ";"
                            + nacimiento);
                }
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e.getMessage());
        }
    }

    //EJECUTAR EL SQL DE AGRUPAMIENTO
    public static void ejemplo3() {
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1";
        String usuario = "root";
        String clave = "12345678";

        Connection conexion = null;

        String sql = "SELECT grupo, COUNT(*) AS CANTIDAD FROM Alumno GROUP BY grupo";

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                System.out.println("OK: CONEXION");
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String grupo = rs.getString("grupo");
                    int cantidad = rs.getInt("CANTIDAD");
                    System.out.println(grupo + ";" + cantidad);
                }
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e.getMessage());
        }
    }
    
    public static void ejemplo4() {
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1";
        String usuario = "root";
        String clave = "12345678";

        Connection conexion = null;

        String sql = "SELECT USER, HOST FROM MYSQL.USER";

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                System.out.println("OK: CONEXION");
                PreparedStatement ps = conexion.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    String user = rs.getString("USER");
                    String host = rs.getString("HOST");
                    System.out.println(user + ";" + host);
                }
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e.getMessage());
        }        
    }
    
    //CREAR UN USUARIO
    public static void ejemplo5() {
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1";
        String usuario = "root";
        String clave = "12345678";

        Connection conexion = null;

        String sql = "CREATE USER 'ARTURO'@'LOCALHOST' IDENTIFIED BY '12345678'";

        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                System.out.println("OK: CONEXION");
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.execute();
                System.out.println("OK: CREAR USUARIO");
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: CONEXION " + e.getMessage());
        }             
    }

}
