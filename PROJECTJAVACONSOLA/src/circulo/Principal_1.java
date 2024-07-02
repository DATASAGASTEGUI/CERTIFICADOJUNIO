package circulo;

import java.util.Scanner;

public class Principal_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARACION VARIABLES
        double radio, area, perimetro;
        //2. ENTRADA
        System.out.print("Ingrese radio? ");
        radio = sc.nextDouble();
        //3. PROCESO
        area = Libreria.MIPI * Math.pow(radio, 2);
        perimetro = 2 * Libreria.MIPI * radio;
        //4. SALIDA
        System.out.println("Area     : " + Libreria.redondear(area));
        System.out.println("Perimetro: " + Libreria.redondear(perimetro));
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

