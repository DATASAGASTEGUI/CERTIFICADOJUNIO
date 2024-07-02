package pseint;

public class Ejemplo_1_3 {
    //VARIABLES INTANCIAS (ATRIBUTOS)
    private int a,b;
    
    //CONSTRUCTORES
    public Ejemplo_1_3() {
        this.a = 0;
        this.b = 0;
    }

    public Ejemplo_1_3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //METODOS SET Y GET
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
 
    //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo_1_3{" + "a=" + a + ", b=" + b + '}';
    }
    
    //METODOS OTROS
    
    public double resultado() {
        return Math.pow((a+b), 2)/3;
    }
    
    public void imprimirResultado() {
        System.out.printf("RESULTADO: %.2f", resultado());
    }
    
    public void entrada() {
        a = Entrada.leerInteger("INGRESAR A? ");
        b = Entrada.leerInteger("INGRESAR B? ");
    }
}
