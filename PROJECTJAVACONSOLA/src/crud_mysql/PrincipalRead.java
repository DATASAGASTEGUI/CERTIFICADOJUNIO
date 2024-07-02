package crud_mysql;

import java.sql.Connection;
import java.util.List;

public class PrincipalRead {

    public static void main(String[] args) {
       ConexionMysql cm = new ConexionMysql("CAMPUSFP10");
       Connection conexion = cm.getConexion(); 
       MetodoCrud mc;
       if(conexion != null) {
          System.out.println("OK: CONEXION");
          mc = new MetodoCrud(conexion);
          List<Alumno> alumnos_al = mc.obtenerTodosLosRegistros();
          if(alumnos_al != null) {
             for(Alumno a: alumnos_al) {
                 System.out.println(a);
             }
          }else {
             System.out.println("ERROR: OBTENERTODOSLOSREGISTROS");
          }
       }else {
          System.out.println("ERROR: CONEXION"); 
       }
             
    }
    
}
