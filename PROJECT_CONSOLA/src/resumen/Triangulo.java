package resumen;

public class Triangulo {

    //1. ATRIBUTOS INSTANCIA
    private double base;
    private double altura;

    //2. CONSTRUCTORES
    public Triangulo() {
        this.base = 0.0;
        this.altura = 0.0;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //3. METODOS SET Y GET 
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    //4. METODO TOSTRING
    @Override
    public String toString() {
        return "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    //5. METODOS OTROS
    public double area() { //Método de instancia o de objeto
        return this.base * this.altura / 2;
    }

    public static void cabecera() {//Método de clase
        System.out.printf("%5s  %6s  %6s  %15s\n", "N", "BASE", "ALTURA", "AREA");
        System.out.printf("%5s  %6s  %6s  %15s\n", "-", "----", "------", "----");
    }

    public void cuerpo(int i) {//Método de instancia
        System.out.printf("%5d  %6d  %6d  %15s\n", i, base, altura, area());
    }

}
