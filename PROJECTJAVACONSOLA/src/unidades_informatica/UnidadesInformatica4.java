package unidades_informatica;

import java.text.DecimalFormat;

public class UnidadesInformatica4 {
    
    public static final String[] UNIDADES = {"BYTE", "KILO BYTE", "MEGA BYTE", "GIGA BYTE", "TERA BYTE", "PETA BYTE", "EXA BYTE", "ZETA BYTE", "YOTTA BYTE"};

    //1. ATRIBUTOS INSTANCIA
    private int opcioni;
    private double cantidad;

    //2. CONSTRUCTORES
    public UnidadesInformatica4() {
        this.opcioni = 0;
        this.cantidad = 0.0;
    }

    public UnidadesInformatica4(int opcioni, double cantidad) {
        this.opcioni = opcioni-1;
        this.cantidad = cantidad;
    }

    //3. METODOS SET Y GET
    public int getOpcioni() {
        return opcioni;
    }

    public void setOpcioni(int opcioni) {
        this.opcioni = opcioni;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //4. METODO TOSTRING
    @Override
    public String toString() {
        return "UnidadesInformatica4{" + "opcioni=" + opcioni + ", cantidad=" + cantidad + '}';
    }

    //5. OTROS METODOS
    public String conversion(int opcionf) {
        int saltos = opcionf - opcioni;   //positivo dividir, negativo multiplicar
        if (saltos > 0) {
            cantidad = cantidad / Math.pow(2, (Math.abs(saltos) * 10));
        } else {
            cantidad = cantidad * Math.pow(2, (Math.abs(saltos) * 10));
        }

        // Crear un formato para mostrar el número con 10 decimales
        DecimalFormat df = new DecimalFormat("0.000000000000000000000000000000");//9.765625E-4;
        // Formatear el número
        String numeroFormateado = df.format(cantidad);
        return numeroFormateado;
    }

    public void mostrar() {
        int opcionf;
        int[] unidadesx = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        unidadesx[opcioni] = 1;
        for (int i = 0; i < unidadesx.length; i++) {
            if (unidadesx[i] != 1) {
                opcionf = i;
                System.out.printf("%10s : %30s\n", UNIDADES[opcionf], conversion(opcionf));
            }
        }
    }

}
