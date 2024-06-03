package proyecto_calendario;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JTextArea;

public class Calendario {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private int year;
    private int mes;

    //CONSTRUCTORES
    public Calendario() {
        this.year = 0;
        this.mes = 0;
    }

    public Calendario(int year, int mes) {
        this.year = year;
        this.mes = mes;
    }

    public Calendario(int year) {
        this.year = year;
    }

    // METODOS SET Y GET
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // METODO TOSTRING
    @Override
    public String toString() {
        return "Calendario{" + "year=" + year + ", mes=" + mes + '}';
    }

    // METODOS OTROS
    public int[][] obtenerMatrizMes() {
        int[][] matrizmes = new int[6][7];
        int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero();
        int numeroDias = obtenerNumeroDiasMes();
        boolean bandera = false;
        int indice = 1;

        for (int i = 0; i < matrizmes.length; i++) {
            for (int j = 0; j < matrizmes[0].length; j++) {
                if (i == 0 && j == diaSemana) {
                    bandera = true;
                }
                if (bandera) {
                    matrizmes[i][j] = indice;
                    indice++;
                }
                if (indice > numeroDias) {
                    bandera = false;
                }
            }
        }
        return matrizmes;
    }
    
    public int[][][] obtenerCuboYear() {
        int[][][] cuboyear = new int[12][6][7];
        for(int i=0; i<cuboyear.length; i++) {
            this.setMes(i+1);
            cuboyear[i] = obtenerMatrizMes();
        }
        return cuboyear;
    }

    public int obtenerDiaSemanaPrimerDiaMesNumero() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();// Obtener el día de la semana del primer día del mes
        int diaSemanaNumero = diaSemanaTexto.getValue();// Convertir el día de la semana a un número (1=Lunes, 2=Martes, ..., 7=Domingo)
        return diaSemanaNumero - 1;
    }

    public int obtenerNumeroDiasMes() {
        LocalDate fecha = LocalDate.of(year, mes, 1);
        return fecha.lengthOfMonth();
    }
    
    public static void imprimirMatriz(int[][] matriz, JTextArea txaContenido) {
        String s;
        String[] diasSemana = {"L","M","X","J","V","S","D"};
        System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n",diasSemana);
        
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                
                if(matriz[i][j] != 0) {
                   System.out.printf("%4d ", matriz[i][j]);
                   s = String.format("%4d ", matriz[i][j]);
                   txaContenido.append(s);
                }else {
                   System.out.printf("%4s ", " ");
                   s = String.format("%4s ", " ");
                   txaContenido.append(s);
                }
            }
            System.out.println();
            s = String.format("\n");
            txaContenido.append(s);
        }
    }    

}
