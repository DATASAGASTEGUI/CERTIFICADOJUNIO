package unidades_informatica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        int opcioni, opcionf;
        double cantidad;
        String[] unidades = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETA BYTE", "YOTTA BYTE"};
        int[] unidadesx = {0,0,0,0,0,0,0,0,0};
        //2. ENTRADA
        System.out.println("CONVERSION UNIDADES INFORMATICAS");
        System.out.println("--------------------------------");
        System.out.println("(1) BYTE");
        System.out.println("(2) KILO  BYTE");
        System.out.println("(3) MEGA  BYTE");
        System.out.println("(4) GIGA  BYTE");
        System.out.println("(5) TERA  BYTE");
        System.out.println("(6) PETA  BYTE");
        System.out.println("(7) EXA   BYTE");
        System.out.println("(8) ZETTA BYTE");
        System.out.println("(9) YOTTA BYTE");

        System.out.println();

        System.out.print("INGRESE UNIDAD DE PARTIDA? ");
        opcioni = sc.nextInt() - 1;
        System.out.print("INGRESE CANTIDAD EN " + unidades[opcioni] + "? ");
        cantidad = sc.nextDouble();
        
        //3. PROCESO - 4. SALIDA
        unidadesx[opcioni] = 1;
        for(int i=0; i<unidadesx.length; i++) {
            if(unidadesx[i] != 1) {
                opcionf = i;
                System.out.printf("%10s : %30s\n", unidades[opcionf], conversion(opcioni,opcionf,cantidad));
            }
        }
    }
    
    public static String conversion(int opcioni, int opcionf, double cantidad) {
        int saltos = opcionf - opcioni;   //positivo dividir, negativo multiplicar
        if (saltos > 0) {
            cantidad = cantidad / Math.pow(2, (Math.abs(saltos) * 10));
        } else {
            cantidad = cantidad * Math.pow(2, (Math.abs(saltos) * 10));
        }

        // Crear un formato para mostrar el número con 10 decimales
        DecimalFormat df = new DecimalFormat("0.000000000000000000000000000000");//9.765625E-4;
        // Formatear el número
        String numeroFormateado = df.format(cantidad);
        return numeroFormateado;
    }

}