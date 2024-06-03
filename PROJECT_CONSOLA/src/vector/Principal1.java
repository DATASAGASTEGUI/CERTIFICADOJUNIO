package vector;

import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        System.out.println("FORMAS DECLARAR VECTOR");
        System.out.println("----------------------");
        System.out.println("ESTATICO");
                      //0 1 2 3 4 5 6 7 8
        int[] vector = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<vector.length; i++) {
            System.out.print(vector[i] + " ");
        } 
        System.out.println();
            
        System.out.println("DINAMICO");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese tamaño vector? ");
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        for(int i=0; i<vector1.length; i++) {
            System.out.print("Ingrese vector[" + i + "] = ");
            vector1[i] = sc.nextInt();
        }
        
        
        
        
    }
    
}
