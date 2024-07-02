package unidades_informatica;

import java.text.DecimalFormat;

public class UnidadesInformatica {
    //0. ATRIBUTOS CLASE
    public static final String[] UNIDADES = {"BYTE", "KILO  BYTE", "MEGA  BYTE", "GIGA  BYTE", "TERA  BYTE", "PETA  BYTE", "EXA   BYTE", "ZETA  BYTE", "YOTTA BYTE"};

    //1. ATRIBUTOS INSTANCIA(OBJETO)
    private int opcioni;
    private int opcionf;
    private double cantidad;

    //2. CONSTRUCTORES
    //POLIMORFISMO A NIVEL DE CONSTRUCTORES
    public UnidadesInformatica() { //Constructor vacio
        this.opcioni = 0;
        this.opcionf = 0;
        this.cantidad = 0.0;
    }

    public UnidadesInformatica(int opcioni, int opcionf, double cantidad) {//Constructor con todos los atributos
        this.opcioni = opcioni;
        this.opcionf = opcionf;
        this.cantidad = cantidad;
    }
    

    //3. METODOS SET Y GET
    public int getOpcioni() {
        return opcioni;
    }

    public void setOpcioni(int opcioni) {
        this.opcioni = opcioni;
    }

    public int getOpcionf() {
        return opcionf;
    }

    public void setOpcionf(int opcionf) {
        this.opcionf = opcionf;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //4. TOSTRING
    @Override
    public String toString() {
        return "UnidadesInformatica{" + "opcioni=" + opcioni + ", opcionf=" + opcionf + ", cantidad=" + cantidad + '}';
    }

    //5. OTROS METODOS
    public String conversion() {
        int saltos = opcionf - opcioni;   //positivo dividir, negativo multiplicar
        if (saltos > 0) {
            cantidad = cantidad / Math.pow(2, (Math.abs(saltos) * 10));
        } else {
            cantidad = cantidad * Math.pow(2, (Math.abs(saltos) * 10));
        }

        // Crear un formato para mostrar el número con 10 decimales
        DecimalFormat df = new DecimalFormat("0.0000000000");//9.765625E-4;
        // Formatear el número
        String numeroFormateado = df.format(cantidad);
        return numeroFormateado;
    }
    
    public static void cabecera() {
        System.out.printf("%5s %-12s %12s   %-12s %40s\n","N","OPCIONI","CANTIDAD","OPCIONF","CONVERSION");
        System.out.printf("%5s %-12s %12s   %-12s %40s\n","-","-------","--------","-------","----------");
    }
    
    public void cuerpo(int i) {
        System.out.printf("%5s %-12s %12s   %-12s %40s\n",i,UNIDADES[opcioni-1],cantidad,UNIDADES[opcionf-1],conversion()); 
    }

}


