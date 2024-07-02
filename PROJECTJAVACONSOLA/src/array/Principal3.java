package array;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
        String[] diasSemana = {"L", "M", "X", "J"};
        String[] meses = {"ENERO", "FEBRERO"};
        int[][] menero = {
            {1, 2, 3, 5},
            {4, 5, 6, 8},
            {7, 8, 9, 1}
        };
        int[][] mfebrero = {
            {7, 8, 9, 3},
            {4, 5, 8, 9},
            {1, 2, 3, 1},};
        
        /*
        List<int[][]> matrices_al = new ArrayList<>();
        matrices_al.add(menero);
        matrices_al.add(mfebrero);
        */

        int[][][] cubo = new int[2][3][4];//matriz,fila,columna

        cubo[0] = menero;
        cubo[1] = mfebrero;

        for (int i = 0; i < cubo.length; i++) { //Matriz=2
            System.out.println("   " + meses[i]);
            System.out.printf("%4s %4s %4s %4s\n", diasSemana);
            for (int j = 0; j < cubo[0].length; j++) {//Filas=3
                for (int k = 0; k < cubo[0][0].length; k++) {//Columnas=4
                    System.out.printf("%4d ", cubo[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static int[][][] obtenerCuboCalendario() {
        int[][][] cubo = new int[12][6][7];//matriz,fila,columna
        for (int mes = 1; mes <= 12; mes++) {
            //CONSTRUIR CADA MES EN UNA MATRIZ
            int[][] matrizmes = new int[6][7];
            
            //LLENA LOS NUMEROS
            cubo[mes-1] = matrizmes;
        }
        return cubo;
    }
}
/*
         i  j  k
         0  0  0    cubo[0][0][0]
               1    cubo[0][0][1]
               2    cubo[0][0][2]
               3    cubo[0][0][3]
            1  0
               1
               2
               3
            2  0
               1
               2
               3
         1

 */
