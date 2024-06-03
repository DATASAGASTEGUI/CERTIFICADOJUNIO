package misrc;

public class Principal10 {


    public static void main(String[] args) {
        //DECLARACION DE LAS VARIABLES (ANALISIS)
        double[] vectorsueldo = {1500.50, 1200.30, 900.00, 2500.38, 1800.8, 
                                 800.02, 1200.04, 2100.04, 1750.08, 1234.8};
        double nomina = 0; //Acumulador
        //PROCESO
        for(double sueldo: vectorsueldo) {
            nomina = nomina + sueldo;
        }
        //SALIDA
        System.out.println("TOTAL NOMINA: " + nomina);
    }
}
