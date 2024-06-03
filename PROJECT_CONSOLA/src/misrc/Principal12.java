package misrc;

import java.util.Scanner;

public class Principal12 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         //1. DECLARAR VARIABLES
         int num, v, val;
         //2. ENTRADA
         System.out.print("Ingrese numero entero? ");
         num = sc.nextInt();
         System.out.print("Ingrese valor v? ");
         v = sc.nextInt();
         //3. PROCESO
         switch(num) {
             case 1: val = 100 * v;  break;
             case 2: val = (int)Math.pow(100,v); break;
             case 3: val = 100 / v; break;
             default: val = 0; 
         }
         //4. SALIDA
         System.out.println("Val: " + val);
    }
    
}
