package csv_to_mysql;

import java.sql.Date;

public class Alumno {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private int idAlumno;
    private String nombreApellido;
    private String sexo;
    private Date fechaNacimiento;
    
    //CONSTRUCTORES
    public Alumno(int idAlumno, String nombreApellido, String sexo, Date fechaNacimiento) {
        this.idAlumno = idAlumno;
        this.nombreApellido = nombreApellido;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Alumno() {
        this.idAlumno = 0;
        this.nombreApellido = "";
        this.sexo = "";
        this.fechaNacimiento = null;
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

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

}


