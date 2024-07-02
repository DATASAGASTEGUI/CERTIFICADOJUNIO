package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private String idAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private List<String> asignaturas_al;

    //CONSTRUCTORES
    public Alumno() {
        this.idAlumno = "";
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.asignaturas_al = null;
    }

    public Alumno(String idAlumno, String nombre, String apellido, int edad, List<String> asignaturas_al) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.asignaturas_al = asignaturas_al;
    }

    //METODOS SET Y GET
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getAsignaturas_al() {
        return asignaturas_al;
    }

    public void setAsignaturas_al(List<String> asignaturas_al) {
        this.asignaturas_al = asignaturas_al;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", asignaturas_al=" + asignaturas_al + '}';
    }
    
    public static String cabecera() {
        String c = String.format("  %-2s %-6s %-8s\n","ID","NOMBRE","APELLIDO");
        return c;
    }
    
    public static String subrrayadoCabecera() {
        String c = String.format("  %-2s %-6s %-8s\n","--","------","--------");
        return c;
    }    
    
    public String cuerpo() {
        String c = String.format("  %-2s %-6s %-8s\n",idAlumno,nombre,apellido); 
        return c;        
    }

    //OTROS METODOS
    public void entrada(List<Alumno> alumnos_al) {
        Scanner sc = new Scanner(System.in);
        List<String> aux_al = new ArrayList<>();
        System.out.print("INGRESAR IDALUMNO?");
        idAlumno = sc.next();
        if (!Util.existeIdAlumno(idAlumno, alumnos_al)) {
            
            System.out.print("INGRESAR NOMMBRE?");
            nombre = sc.next();
            System.out.print("INGRESAR APELLIDO?");
            apellido = sc.next();
            
            edad = Util.leerEdad();
            int n = Util.leerNumeroAsignatura();
            
            for (int i = 0; i < n; i++) {
                System.out.println("INGRESE ASIGNATURA? ");
                aux_al.add(sc.next());
            }
            asignaturas_al = aux_al;
            
            Alumno alumno = new Alumno(idAlumno,nombre,apellido,edad,asignaturas_al);
            alumnos_al.add(alumno); //Guardar en la base de datos
            System.out.println("OK: ALUMNO SE AÑADIO CORRECTAMENTE");
        } else {
            System.out.println("ERROR: ALUMNO YA EXISTE");
        }
    }

}
