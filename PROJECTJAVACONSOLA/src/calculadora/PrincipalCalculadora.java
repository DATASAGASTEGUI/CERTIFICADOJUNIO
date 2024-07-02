package calculadora;

public class PrincipalCalculadora {

    public static void main(String[] args) {
        version1();
    }

    public static void version1() {
        Calculadora.cabecera(0);
        for (int i = 0; i < 100; i++) {
            double numero1 = aleatorio();
            double numero2 = aleatorio();
            String operador = operadorAleatorio();
            Calculadora calculadora = new Calculadora(numero1, numero2, operador);
            calculadora.cuerpo((i + 1));
        }
    }

    public static double aleatorio() {
        int parteEntera = (int) (Math.random() * 100 + 1);  //[1,100]
        int parteDecimal = (int) (Math.random() * 90 + 10); //   [10,99]  100-10=90
        double numeroReal = Double.parseDouble(parteEntera + "." + parteDecimal);
        return numeroReal;
    }

    public static String operadorAleatorio() {
        //  0   1   2   3   4    [0,4] 5-0=5
        String[] operador = {"+", "-", "/", "*", "#"};
        int a = (int) (Math.random() * 5);
        return operador[a];
    }
}
