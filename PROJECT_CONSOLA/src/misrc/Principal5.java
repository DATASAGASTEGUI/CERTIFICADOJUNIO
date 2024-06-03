package misrc;

import circulo.Libreria;


public class Principal5 {


    public static void main(String[] args) {
        //char	charAt(int index)
        String texto = "En un puerto italiano";
        char letra = texto.charAt(0);
        
        //static String	valueOf(int i)
        int entero = 1234;
        String cadena = String.valueOf(entero);
        char digito = cadena.charAt(3);
        
        double numero = 1343.341234193492;
        System.out.println(Libreria.redondear(numero));
        Libreria x = new Libreria();
        System.out.println(x.redondear1(numero));
        //Math
    }
    
}
