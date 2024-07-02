package csv_to_mysql;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;

public class MetodoCrud { //CRUD = CREATE READ UPDATE     DELETE
    //       CREAR  LEER ACTUALIZAR ELIMINAR

    //VARIABLES DE INSTANCIA (ATRIBUTO)
    private Connection conexion; //ENTRADA

    //CONSTRUCTORES
    public MetodoCrud(Connection conexion) {
        this.conexion = conexion;
    }

    public int obtenerUltimoIdAlumno() {
        int ultimo = 0;
        //String sql = "SELECT MAX(idAlumno) FROM Alumno";
        String sql = "SELECT MAX(idAlumno) AS ULTIMO FROM Alumno";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
               //int ultimo = rs.getInt(1);
               ultimo = rs.getInt("ULTIMO") + 1;
            }
        }catch(SQLException e) {
            ultimo = -1;
        }
        return ultimo;
    }
    
    //CREATE (INSERT)
    public boolean insertarAlumno(Alumno alumno) {
        boolean correcto = true;
        String sql = "INSERT INTO Alumno (idAlumno, nombre_apellido, sexo, fecha_nacimiento) VALUES (?, ?, ?, ?)";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ps.setString(2, alumno.getNombreApellido());
            ps.setString(3, alumno.getSexo());
            ps.setDate(4, alumno.getFechaNacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    } 
    
    public boolean eliminarAlumno(Alumno alumno) {
        boolean correcto = false;
        String sql = "DELETE FROM Alumno WHERE idAlumno = ?";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ps.executeUpdate();
            correcto = true;
        }catch(SQLException e) {
            correcto = false;
        }
        return correcto;
    } 
    
    //UPDATE (UPDATE)
    public boolean actualizarAlumno(Alumno alumno) {
        boolean correcto = true;
        String sql = "UPDATE Alumno SET nombre_apellido = ?, sexo = ?, fecha_nacimiento = ?\n"
                + "WHERE idAlumno = ?";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, alumno.getNombreApellido());
            ps.setString(2, alumno.getSexo());
            ps.setDate(3, alumno.getFechaNacimiento());
            ps.setInt(4, alumno.getIdAlumno());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }    
    
    public static void main(String[] args) {
        ConexionMysql cm = new ConexionMysql("INSTITUTO");
        Connection conexion = cm.getConexion();
        MetodoCrud mc = new MetodoCrud(conexion);
        int n = mc.obtenerUltimoIdAlumno();
        System.out.println(n);
    }
    
    

}
