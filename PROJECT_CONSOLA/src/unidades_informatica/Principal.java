package unidades_informatica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        int opcioni, opcionf, saltos;
        double base = 1024;
        double cantidad;
        // ENTRADA
        System.out.println("(1) BYTE");
        System.out.println("(2) KILO  BYTE");
        System.out.println("(3) MEGA  BYTE");
        System.out.println("(4) GIGA  BYTE");
        System.out.println("(5) TERA  BYTE");
        System.out.println("(6) PENTA BYTE");
        System.out.println("(7) EXA   BYTE");
        System.out.println("(8) ZETTA BYTE");
        System.out.println("(9) YOTTA BYTE");

        System.out.print("Ingrese unidad de partida? ");
        opcioni = sc.nextInt();
        System.out.print("Ingrese unidad de llegada? ");
        opcionf = sc.nextInt();
        System.out.print("Ingrese cantidad? ");
        cantidad = sc.nextDouble();
        // PROCESO
        opcioni = opcioni - 1; //6    6-1=5
        opcionf = opcionf - 1; //4    4-1=3
        saltos = opcionf - opcioni;   //positivo dividir, negativo multiplicar
        for (int i = 0; i < Math.abs(saltos); i++) {
            if (saltos > 0) {
                cantidad = cantidad / base;
            } else {
                cantidad = cantidad * base;
            }
        }
        // SALIDA
        System.out.println("Cantidad: " + cantidad);
    }
}
//https://discoveryformacion.com/calculadora-para-convertir-unidades-de-almacenamiento-informaticas/
