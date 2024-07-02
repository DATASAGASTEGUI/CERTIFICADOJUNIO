package archivos_csv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Escritura {

    public static void main(String[] args) {
        //ESCRITURA DE UN ARCHIVO TEXTO
        File f; //Convertir el archivo físico en objeto
        FileWriter fw; //Abrir una caneleta de comunicación(origin-destino)
        BufferedWriter bw;//Escribir
        String fila = "";
        
        int[] n1 = {2,4,5};
        int[] n2 = {1,2,4};
        int[] n3 = {7,8,2};
        int[] n4 = {1,1,1};
        
        try {
            f = new File("data/notas.csv");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);//Escribir
            
            for(int i=0; i<n1.length; i++) {
                fila = n1[i] + ";" + n2[i] + ";" + n3[i] + ";" +n4[i];//csv
                bw.write(fila + "\r\n");
            }
            bw.flush();//Grabar en disco(archivo)
        }catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
}
