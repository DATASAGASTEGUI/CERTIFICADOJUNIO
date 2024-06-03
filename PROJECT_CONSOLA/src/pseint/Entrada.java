package pseint;

import java.util.Scanner;

public class Entrada {

    public static double leerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "([0-9]{1,2})|([0-9]{1,2}\\.[0-9]{1,2})";
        boolean correcto;
        String calificacion;
        do {
            System.out.print(mensaje);
            calificacion = sc.next();
            correcto = calificacion.matches(patron) &&
                       Double.parseDouble(calificacion) >= 0 &&
                       Double.parseDouble(calificacion) <= 10;
            if (!correcto) {
                System.out.println("ERROR: ENTRADA");
            }
        } while (!correcto);
        return Double.parseDouble(calificacion);
    }
    
    public static int leerInteger(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+";
        boolean correcto;
        String entero;
        do {
            System.out.print(mensaje);
            entero = sc.next();
            correcto = entero.matches(patron);
            if (!correcto) {
                System.out.println("ERROR: ENTRADA");
            }
        } while (!correcto);
        return Integer.parseInt(entero);
    }    
}
