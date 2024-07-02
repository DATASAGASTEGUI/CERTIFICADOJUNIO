package swing;

public class PrincipalVentanaImagen {

    public static void main(String[] args) {
        String[] nombresFotos = {"1.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png", "10.png"};
        String[] nombres = {"Luis", "Carmen", "Miguel", "Carlos", "Andres", "Arturo", "María", "Isabel", "Pedro", "Pepe"};
        for (int i=0; i<nombresFotos.length; i++) {
            VentanaImagen vi = new VentanaImagen(nombresFotos[i]);
            vi.setTitle(nombres[i].toUpperCase());
       }
    }
    
}
