package for_1;

public class Principal1 {

    public static void main(String[] args) {
        System.out.println("SERIE: 0.1, 0.2, 0.3, 0.4 ... 1.0");
        for (float i = 0.1f; i <= 1.0f; i = redondear(i + 0.1f)) {
            System.out.print(redondear(i) + "\t");
        }
        System.out.println();
        System.out.println("SERIE: 0.01, 0.02, 0.03, 0.04 ... 1.00");
        int c = 0;
        for (float i = 0.01f; i <= 1.0f; i = redondear(i + 0.01f)) {
            System.out.print(i + "\t");
            c++;
            if (c == 10) {
                System.out.println();
                c = 0;
            }
        }
        System.out.println();
        System.out.println("RECORRER CADENA: EN UN PUERTO ITALIANO");
        //012345678912345678901  
        String texto = "EN UN PUERTO ITALIANO";   //HOLA  = 4
        int longitud = texto.length();//21
        for (int i = 0; i < longitud; i++) {
            System.out.print(texto.charAt(i) + "");
        }
        System.out.println("CANTIDAD DE VOCALES EN EL TEXTO");
        String patron = "[AEIOU]";
        int cvocal = 0;
        for (int i = 0; i < longitud; i++) {
            /*
           String letra = texto.charAt(i) + "";//'A'  "A"
           if(letra.matches(patron)) {
               cvocal++;
           }
           */
            /*
            if ((texto.charAt(i) + "").matches(patron)) {
                cvocal++;
            }
             */
            if (String.valueOf(texto.charAt(i)).matches(patron)) {
                cvocal++;
            }
        }
        System.out.println("Cantidad vocales: " + cvocal);
    }

    public static float redondear(float numero) {
        return (float) (Math.round(numero * 100.0) / 100.0);
    }

}
