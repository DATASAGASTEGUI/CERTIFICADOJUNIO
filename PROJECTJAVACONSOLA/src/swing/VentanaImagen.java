package swing;

import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaImagen extends JFrame {

    //VARIABLES INSTANCIA
    Container contenedor = getContentPane();

    BufferedImage imagen;
    JLabel lblImagen;
    String nombreFoto;

    //CONSTRUCTORES
    public VentanaImagen(String nombreFoto) {
        this.nombreFoto = nombreFoto;
        personalizarVentana();
        personalizarImagen();
    }

    public void personalizarVentana() {
        Font fuente = new java.awt.Font("Courier New", 2, 12);

        this.setIconImage(Toolkit.getDefaultToolkit().createImage(Ventana.class.getResource("cross1.png"))); // Pone una imagen icono al JFrame
        this.setResizable(false); // Desactiva el redimencionamiento del JFrame
        this.setLocationRelativeTo(null); // Centra el JFrame en la pantalla
        this.setFont(fuente); // Cambia la fuente de letra, estilo y tamaño
        this.setTitle("GUI SWING");
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public void personalizarImagen() {
        try {
            //CONFIGURAR LA IMAGEN PARA LEERLA
            File f = new File("imagen/" + nombreFoto);
            imagen = ImageIO.read(f);
            Image escalarImagen = imagen.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
            //COLOCA LA IMAGEN EN LA ETIQUETA
            lblImagen = new JLabel(new ImageIcon(escalarImagen));
            ///AÑADIR LA ETIQUETA AL CONTENEDOR
            contenedor.add(lblImagen); 
            //REVALIDAR Y REPINTAR EL CONTENEDOR
            contenedor.revalidate();
            contenedor.repaint();            
        } catch (IOException e) {
            
        }

    }

}
