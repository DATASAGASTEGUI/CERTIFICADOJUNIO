package misrc;

public class Principal2 {

    public static void main(String[] args) {
        byte entero = 8;
        byte c1 = 8/2;
        byte r1 = 8%2;
        byte c2 = (byte)(c1/2);
        byte r2 = (byte)(c1%2);
        byte c3 = (byte)(c2/2);
        byte r3 = (byte)(c2%2);
        System.out.println("Binario: " + c3 + r3 + r2 + r1);
    }
    
}
