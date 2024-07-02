package resumen;

public class PrincipalTriangulo1 {

    public static void main(String[] args) {
        double base, altura;

        Triangulo.cabecera();
        
        for (int i = 0; i < 100; i++) {
            base = (int) (Math.random() * 10000 + 1);// [1,1000]
            altura = (int) (Math.random() * 10000 + 1);
            Triangulo t = new Triangulo(base, altura);
            t.cuerpo(i + 1);
        }
    }

}
