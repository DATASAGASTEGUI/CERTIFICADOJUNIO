package for_1;

public class Principal2 {

    public static void main(String[] args) {
        int[] enteros = {3, 2, 1, 4};
        //RECORRER UN VECTOR POR INDICE
        for(int i=0; i<enteros.length; i++) {//0 1 2 3
            System.out.println(i + "\t" + enteros[i]);
        }
        Object[] datos = {"Luis",23,1.72,true,'H'};
        for(int i=0; i<datos.length; i++) {//0 1 2 3
            System.out.println(i + "\t" + datos[i]);
        }
        
    }
    
}
