package circulo;

public class Libreria {
    
    public static final double MIPI = 3.141516;
    
    public static double redondear(double entrada) {
        double x = (entrada + 0.005) * 100;
        double y = (int)x / 100.0;
        return y;
    }
    
    public double redondear1(double entrada) {
        double x = (entrada + 0.005) * 100;
        double y = (int)x / 100.0;
        return y;
    }    
    
}
