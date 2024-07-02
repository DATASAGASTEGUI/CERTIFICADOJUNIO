package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_4 {

    public static void main(String[] args) {
       //versionEstructurada();
       versionPOO1();
    }
    
    public static void versionEstructurada() {
        Scanner sc = new Scanner(System.in);
        //DECLARAR VARIABLES
        String codigo;
        double c1,c2,c3,c4,c5,promedio;
        //ENTRADA
        System.out.print("INGRESAR CODIGO MATRICULA? ");
        codigo = sc.next();
        System.out.print("INGRESAR CALIFICACION 1? ");
        c1 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 2? ");
        c2 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 3? ");
        c3 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 4? ");
        c4 = sc.nextDouble();
        System.out.print("INGRESAR CALIFICACION 5? ");
        c5 = sc.nextDouble();        
        //PROCESO
        promedio = (c1+c2+c3+c4+c5)/5;
        //SALIDA
        System.out.println("CODIGO    : " + codigo);
        System.out.println("PROMEDIO  : " + promedio);
        System.out.printf("REDONDEADO: %.0f", promedio);
        
        System.out.println();
        
        System.out.printf("CODIGO    : %5s\n"
                        + "PROMEDIO  : %5.2f\n"
                        + "REDONDEADO: %5.0f\n",codigo,promedio,promedio);
    }
    
    public static void versionPOO1() {
         Ejemplo_1_4 objeto = new Ejemplo_1_4();
         objeto.entrada();
         
         Ejemplo_1_4.cabecera(); // static: clase o instancia
         objeto.cuerpo();
    }
    
}
