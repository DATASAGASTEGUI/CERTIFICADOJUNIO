package mariadb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JTextArea;

public class PrincipalMysql {

    public static void main(String[] args) {
        VentanaSalida vs = new VentanaSalida("MYSQL");
        JTextArea txaContenido = vs.getTextArea();
        String s, query;
        
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1";   //protocolo, ipservidor,puerto,nombreBaseDatos
        String usuario = "root";
        String clave = "";
        
        Connection conexion = null;
        
        try {
             conexion = DriverManager.getConnection(url, usuario, clave);
             if(conexion != null) {
                System.out.println("OK: CONEXION");
                
                s = String.format("OK: CONEXION" + "\n");
                txaContenido.append(s);
                
                query = "SELECT * FROM Alumno";
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s %-10s %-20s %-5s %10s\n","IDALUMNO","NOMBRE","APELLIDOS","GRUPO","NACIMIENTO");
                System.out.printf("%8s %-10s %-20s %-5s %10s\n","--------","------","---------","-----","----------");
                
                s = String.format("%8s %-10s %-20s %-5s %10s\n","IDALUMNO","NOMBRE","APELLIDOS","GRUPO","NACIMIENTO");
                txaContenido.append(s);
                
                s = String.format("%8s %-10s %-20s %-5s %10s\n","--------","------","---------","-----","----------");
                txaContenido.append(s);
                
                while(rs.next()) {
                   int idAlumno = rs.getInt(1);
                   String nombre = rs.getString(2);
                   String apellidos = rs.getString(3);
                   String grupo = rs.getString(4);
                   Date fechaNacimiento = rs.getDate(5);
                   
                   System.out.printf("%8d %-10s %-20s %-5s %10s\n",idAlumno,nombre,apellidos,grupo,cambiarFormatoFecha(fechaNacimiento));
                   
                   s = String.format("%8d %-10s %-20s %-5s %10s\n",idAlumno,nombre,apellidos,grupo,cambiarFormatoFecha(fechaNacimiento));
                   txaContenido.append(s);
                }
             }else {
                //System.out.println("ERROR: CONEXION");
                s = String.format("ERROR: CONEXION");
                txaContenido.append(s);
             }
        }catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static String cambiarFormatoFecha(Date fechaNacimiento)  {//2024-06-21
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String fechaMiFormato = sdf.format(fechaNacimiento);
        return fechaMiFormato; //21-06-2024
    }
    
    
}
