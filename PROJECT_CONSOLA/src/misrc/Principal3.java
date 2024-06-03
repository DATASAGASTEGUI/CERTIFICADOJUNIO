package misrc;

public class Principal3 {

    public static void main(String[] args) {
       int binario = 100101;
       //PASARLO A TEXTO
       String sbinario = String.valueOf(binario);//"100101"

       int decimal0 = Integer.parseInt(sbinario.charAt(0)+"") * (int)Math.pow(2,5);
       int decimal3 = Integer.parseInt(sbinario.charAt(3)+"") * (int)Math.pow(2,2);
       int decimal5 = Integer.parseInt(sbinario.charAt(5)+"") * (int)Math.pow(2,0);
       System.out.println("Resultao : " + (decimal0+decimal3+decimal5));
    }
    
}

/*
Math.pow                    POTENCIA                           double
objectoCadena.charAt(0)     OBTENER UN CARACTER DE LA CADENA   char
Stringg.valueOf             CONVIERTER NUMERO A CADENA         String

*/
