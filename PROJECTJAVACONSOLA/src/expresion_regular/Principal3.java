package expresion_regular;

import java.util.Scanner;

public class Principal3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo13();
    }

    // VALIDAR UN NUMERO ENTERO
    public static void ejemplo1() {
        String cadena = "";
        String patron = "\\d+";  //  1. "\\d+"  2. "[0-9]+"
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO ES UN NUMERO ENTERO VUELVA A INGRESAR");
            }
        } while (!correcto);
    }

    // VALIDAR UNA CADENA QUE NO TEGA NINGUN DIGITO
    public static void ejemplo2() {
        String cadena = "";
        String patron = "\\D+";  //  1. "\\D+"  2. "[^0-9]+"
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("TIENE UN DIGITO VUELVA A INGRESAR");
            }
        } while (!correcto);
    }

    // VALIDAR UNA CADENA QUE NO TEGA ESPACIOS EN BLANCO
    public static void ejemplo3() {
        String cadena = "";
        String patron = "\\S+";  //  1. "\\S
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("TIENE ESPACIOS EN BLANCO VUELVA A INGRESAR");
            }
        } while (!correcto);
    }

    // ELIMINAR MUCHOS ESPACIOS EN BLANCO REMPLAZARLO CON UN SOLO ESPACIO
    public static void ejemplo4() {
        String cadena = "";
        String patron = "\\s+"; //De uno a mas espacios en blanco
        String cadenaSinEspacios;
        System.out.print("Ingrese una cadena? ");
        cadena = sc.nextLine(); // Walter          Ismael      Sagastegui                     Lescano
        cadenaSinEspacios = cadena.replaceAll(patron, "X");
        System.out.println(cadena);
        System.out.println(cadenaSinEspacios);
    }

    // ELIMINAR NUMEROS(REPLAZARLOS POR ALGO)
    public static void ejemplo5() {
        String cadena = "";
        String patron = "\\d+";
        String cadenaLimpia;
        cadena = "Luis tiene 25 años y Carmen 22 y sus telefonos 634533111 y 8383888";
        cadenaLimpia = cadena.replaceAll(patron, "XXXX");
        System.out.println(cadena);
        System.out.println(cadenaLimpia);
    }

    public static void ejemplo6() {
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        String patron = "(?<!^)(?=[A-Z])";
        String cadenaConEspacios;

        System.out.print("Ingrese una cadena: ");
        cadena = scan.nextLine();  // Ejemplo: MihaiIoniMatei
        cadenaConEspacios = cadena.replaceAll(patron, " ");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Resultado: " + cadenaConEspacios);
    }

    // ER que coincida con cadenas que inician en 'ab' y continuan con cero o mas caracteres cualquiera:      ab.*
    public static void ejemplo7() {
        String cadena = "";
        String patron = "ab.*";   //a.*b    .*=    Luis   \n\r(Enter)
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO CUMPLE CON EL PATRON VUELVA A INGRESAR");
            }
        } while (!correcto);
    }

    // BUSCAR UNA PALABRA(ERROR) EN UN TEXTO 
    public static void ejemplo8() {
        String texto = "";
        String textocorrecto = "";
        boolean correcto;
        String patron = ".*ERROR.*";
        String patron1 = "ERROR";
        texto = "En un puerto italERRORiano al pie de la montaña";
        correcto = texto.matches(patron);
        if (correcto) {
            textocorrecto = texto.replaceAll(patron1, "");
        }
        System.out.println(texto);
        System.out.println(textocorrecto);

    }
    // VALIDAR UN AÑO 1916  1917  1918  2000   2001  2002   2003
    public static void ejemplo9() {
        String cadena = "";
        String patron = "(191[6-8]|200[0123])"; //1916  1917  1918  2000   2001  2002   2003 
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO CUMPLE CON EL PATRON VUELVA A INGRESAR");
            }
        } while (!correcto);
    }
    
    //HACER UN PROGRAMA QUE GENERE UN PASSWORD ALEATORIO
    //DE 8 CARACTERES. DEB INCLUIR SOLAMENTE LOS SIGUIENTES
    //CARACTERS "A-Z 0-9 ? = # & %"
    //ADEMAS EL PROGRAMA DEBE VALIDAR SI SOLAMENTE TIENE
    //LETRAS SERA CONSIDERA INCORRECTO EL PASSWORD
    /*
    String[] password = {"","","",""...};
                       0123456789                            37
    String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ01234568?=#&%";

    simbolos.charAt(9);
    */
    
    public static void ejemplo10() {
        String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
        int longitud = simbolos.length(); //[0,longitud-1]
        char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
        String clave = "";
        String patron = "[A-ZÑ]{8}";
        for(int i=0; i<8; i++) {
            int na = (int)(Math.random()*longitud);
            char letra = simbolos.charAt(na);
            System.out.print(letra + "  ");
            password[i] = letra;
        }
        clave = String.valueOf(password);
        if(clave.matches(patron)) {
               System.out.println(clave + " CLAVE INCORRECTA");
        }else {
               System.out.println(clave + " CLAVE CORRECTA");
        }
    }
	
	// GENERAR UNA CONTRASEÑA CUMPLIENDO EL PATRON
    public static void ejemplo11() {
        String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
        int longitud = simbolos.length(); //[0,longitud-1]
        char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
        String clave = "";
        String patron = "[A-ZÑ]{8}";
        do {
            for(int i=0; i<8; i++) {
                int na = (int)(Math.random()*longitud);
                char letra = simbolos.charAt(na);
                System.out.print(letra + "  ");
                password[i] = letra;
            }
            clave = String.valueOf(password);
        }while(clave.matches(patron));//Verdadero se repite
        System.out.println(clave);
    }

	// GENERAR UNA CONTRASEÑA CUMPLIENDO EL PATRON Y TENGA COMO MINIO 8 Y MAXIMO 12
    public static void ejemplo12() {
        String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
        int[] tamano = {8,9,10,11,12};//[0 1 2 3 4]
        int ta = (int)(Math.random()*tamano.length);
        int longitud = simbolos.length(); //[0,longitud-1]
        char[] password = new char[tamano[ta]];
        String clave = "";
        String patron = "[A-ZÑ0123456789]{" + tamano[ta] + "}";
        do {
            for(int i=0; i<tamano[ta]; i++) {
                int na = (int)(Math.random()*longitud);
                char letra = simbolos.charAt(na);
                //System.out.print(letra + "  ");
                password[i] = letra;
            }
            clave = String.valueOf(password);
        }while(clave.matches(patron));//Verdadero se repite
        System.out.println(clave);
    }	
    
	//ER que reconozca números enteros positivos y negativos
    public static void ejemplo13() {
        String cadena = "";
        String patron = "[-+]?[0-9]+";  
        boolean correcto;
        do {
            System.out.print("Ingrese una cadena? ");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO ES UN NUMERO ENTERO VUELVA A INGRESAR");
            }
        } while (!correcto);
    }


}
