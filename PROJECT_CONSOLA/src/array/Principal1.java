package array;

import java.util.Arrays;

public class Principal1 {

    public static void main(String[] args) {
        tiposArray();
    }

    public static void tiposArray() {
        System.out.println("VECTOR (ARRAY UNIDIMENSIONAL)");
        System.out.println("-----------------------------");
        int[] vector = {1, 2, 3}; //3
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + "  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(vector));
        System.out.println("MATRIZ (ARRAY BIDIMENSIONAL)");
        System.out.println("----------------------------");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };// 2*3 (fila*columna)
        for (int i = 0; i < matriz.length; i++) { //fila
            for (int j = 0; j < matriz[i].length; j++) { //columna
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
        System.out.println("CUBO (ARRAY TRIDIMENSIONAL)");
        System.out.println("---------------------------");
        int[][][] cubo = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        }; // 2*3*2 (fila*columna*matriz)
        for (int i = 0; i < cubo.length; i++) { //fila
            for (int j = 0; j < cubo[0].length; j++) { //columna
                for (int k = 0; k < cubo[0][0].length; k++) { //matriz
                    System.out.print(cubo[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("TESSERACTO (ARRAY CUATRO DIMENSIONES");
        System.out.println("------------------------------------");
        int[][][][] tesseracto = {
            {
                {
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7, 8, 9},
                    {10, 11, 12}
                }
            },
            {
                {
                    {1, 2, 3},
                    {4, 5, 6}
                },
                {
                    {7, 8, 9},
                    {10, 11, 12}
                }
            }
        }; // 2*3*2*2 (fila*columna*matriz*cubo)
        for (int i = 0; i < tesseracto.length; i++) { //fila
            for (int j = 0; j < tesseracto[0].length; j++) { //columna
                for (int k = 0; k < tesseracto[0][0].length; k++) { //matriz
                    for (int l = 0; l < tesseracto[0][0][0].length; l++) { //cubo
                        System.out.print(tesseracto[i][j][k][l] + "  ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
