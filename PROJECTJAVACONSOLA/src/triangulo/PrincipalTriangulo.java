package triangulo;

import java.util.Scanner;

public class PrincipalTriangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.DECLARACION VARIABLES
        double base, altura;
        //2.ENTRADA
        System.out.print("Ingresar base? ");
        base = sc.nextDouble();
        System.out.print("Ingresar altura? ");
        altura = sc.nextDouble(); 
        //CREAR UN OBJETO
        Triangulo triangulo1 = new Triangulo(base,altura);
        System.out.println(triangulo1);
        System.out.println(triangulo1.area());
        triangulo1.setAltura(10);
        System.out.println(triangulo1.area());
        
        Triangulo triangulo2 = new Triangulo();
        triangulo2.setBase(8);
        triangulo2.setAltura(2);
        System.out.println(triangulo2.area());
        System.out.println("Altura: " + triangulo2.getAltura());
        
        
        

        
        
        
        
        
        
    }
    
}
