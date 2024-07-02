package fecha;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

    public static void main(String[] args) {
        //ejemplo4(2024);
        /*
        Principal1 p = new Principal1();
        p.ejemplo5();
        */
        ejemplo6();
        
        /*
        LocalDate fechaActual = LocalDate.now();
        
        LocalDate primerDiaDelMes = LocalDate.of(fechaActual.getYear(), fechaActual.getMonth(), 1); //2024-06-01
        
        System.out.println("AÑO ACTUAL        : " + fechaActual.getYear()); //2024
        System.out.println("MES ACTUAL        : " + fechaActual.getMonth()); //JUNE
        System.out.println("DIA ACTUAL        : " + fechaActual.getDayOfMonth());//18
        System.out.println("DIA SEMANA        : " + fechaActual.getDayOfWeek());//TUESDAY = MARTES
        System.out.println("PRIMER DIA DEL MES: " + primerDiaDelMes); //2024-06-01
        
        System.out.println("A: " + fechaActual.lengthOfMonth());
        
        LocalDate fechaActual1 = LocalDate.of(2024, 5, 1);
        
        System.out.println("B: " + fechaActual1.lengthOfMonth());
*/
    }
    
    //RECUPERAR LA FECHA ACTUAL DEL SISTEMA Y FORMATEARLA
    public static void ejemplo1() {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormato = fechaActual.format(formato);
        System.out.println(fechaFormato);
    }
    
    //OBTENER EL DIA DE INICIO DEL MES
    public static void ejemplo2() {
        LocalDate fecha = LocalDate.of(2024, 6, 1);
        System.out.println(fecha.getDayOfWeek());
    }
    
    //OBTENER EL NUMERO DE DIAS DEL MES
    public static void ejemplo3() {
        LocalDate fecha = LocalDate.of(2024, 2, 1);
        System.out.println("Número dias del mes de mayo: " + fecha.lengthOfMonth());
    }
    
    //CREAR UNA TABLA CON LA CANTIDAD DE DIAS DE CADA MES
    public static void ejemplo4(int year) {
        System.out.println("AÑO: " + year);
        String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO",
                          "AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        System.out.printf("%-12s %4s %6s\n","DESCRIPCION","MES","DIAS");
        System.out.printf("%-12s %4s %6s\n","-----------","---","----");
        for(int i=1; i<=12; i++) {
            System.out.printf("%-12s %4d %6d\n",meses[i-1],i,obtenerNumeroDeDiasDeUnMes(i,year));
        }
    }
    
    //CREAR UNA TABLA CON LA CANTIDAD DE DIAS DE CADA MES DONDE EL AÑO SEA ALEATORIO
    public static void ejemplo5() {
        int year = (int)(Math.random()*125 + 1900); // [1900-2024]
        ejemplo4(year);
    }
    
    //EN BASE AL EJEMPLO 4 AGREGAR UNA COLUMNA QUE INDIQUE QUE DIA DE LA SEMANA EMPIEZA EL PRIMER DIA
    public static void ejemplo6() {
        int year = (int)(Math.random()*125 + 1900); // [1900-2024]
        System.out.println("AÑO: " + year);
        String[] meses = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO","JULIO",
                          "AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
        System.out.printf("%-12s %4s %6s %-12s\n","DESCRIPCION","MES","DIAS","DIA SEMANA");
        System.out.printf("%-12s %4s %6s %-12s\n","-----------","---","----","----------");
        for(int i=1; i<=12; i++) {
            System.out.printf("%-12s %4d %6d %-12s\n",meses[i-1],i,obtenerNumeroDeDiasDeUnMes(i,year),obtenerNombreDiaSemana(year, i));
        }        
    }
    
    public static int obtenerNumeroDeDiasDeUnMes(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }
    
    public static String obtenerNombreDiaSemana(int year, int numeroMes) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es")).toUpperCase();
        //fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.SIMPLIFIED_CHINESE);
    }
    
}
