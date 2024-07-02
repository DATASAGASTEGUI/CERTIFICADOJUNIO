package csv_to_mysql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MetodoArchivo {

    public static void crearArchivo(String rutaNombreArchivo) { //"data/masculino.txt"
        File f = new File(rutaNombreArchivo);
        if (f.exists()) {
            System.out.println("ARCHIVO EXISTE");
        } else {
            try {
                if (f.createNewFile()) {
                    System.out.println("OK: ARCHIVO CREADO");
                } else {
                    System.out.println("ERROR: ARCHIVO CREADO");
                }
            } catch (IOException ex) {
                System.out.println("MENSAJE: " + ex.getMessage());
            }
        }
    }

    public static void escribirArchivo(String rna, List<String> nombres_al) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File(rna);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (String nombre : nombres_al) {
                bw.write(nombre + "\r\n");//MEMORIA RAM
            }
            bw.flush();//DISCO
            System.out.println("OK: ESCRIBIR ARCHIVO " + rna);
        } catch (Exception e) {
            System.out.println("ERROR: ESCRIBIR ARCHIVO " + e.getMessage());
        }
    }

    public static List<String> obtenerListaNombresHombre(String rna) {
        List<String> hombres_al = new ArrayList<>();
        File f;
        FileReader fr;
        BufferedReader br;
        String fila = "";

        try {
            f = new File(rna);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((fila = br.readLine()) != null) {
                if (fila.equals("Nombres Femeninos:")) {
                    break;
                } else {
                    if (!fila.equals("Nombres Masculinos:")) {
                        hombres_al.add(fila);
                    }
                    continue;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: ESCRIBIR ARCHIVO " + e.getMessage());
        }
        return hombres_al;
    }

    public static List<String> obtenerListaNombresMujer(String rna) {
        List<String> mujeres_al = new ArrayList<>();
        File f;
        FileReader fr;
        BufferedReader br;
        String fila = "";
        try {
            f = new File(rna);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            boolean entro = false;
            while ((fila = br.readLine()) != null) {
                if (fila.equals("Nombres Femeninos:")) {
                    entro = true;
                    continue;
                }
                if (entro == true) {
                    mujeres_al.add(fila);
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: ESCRIBIR ARCHIVO" + e.getMessage());

        }
        return mujeres_al;
    }
    
    public static String obtenerFechaNacimientoAleatorio() {
        String fecha = "";
        int yearAleatorio = (int)(Math.random()*21 + 1980);  //[1980 - 2000]
        int mesAleatorio = (int)(Math.random()*12 + 1); //[1 - 12]
        LocalDate fechaAux = LocalDate.of(yearAleatorio, mesAleatorio, 1);
        int diasAleatorio = (int)(Math.random()*fechaAux.lengthOfMonth() + 1); //[1 - fechaAux.lengthOfMonth()]
        String da = String.format("%02d", diasAleatorio);
        String ma = String.format("%02d", mesAleatorio);
        /*
        String da = "";
        if(diasAleatorio < 10) {
           da = "0" + diasAleatorio;
        }else {
           da = "" + diasAleatorio;
        }
        String ma = "";
        if(mesAleatorio < 10) {
           ma = "0" + mesAleatorio;
        }else {
           ma = "" + mesAleatorio;
        }        
        */
        
        
        fecha = yearAleatorio+"-"+ma+"-"+da;
        return fecha;
    }

    
    
    
    
}
