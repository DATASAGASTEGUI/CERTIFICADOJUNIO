package swing;

public class Nota {
    //VARIABLES DE INSTANCIA(ATRIBUTOS)

    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;

    //CONSTRUCTORES
    public Nota(int nota1, int nota2, int nota3, int nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public Nota() {
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }

    //METODOS SET Y GET
    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Nota{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + '}';
    }

    //METODOS OTROS
    public double promedio() {
        int menornota = nota1;
        if (nota2 < menornota) {
            menornota = nota2;
        }
        if (nota3 < menornota) {
            menornota = nota3;
        }
        if (nota4 < menornota) {
            menornota = nota4;
        }

        double promedio = (nota1 + nota2 + nota3 + nota4 - menornota) / 3.0;
        return promedio;
    }

}
