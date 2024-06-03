package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_5 {

    public static void main(String[] args) {
       //versionEstructurada();
       versionPOO2();
    }

    public static void versionEstructurada() {
        Scanner sc = new Scanner(System.in);
        //DECLARAR VARIABLES
        int num, cua, cub;
        //ENTRADA
        System.out.print("INGRESAR NUMERO? ");
        num = sc.nextInt();
        //PROCESO
        cua = (int) Math.pow(num, 2);//25.0   64.0    9.0
        cub = (int) Math.pow(num, 3);
        //SALIDA
        System.out.println("CUADRADO: " + cua);
        System.out.println("CUBO: " + cub);
    }
    
    public static void versionPOO1() {
        Ejemplo_1_5 objeto = new Ejemplo_1_5((int)(Math.random()*10+1));
        System.out.println("NUMERO: " + objeto.getNum());
        System.out.println("CUADRADO: " + objeto.cuadrado());
        System.out.println("CUBO: " + objeto.cubo());
    }
    
    public static void versionPOO2() {
        Scanner sc = new Scanner(System.in);
        //ENTRADA
        System.out.print("INGRESAR NUMERO? ");
        int num = sc.nextInt();

        Ejemplo_1_5 objeto = new Ejemplo_1_5(num);
        
        System.out.println("NUMERO: " + objeto.getNum());
        System.out.println("CUADRADO: " + objeto.cuadrado());
        System.out.println("CUBO: " + objeto.cubo());
    }    
}
