package proyecto_calendario;

import java.io.IOException;

public class PROYECTO_CALENDARIO {

    public static void main(String[] args) {

        do {
            cls();
            System.out.println("MENU");
            System.out.println("----");

            System.out.println("(1) MOSTRAR EL CALENDARIO DE UN MES");
            System.out.println("(2) MOSTRAR EL CALENDARIO DE UN YEAR");
            System.out.println("(3) MOSTRAR EL DIA DE LA SEMANA DE UN DIA DE CUALQUIER MES Y YEAR");
            System.out.println("(4) SALIR");

            int opcion = Entrada.leerOpcion("INGRESAR OPCION? ");

            switch (opcion) {
                case 1:
                    cls();
                    Controlador.mostrarCalendarioDeUnMes();
                    pause();
                    
            }

        } while (true);

    }

    public static void cls() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPRESIONA UNA TECLA PARA CONTINUAR...");
            System.in.read();
        } catch (IOException e) {

        }
    }

}
