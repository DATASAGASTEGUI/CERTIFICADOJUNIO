package pseint;

import java.util.Scanner;

public class Ejemplo_1_4 {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private String codigo;
    private double c1, c2, c3, c4, c5;
    //CONSTRUCTORES

    public Ejemplo_1_4() {
        this.codigo = "";
        this.c1 = 0.0;
        this.c2 = 0.0;
        this.c3 = 0.0;
        this.c4 = 0.0;
        this.c5 = 0.0;
    }

    public Ejemplo_1_4(String codigo, double c1, double c2, double c3, double c4, double c5) {
        this.codigo = codigo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
    }

    //METODOS SET Y GET
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }

    public double getC4() {
        return c4;
    }

    public void setC4(double c4) {
        this.c4 = c4;
    }

    public double getC5() {
        return c5;
    }

    public void setC5(double c5) {
        this.c5 = c5;
    }

    //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo_1_4{" + "codigo=" + codigo + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + ", c4=" + c4 + ", c5=" + c5 + '}';
    }
    
    //METODOS OTROS
    public double promedio() {
        return (c1+c2+c3+c4+c5)/5;
    }
    
    public static void cabecera() {
        System.out.printf("%6s %8s %10s\n","CODIGO","PROMEDIO","REDONDEADO");
        System.out.printf("%6s %8s %10s\n","------","--------","----------");
    }
    
    public void cuerpo() {
        System.out.printf("%6s %8.2f %10.0f\n",codigo,promedio(),promedio());
    }
    
    public void entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESAR CODIGO MATRICULA? ");
        codigo = sc.next();
        c1 = Entrada.leerDouble("INGRESAR CALIFICACION 1?");
        c2 = Entrada.leerDouble("INGRESAR CALIFICACION 2?");
        c3 = Entrada.leerDouble("INGRESAR CALIFICACION 3?");
        c4 = Entrada.leerDouble("INGRESAR CALIFICACION 4?");
        c5 = Entrada.leerDouble("INGRESAR CALIFICACION 5?");
    }
    
   
}
