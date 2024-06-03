package misrc;

import java.util.Scanner;

public class Principal7 {

    public static void main(String[] args) {
        //Scanner es una clase, variable sc objeto
        //next() es un método que se obtiene del objeto sc
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese número real? ");
        String numero = sc.next(); //sc.nextDouble()
        
        //Math es una clase
        //pow es un método
        //Double es una clase
        //parseDouble es un método
        double cuadrado = Math.pow(Double.parseDouble(numero),2);
        System.out.println("Cuadrado: " + cuadrado);

        
    }
    
}
