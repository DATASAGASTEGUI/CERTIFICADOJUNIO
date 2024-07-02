package miclase;

public class Persona {

    String nombre;
    int edad;
    double estatura;
    char sexo;
    boolean casado;

    public Persona() {
    }

    public Persona(String nombre, int edad, double estatura, char sexo, boolean casado) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.sexo = sexo;
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", sexo=" + sexo + ", casado=" + casado + '}';
    }
   
    public void miToString() {
        System.out.println("Nombre  : " + this.nombre);
        System.out.println("Edad    : " + this.edad);
        System.out.println("Estaruta: " + this.estatura);
        System.out.println("Sexo    : " + this.sexo);
        System.out.println("Casado  : " + this.casado);
    }
    
    public void cabecera() {
        System.out.printf("%-13s %4s %8s %4s %6s\n","NOMBRE","EDAD","ESTATURA","SEXO","CASADO");
        System.out.printf("%-13s %4s %8s %4s %6s\n","------","----","--------","----","------");
    }
    
    public void cuerpo() {
         System.out.printf("%-13s %4d %8.2f %4s %6s\n",this.nombre,this.edad,this.estatura,this.sexo,this.casado);
    }


    
    


    
    
    
    
}
