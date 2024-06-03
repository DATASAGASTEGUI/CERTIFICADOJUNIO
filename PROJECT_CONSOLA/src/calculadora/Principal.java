package calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        double numero1, numero2, resultado = 0;
        String operador;
        String[] operadores = {"+","-","*","/","#"};
        String[] descripcion = {"SUMA","RESTA","MULTIPLICACION","DIVISION","POTENCIA"};
        String patron = "[+-/*#]";
        //2. ENTRADA
        System.out.println("MENU\n----");
        for(int i=0; i<operadores.length; i++) {
            System.out.println(operadores[i] + " " + descripcion[i]);
        }
        do {
             System.out.print("ELEGIR OPERACION? ");
             operador = sc.next();
        }while(!operador.matches(patron));
        System.out.print("INGRESAR NUMERO 1? ");
        numero1 = sc.nextDouble();
        System.out.print("INGRESAR NUMERO 2? ");
        numero2 = sc.nextDouble();  
        //3. PROCESO
        switch(operador) {
            case "+": resultado = numero1 + numero2; break; 
            case "-": resultado = numero1 - numero2; break; 
            case "*": resultado = numero1 * numero2; break; 
            case "/": resultado = numero1 / numero2; break; 
            case "#": resultado = Math.pow(numero1, numero2); break; 
        }
        //4. SALIA
        System.out.println("RESULADO: " + resultado);
    }
    
    public void version1() {
        
    }
    
}
