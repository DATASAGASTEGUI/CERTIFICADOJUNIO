package crud_mysql;

import java.sql.Date;

public class Alumno {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private int idAlumno;
    private String nombre;
    private String apellidos;
    private String grupo;
    private Date fechaNacimiento;

    //CONSTRUCTORES
    public Alumno() {
        this.idAlumno = 0;
        this.nombre = "";
        this.apellidos = "";
        this.grupo = "";
        this.fechaNacimiento = null;
    }

    public Alumno(int idAlumno, String nombre, String apellidos, String grupo, Date fechaNacimiento) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.grupo = grupo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    //METODOS SET Y GET
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", grupo=" + grupo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
