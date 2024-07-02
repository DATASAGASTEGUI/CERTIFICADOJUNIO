package csv_to_mysql;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Principal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //4. LLENAR UN ARRAYLIST CON LOS NOMBRES(HOMBRE Y MUJER)
        List<String> nombres_al = new ArrayList<>();
        List<String> apellidos_al = new ArrayList<>();
        
        List<String> hombres_al = new ArrayList<>();
        List<String> mujeres_al = new ArrayList<>();

        //LEER ARCHIVO HOMBRES.
        File f;
        FileReader fr;
        BufferedReader br;

        String nombre = "";
        try {
            f = new File("data/masculino.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((nombre = br.readLine()) != null) {
                nombres_al.add(nombre);
                hombres_al.add(nombre);
            }
            System.out.println("OK: LECTURA NOMBRE MACULINO");
        } catch (Exception e) {
            System.out.println("ERROR: LECTURA MASCULINO");
        }

        //LEER ARCHIVO MUJERES
        try {
            f = new File("data/femenino.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((nombre = br.readLine()) != null) {
                nombres_al.add(nombre);
                mujeres_al.add(nombre);
            }
            System.out.println("OK: LECTURA NOMBRE FEMENINO");
        } catch (Exception e) {
            System.out.println("ERROR: LECTURA FEMENINO");
        }

        System.out.println(Arrays.asList(nombres_al));

        //LEER ARCHIVO APELLIDOS
        String apellido = "";
        try {
            f = new File("data/apellido.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((apellido = br.readLine()) != null) {
                apellidos_al.add(apellido);
            }
            System.out.println("OK: LECTURA NOMBRE FEMENINO");
        } catch (Exception e) {
            System.out.println("ERROR: LECTURA APELLIDOS");
        }

        System.out.println(Arrays.asList(apellidos_al));

        System.out.print("INGRESAR CUANTAS PERSONAS QUIERE GENERAR?");
        int n = sc.nextInt();//10
        Set<String> personas_ts = new TreeSet<>();

        System.out.println("Tamaño nombre.txt: " + nombres_al.size());
        System.out.println("Tamaño apellido.txt: " + apellidos_al.size());
        String sexo = "";
        for (int i = 0; true; i++) { //0   9
            int aleatorioNombre = (int) (Math.random() * nombres_al.size());
            nombre = nombres_al.get(aleatorioNombre);
            if(hombres_al.contains(nombre)) {
                sexo = "H";
            }else {
                sexo = "M";
            }

            int aleatorioApellido = (int) (Math.random() * apellidos_al.size());
            apellido = apellidos_al.get(aleatorioApellido);

            String persona = nombre + " " + apellido + ";" + sexo;
            System.out.println((i + 1) + " " + persona);

            
            
            personas_ts.add(persona);
            if (personas_ts.size() == n) {
                break;
            }

            if (personas_ts.size() == nombres_al.size() * apellidos_al.size()) {
                System.out.println("DATOS DISPONIBLES NO SUFICIENTES");
                break;
            }
        }
        
        List<String> personas1_al = new ArrayList<>(personas_ts);
        List<String> personas2_al = new ArrayList<>();
        int k = 1;
        for(int i=0; i<personas1_al.size(); i++) {
            String s = personas1_al.get(i);
            String p1 = (k++) + ";" + s + ";" + MetodoArchivo.obtenerFechaNacimientoAleatorio();
            personas2_al.add(i,p1);
        }
        System.out.println("CONFIRMAR CAMBIOS");
        for(String p2: personas2_al) {
            System.out.println(p2);
        }
        
        
/*
        System.out.println("PERSONAS DISTINTAS Y ORDENADAS");
        int j = 0;
        for (String p : personas_ts) {
            System.out.println((++j) + " " + p);
        }
*/
        //ESCRIBIR LAS PERSONAS DISTINTAS EN UN ARCHIVO
        //File f;
        FileWriter fw;
        BufferedWriter bw;

        try {
            f = new File("data/persona.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            //System.out.println("*************RUN*************");
            //bw.write("*************RUN*************" + "\r\n");
            int i = 1;
            for (String p : personas2_al) {
                bw.write(p + "\r\n");
            }
            bw.flush();
            System.out.println("OK: ESCRITURA");

        } catch (Exception e) {
            System.out.println("ERROR: ESCRITURA " + e.getMessage());
        }
        
        //AGREGAR UN CAMPO DEL SEXO DE LA PERSONA

    }

}
