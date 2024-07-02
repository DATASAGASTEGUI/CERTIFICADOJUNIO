package variable_static;

public class Alumno {
    //VARIABLES STATIC
    static int contador = 0;
    
    //VARIABLES DE INSTANCIA
    private String id;
    private String nombre;

    public Alumno() {
        this.id = generarClave(); //++contador;
        this.nombre = "";
    }

    public Alumno(String nombre) {
        this.id = generarClave(); //++contador;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String generarClave() {
        return "A" + (++contador);
    }
    
    
}
