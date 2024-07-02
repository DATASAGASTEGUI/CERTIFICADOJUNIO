package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Probando {

    public static void main(String[] args) {
        String[] turnos_v = {"M", "M", "M", "M", "T", "T", "T", "T"};
        String[] nombres_v = {"Luis", "Miguel", "Carlos", "Carmen", "Arturo", "Gerson", "Delly", "María"};
        Double[] sueldos_v = {1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0};

        System.out.println(Arrays.toString(turnos_v)); //[M, M, M, M, T, T, T, T]
        System.out.println(Arrays.toString(nombres_v)); //[Luis, Miguel, Carlos, Carmen, Arturo, Gerson, Delly, María]
        System.out.println(Arrays.toString(sueldos_v)); //[1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0]

        List<String> turnos1_al = (List<String>) Arrays.asList(turnos_v);
        List<String> nombres1_al = (List<String>) Arrays.asList(nombres_v);
        List<Double> sueldos1_al = (List<Double>) Arrays.asList(sueldos_v);
        
        System.out.println(Arrays.asList(turnos1_al)); //[[M, M, M, M, T, T, T, T]]
        System.out.println(Arrays.asList(nombres1_al)); //[[Luis, Miguel, Carlos, Carmen, Arturo, Gerson, Delly, María]]
        System.out.println(Arrays.asList(sueldos1_al)); //[[1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0]]

        List<String> turnos_al = new ArrayList<String>(turnos1_al);
        List<String> nombres_al = new ArrayList<String>(nombres1_al);
        List<Double> sueldos_al = new ArrayList<Double>(sueldos1_al);
        
        System.out.println(Arrays.asList(turnos_al)); //[[M, M, M, M, T, T, T, T]]
        System.out.println(Arrays.asList(nombres_al)); //[[Luis, Miguel, Carlos, Carmen, Arturo, Gerson, Delly, María]]
        System.out.println(Arrays.asList(sueldos_al)); //[[1000.0, 900.0, 800.0, 1210.0, 1000.0, 920.0, 850.0, 1500.0]]        
    }

}
