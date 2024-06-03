package misrc;

public class Principal1 {

    public static void main(String[] args) {
        char letra = 'A';
        System.out.println("Código ASCII: " + (int)letra);
        System.out.println("Código LETRA: " + letra);
        
        //IMPRIMIR LAS LETRAS DEL ALFABETO INGLES
        for(int i=65; i<=90; i++) {
            System.out.println((char)i);
        }
    }
    
}
