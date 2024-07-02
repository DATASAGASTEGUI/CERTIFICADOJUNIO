package unidades_informatica;


public class PrincipalUnidadesInformatica4 {

    public static void main(String[] args) {
        int opcioni, cantidad;
        
        for(int i=0; i<1; i++) {
            opcioni = (int)(Math.random()*9+1);
            cantidad = (int)(Math.random()*4096 + 1);
            UnidadesInformatica4 ui4 = new UnidadesInformatica4(opcioni,cantidad);
            ui4.mostrar();
        }
    }
}
