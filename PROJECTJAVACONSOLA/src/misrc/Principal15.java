package misrc;

import java.util.Scanner;

public class Principal15 {

    public static void main(String[] args) {
       //RECONOCER UN NUMERO ENTERO
       Scanner sc = new Scanner(System.in);
       //1. DECLARAR VARIABLES
       int entero_numero; //343
       String entero_texto; //"343"
       String patron = "[0-9]+";
       //2. ENTRADA
       System.out.println("Ingrese su edad? ");
       entero_texto = sc.next();
       //VALIDAR LA ENTRADA
       if(entero_texto.matches(patron)) {
          System.out.println("ES UN NUMERO ENTERO");
          entero_numero = Integer.parseInt(entero_texto);
          //3. PROCESO
          if(entero_numero >= 18) {
             System.out.println("Mayor de edad");
          }else {
             System.out.println("Menor de edad"); 
          }
       }else {
          System.out.println("NO ES UN NUMERO ENTERO"); 
       }
       
    }
    
}
