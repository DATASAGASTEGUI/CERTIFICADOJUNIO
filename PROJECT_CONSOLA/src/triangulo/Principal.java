package triangulo;

import circulo.Libreria;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.DECLARACION VARIABLES
        double base, altura, area;
        //2.ENTRADA
        System.out.print("Ingresar base? ");
        base = sc.nextDouble();
        System.out.print("Ingresar altura? ");
        altura = sc.nextDouble();
        //3.PROCESO
        area = base * altura / 2;
        //4.SALIDA
        System.out.println("Area: " + Libreria.redondear(area));
    }
}
/*
TRIANGULO
---------
ENTRADA: base, altura
SALIDA : area

PROCESO:
area = base * altura / 2
*/
