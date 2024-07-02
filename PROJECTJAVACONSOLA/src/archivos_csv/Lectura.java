package archivos_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Lectura {

    public static void main(String[] args) {
        //LECTURA DE UN ARCHIVO TEXTO
        File f; //Convertir el archivo físico en objeto
        FileReader fr; //Abrir una caneleta de comunicación(origin-destino)
        BufferedReader br;//Leer
        String fila = "";
        int[] n1 = new int[6];
        int[] n2 = new int[6];
        int[] n3 = new int[6];
        int[] n4 = new int[6];

        try {
            f = new File("data/notas.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            int row = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] p = fila.split(";");
                    n1[row] = Integer.parseInt(p[0]);
                    n2[row] = Integer.parseInt(p[1]);
                    n3[row] = Integer.parseInt(p[2]);
                    n4[row] = Integer.parseInt(p[3]);
                    row++;
                }
                i++;
            }
            System.out.println(Arrays.toString(n1));
            System.out.println(Arrays.toString(n2));
            System.out.println(Arrays.toString(n3));
            System.out.println(Arrays.toString(n4));
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

}

