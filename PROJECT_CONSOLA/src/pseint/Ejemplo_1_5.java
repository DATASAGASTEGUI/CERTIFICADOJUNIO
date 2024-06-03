package pseint;

public class Ejemplo_1_5 {
    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private int num;
    //CONSTRUCTORES

    public Ejemplo_1_5() {
        this.num = 0;
    }

    public Ejemplo_1_5(int num) {
        this.num = num;
    }
    
    //METODOS SET Y GET

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    //METODO TOSTRING

    @Override
    public String toString() {
        return "Ejemplo_1_5{" + "num=" + num + '}';
    }
    
    //METODOS OTROS
    public int cuadrado() {
        return (int)Math.pow(num,2);
    }
    
    public int cubo() {
        return (int)Math.pow(num,3);
    }
}
