/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidades_informatica;

/**
 *
 * @author Curso Mañana
 */
public class Principal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        int opcioni = 3; //Giga   Partidad
        int opcionf = 1; //Mega   Llegada
        double cantidad = 4454;
        
        String r = Principal4.conversion(opcioni, opcionf, cantidad);
        System.out.println(r);
*/
        
        UnidadesInformatica4 ui4 = new UnidadesInformatica4(1, 4096);
        ui4.setOpcioni(5);
        System.out.println("Opcioni : " + ui4.getOpcioni());
        
        
        
        
        
        
        
    }
    
}
