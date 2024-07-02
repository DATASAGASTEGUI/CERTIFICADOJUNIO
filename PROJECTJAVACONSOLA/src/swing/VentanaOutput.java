package swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
        
public class VentanaOutput extends JFrame {
  
    //VARIABLES DE INSTANCIA
    Container contenedor = getContentPane();
    JTextArea txaContenido = new JTextArea();
    JScrollPane scrollpane = new JScrollPane();
    
    //CONSTRUCTORES
    public VentanaOutput() {
        Metodos.personalizarVentana(this);
        Metodos.personalizarJTextArea(txaContenido, scrollpane);
        contenedor.add(scrollpane); 
    }
    
    //METODO PRINCIPAL (APLICACION)
    public static void main(String[] args) {
         VentanaOutput vo = new VentanaOutput();
    }
}
