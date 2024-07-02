package proyecto_calendario;

import javax.swing.JTextArea;


public class Controlador {
    
    public static void mostrarCalendarioDeUnMes() {
        System.out.println("(1) MOSTRAR EL CALENDARIO DE UN MES");
        System.out.println("-----------------------------------");
        
        int year = Entrada.leerYear("INGRESAR YEAR? ");
        int mes = Entrada.leerMes("INGRESAR MES? ");
        
        Calendario calendario = new Calendario(year,mes);
        int[][] matriz = calendario.obtenerMatrizMes();
        
        VentanaSalida vs = new VentanaSalida("MES");
        JTextArea txaContenido = vs.getTextArea();
        
        Calendario.imprimirMatriz(matriz, txaContenido);
        
        
    }
    
    
}
