package misrc;

import java.util.Scanner;

public class Principal13 {

    public static void main(String[] args) {
      //INGRESAR GRADOS CENTIGRADOS Y CONVERTILOS A FARENHEIT 
      Scanner sc = new Scanner(System.in);
      //1. DECLARAR VARIABLES
      double f, c;
      //2. ENTRADA
      System.out.print("Ingresar grados farenheit? ");
      f = sc.nextDouble();
   
      //3. PROCESO
      c = (f - 32) * (5/(double)9);//ERROR SEMANTICO 45  QUE 45.0
      //c = (f - 32) * 5/9.0;
      //4. SALIDA
      System.out.println("Centigrados: " + c);
    }
    
}
