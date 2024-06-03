package expresion_regular;

import java.util.Scanner;

public class Principal1 {

    public static void main(String[] args) {
        //RECONOCER UN TIPO DE DATO BOOLEAN
        Scanner sc = new Scanner(System.in);
        //1. DECLARACION VARIABLES
        String logico_texto;
        boolean logico, correcto;
        String patron = "(true|false|TRUE|FALSE|False|True)"; //Disyunción=OR
        do {
            //2. ENTRADA
            System.out.print("Diga si es casado true/false? ");
            logico_texto = sc.next();
            //3. PROCESO
            correcto = logico_texto.matches(patron);
            if(correcto) {
               System.out.println("Valor Lógico Correcto");
               //logico = Boolean.parseBoolean(logico_texto);// "true" ---> true
            }else {
               System.out.println("Valor Lógico Incorrecto");
            }
        }while(!correcto);
    }
    
}
