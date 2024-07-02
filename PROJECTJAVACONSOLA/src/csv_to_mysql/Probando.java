package csv_to_mysql;

import java.util.ArrayList;
import java.util.List;

public class Probando {

    public static void main(String[] args) {
        List<String> nombres_al = new ArrayList<>();
        
        nombres_al.add("Miguel");
        nombres_al.add("Carlos");
        
        if(nombres_al.contains("Carla")) {
            System.out.println("SI ESTA");
        }else {
            System.out.println("NO ESTA");
        }
        
        String s = nombres_al.get(1);
        System.out.println("Elemento: " + s);
        
        
        
        //ArrayList<String> clonedList = (ArrayList<String>) nombres_al.clone();
        
        
        
        nombres_al.clear();
        
        if(nombres_al.isEmpty()) {
            System.out.println("ESTA VACIA");
        }else {
            System.out.println("NO ESTA VACIA");
        }
        
    }
    
}
