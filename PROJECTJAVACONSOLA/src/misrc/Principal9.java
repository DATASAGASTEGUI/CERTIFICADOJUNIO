package misrc;

import java.util.Scanner;

public class Principal9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double nota;
       
       System.out.print("Ingresa una nota? ");
       nota = sc.nextDouble();
       
       if(nota >= 4.5) {
           System.out.println("APROBADO");
       }else {
           System.out.println("SUSPENSO");
       }
       
       System.out.println("OPERADOR BINARIO 1");
       System.out.println((nota >= 4.5) ? "APROBADO" : "SUSPENSO");
       System.out.println("OPERADOR BINARIO 2");
       String resultado = (nota >= 4.5) ? "APROBADO" : "SUSPENSO";
       System.out.println(resultado);
       
       
       
    }
    
}
