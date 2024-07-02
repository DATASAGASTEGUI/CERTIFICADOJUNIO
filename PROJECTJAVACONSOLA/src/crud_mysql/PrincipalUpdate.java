package crud_mysql;

import java.sql.Connection;

public class PrincipalUpdate {

    public static void main(String[] args) {
        ConexionMysql cm = new ConexionMysql("CAMPUSFP10");
        Connection conexion = cm.getConexion();
        MetodoCrud mc;
        if (conexion != null) {
            System.out.println("OK: CONEXION");
            mc = new MetodoCrud(conexion);
            Alumno alumno = new Alumno(9, "Carlos", "", "dam", null);
            if (mc.existeAlumno(alumno)) {
                if (mc.actualizarAlumno(alumno)) {
                    System.out.println("OK: ACTUALIZARALUMNO");
                } else {
                    System.out.println("ERROR: ACTUALIZARALUMNO");
                }
            } else {
                System.out.println("MENSAJE: ALUMNO NO EXISTE");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

}
