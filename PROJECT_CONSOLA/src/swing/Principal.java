/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing;

/**
 *
 * @author RYZEN
 */
public class Principal {

    public static void main(String[] args) {
       imprimir();
    }
    
    public static void imprimir() {
         for(int i=0; i<10; i++) {
             Ventana v = new Ventana();
             v.setVisible(true);
         }
    }
    
}
