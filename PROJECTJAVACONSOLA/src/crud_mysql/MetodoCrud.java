package crud_mysql;

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

    //METODOS CRUD: CREATE READ UPDATE DELETE
    //READ (SELECT)
    public List<Alumno> obtenerTodosLosRegistros() {
        List<Alumno> alumnos_al = new ArrayList<>();
        String sql = "SELECT * FROM Alumno";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idAlumno = rs.getInt("idAlumno");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String grupo = rs.getString("grupo");
                Date fechaNacimiento = rs.getDate("fechaNacimiento");
                Alumno alumno = new Alumno(idAlumno, nombre, apellidos, grupo, fechaNacimiento);
                alumnos_al.add(alumno);
            }
        } catch (SQLException e) {
            alumnos_al = null;
        }
        return alumnos_al;
    }

    //CREATE (INSERT)
    public boolean insertarAlumno(Alumno alumno) {
        boolean correcto = true;
        String sql = "INSERT INTO Alumno (idAlumno, nombre, apellidos, grupo, fechaNacimiento) VALUES (NULL, ?, ?, ?, ?)";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellidos());
            ps.setString(3, alumno.getGrupo());
            ps.setDate(4, alumno.getFechaNacimiento());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }

    //UPDATE (UPDATE)
    public boolean actualizarAlumno(Alumno alumno) {
        boolean correcto = true;
        String sql = "UPDATE Alumno SET nombre = ?, grupo = ?\n"
                + "WHERE idAlumno = ?";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getGrupo());
            ps.setInt(3, alumno.getIdAlumno());
            ps.executeUpdate();
        } catch (SQLException e) {
            correcto = false;
        }
        return correcto;
    }
    
    public boolean existeAlumno(Alumno alumno) {
        boolean existe = true;
        String sql = "SELECT * FROM ALUMNO WHERE idAlumno = ?";//Query Paramétrica
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, alumno.getIdAlumno());
            ResultSet rs = ps.executeQuery();
            if(!rs.next()) {
               existe = false; 
            }
        }catch(SQLException e) {
            existe = false;
        }
        return existe;
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

}
