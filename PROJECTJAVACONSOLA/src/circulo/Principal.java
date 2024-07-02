package circulo;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARACION VARIABLES
        double radio, area, perimetro;
        //2. ENTRADA
        System.out.print("Ingrese radio? ");
        radio = sc.nextDouble();
        //3. PROCESO
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        //4. SALIDA
        System.out.println("Area     : " + Libreria.redondear(area));
        System.out.println("Perimetro: " + Libreria.redondear(perimetro));
        
        System.out.printf("%9s %6.2f\n", "Area     : ", area);
        System.out.printf("%9s %6.2f\n", "Perimetro: ", perimetro);        
    }
}
/*
CIRCULO
-------
ENTRADA: radio
SALIDA : area, perimetro

PROCESO
area      = pi * r^2
perimetro = 2 * pi * r
*/

