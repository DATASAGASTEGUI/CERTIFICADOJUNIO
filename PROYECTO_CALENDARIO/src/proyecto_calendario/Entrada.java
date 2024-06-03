package proyecto_calendario;

import java.util.Scanner;

public class Entrada {
    
    static Scanner sc = new Scanner(System.in);
    
    public static int leerOpcion(String mensaje) {
        String patron = "[1234]";
        boolean correcto;
        String opcion;
        do {
            System.out.print(mensaje);
            opcion = sc.next();
            correcto = opcion.matches(patron);//true
            if (!correcto) {
                System.out.println("ERROR: ENTRADA");
            }
        }while(!correcto);
        return Integer.parseInt(opcion);
    }
    
    public static int leerYear(String mensaje) {
        String patron = "19[0-9]{2}|20[0-9]{2}";  //[1900-2099]
        boolean correcto;
        String year;
        do {
            System.out.print(mensaje);
            year = sc.next();
            correcto = year.matches(patron);//true
            if (!correcto) {
                System.out.println("ERROR: ENTRADA");
            }
        }while(!correcto);
        return Integer.parseInt(year);
    }

    public static int leerMes(String mensaje) {
        String patron = "[1-9]|1[012]";  //[1-12] 123456789    10 11 12
        boolean correcto;
        String mes;
        do {
            System.out.print(mensaje);
            mes = sc.next();
            correcto = mes.matches(patron);//true
            if (!correcto) {
                System.out.println("ERROR: ENTRADA");
            }
        }while(!correcto);
        return Integer.parseInt(mes);
    }    
    
}
