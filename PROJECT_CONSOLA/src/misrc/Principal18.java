package misrc;


import java.util.Scanner;

public class Principal18 {

    public static void main(String[] args) {
        // Luis Miguel Carmen       [A-Z]{1}[a-z]+
        Scanner sc = new Scanner(System.in);//Caracteres con acento en la consola
        //Scanner sc = new Scanner(System.in, "windows-1252");
        //Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8.name());
        //1. DECLARAR VARIABLES
        String nombre;
        String patron = "[A-Z]{1}[a-záéíóú]+";
        //2. ENTRADA
        System.out.println("Ingrese su nombre? ");
        nombre = sc.nextLine();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //VALIDAR LA ENTRADA
        if (nombre.matches(patron)) {
            System.out.println("Nombre válido: " + nombre);
        } else {
            System.out.println("Nombre inválido: " + nombre);
        }

    }

}
