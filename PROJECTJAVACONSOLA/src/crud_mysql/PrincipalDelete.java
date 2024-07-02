package crud_mysql;

import java.sql.Connection;

public class PrincipalDelete {

    public static void main(String[] args) {
        ConexionMysql cm = new ConexionMysql("CAMPUSFP10");
        Connection conexion = cm.getConexion();
        MetodoCrud mc;
        if (conexion != null) {
            System.out.println("OK: CONEXION");
            mc = new MetodoCrud(conexion);
            Alumno alumno = new Alumno(8);
            if(mc.existeAlumno(alumno)) {
               if(mc.eliminarAlumno(alumno)) {
                  System.out.println("OK: ELIMINARALUMNO");
               }else {
                  System.out.println("ERROR: ELIMINARALUMNO");
               }
            }else {
                System.out.println("MENSAJE: ALUMNO NO EXISTE");
            }
        }else {
            System.out.println("ERROR: CONEXION");
        }
    }
}
