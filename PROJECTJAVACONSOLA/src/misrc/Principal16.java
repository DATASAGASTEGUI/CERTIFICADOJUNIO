package misrc;

import java.util.Scanner;

public class Principal16 {

    public static void main(String[] args) {
        //RECONOCER UN NUMERO ENTERO
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        int entero_numero;
        //2. ENTRADA
        System.out.println("Ingrese su edad? ");
        entero_numero = sc.nextInt();
        //3. PROCESO
        if (entero_numero >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

}
