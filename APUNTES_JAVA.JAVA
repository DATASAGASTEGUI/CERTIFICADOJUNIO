--------------------------------------------------------------------------------
(01) TIPOS DE DATOS PRIMITIVOS EN JAVA
--------------------------------------------------------------------------------
- TIPOS ENTEROS
byte

Tamaño: 1 byte (8 bits)
Rango: -128 a 127

short

Tamaño: 2 bytes (16 bits)
Rango: -32,768 a 32,767

int

Tamaño: 4 bytes (32 bits)
Rango: -2,147,483,648 a 2,147,483,647

long

Tamaño: 8 bytes (64 bits)
Rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

- TIPOS PUNTO FLOTANTE (1.3, 3.1415)

float

Tamaño: 4 bytes (32 bits)
Rango: Aproximadamente ±3.40282347E+38F (6-7 dígitos decimales significativos)

double

Tamaño: 8 bytes (64 bits)
Rango: Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimales significativos)

- TIPO CARACTER ('A', '*', '1')

char

Tamaño: 2 bytes (16 bits)
Rango: '\u0000' (o 0) a '\uffff' (o 65,535) - Utiliza el conjunto de caracteres Unicode

- TIPO LOGICO

boolean

Tamaño: 1 bit (generalmente, aunque el tamaño en memoria puede depender de la implementación de la JVM)
Rango: true o false

- TIPO TEXTO ("Hola", "Luis", "Madrid", "Av. Ejercito 123")

String
--------------------------------------------------------------------------------
(02) TABLA RESUMEN TIPOS DE DATOS
--------------------------------------------------------------------------------
Tipo	Tamaño en bytes	Rango de valores
byte	1		-128 a 127
short	2		-32,768 a 32,767
int	    4		-2,147,483,648 a 2,147,483,647
long	8		-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
float	4		Aproximadamente ±3.40282347E+38F (6-7 dígitos decimales significativos)
double	8		Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimales significativos)
char	2		'\u0000' a '\uffff'
boolean	1 bit	true o false

Estos tamaños y rangos son fundamentales para entender cómo manejar   diferentes 
tipos de datos en Java y son esenciales para la optimización del uso  de memoria
y el rendimiento de las aplicaciones.
--------------------------------------------------------------------------------
(03) ESTRUCTURA PROGRAMA JAVA
--------------------------------------------------------------------------------
(1)

package misrc;

import circulo.Libreria;  						// Libreria.java
import java.util.Scanner; 						// Scanner.java

public class Principal { 						// Principal.java

    public static void main(String[] args) { 	// Es el punto de entrada de toda aplicación  String.java
	    // Aquí va su código
	}
}

(2)

package misrc;

public class Principal { 						// INICIO CLASE

    public static void main(String[] args) { 	// INICIO MAIN
	
	    // Aquí va su código
		
	} 											// FIN MAIN
} 												// FIN CLASE
--------------------------------------------------------------------------------
(04) OPERADORES COMPORACION
--------------------------------------------------------------------------------
== 		igual                          5 == 5   true,   6 == 7   false
!= 		diferente
<		menor
<=      menor o igual
>       mayor
>=      mayor igual
--------------------------------------------------------------------------------
(05) OPERADOR ASIGNACION (DAR VALORES A LAS VARIABLES)
--------------------------------------------------------------------------------
int x = 5;
--------------------------------------------------------------------------------
(06) OPERADORES ARITMETICOS
--------------------------------------------------------------------------------
+     suma
-     resta
*     multiplicacion
/     division              5/2=2         5/2.0=2.5     5.0/9 = 0,55555555555555555555555555555556
                                                        5/9   = 0
%     Resto                 5%2=1
--------------------------------------------------------------------------------
(07) OPERADORES LOGICOS
--------------------------------------------------------------------------------
&&		AND                     Conjución      10  ---> [1, 100]    SI PERTENECE
||		OR                      Negación
!		NEGACION                Disyunción

// PREGUNTAR SI 10 PERTENECE AL RANGO [1, 100]
int x = 101;
if(x >= 1 && x <= 100) {
    System.out.println("PERTENECE");
}else {
    System.out.println("NO PERTENECE");
}
--------------------------------------------------------------------------------
(08) ACUMULADORES
--------------------------------------------------------------------------------
// ACUMULAR LOS NUMEROS DE UNA SERIE: 1 2 3 4 5  EL RESULTADO SERA 15
// SINTAXIS DE UN ACUMULADOR: s = s + numero                     

int s = 0;
for(int i=1; i<=5; i=i+1) {    //1 2 3 4 5
    s = s + i;
}
  System.out.println("Suma: " + s);

/*
s = 0

i: 1
   s = s + i  ---> s =  0 + 1 =  1
i: 2
   s = s + i  ---> s =  1 + 2 =  3
i: 3
   s = s + i  ---> s =  3 + 3 =  6
i: 4
   s = s + i  ---> s =  6 + 4 = 10
i: 5
   s = s + i  ---> s = 10 + 5 = 15
*/
--------------------------------------------------------------------------------
(09) CONTADORES
--------------------------------------------------------------------------------
c = c + 1   (de uno en uno)   c++       c+=1
c = c + 2   (de dos en dos)             c+=2
--------------------------------------------------------------------------------
(10) SALIDA INFORMACION
--------------------------------------------------------------------------------
        String nombre = "Luis";
        int edad = 23;
        double estatura = 1.72;
        char sexo = 'H';
        boolean casado = false;

        System.out.println("Nombre  : " + nombre);
        System.out.println("Edad    : " + edad);
        System.out.println("Estaruta: " + estatura);
        System.out.println("Sexo    : " + sexo);
        System.out.println("Casado  : " + casado);

        System.out.printf("%-13s %4s %8s %4s %6s\n","NOMBRE","EDAD","ESTATURA","SEXO","CASADO");
        System.out.printf("%-13s %4s %8s %4s %6s\n","------","----","--------","----","------");
        System.out.printf("%-13s %4d %8.2f %4s %6s\n",nombre,edad,estatura,sexo,casado);
		
		System.out.print("Hola ");
		System.out.print("Mundo");	
--------------------------------------------------------------------------------
(11) ENTRADA INFORMACION
--------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        //1. DECLARACION VARIABLES
        double radio, area, perimetro;
        //2. ENTRADA
        System.out.print("Ingrese radio? ");
        radio = sc.nextDouble();
--------------------------------------------------------------------------------
(12) METODOS MATEMATICOS
--------------------------------------------------------------------------------
double numero = 34341351344444444444444.333333333
long resultado = Math.round(numero); //PARTE ENTERA REDONDEADA

int base = 2;
int exponente = 3;
double potencia = Math.pow(base,exponente); //8.0   Retorna double
--------------------------------------------------------------------------------
(12-1) NUMERO ALEATORIO
--------------------------------------------------------------------------------
// NUMERO ALEATORIO

double aleatorio = Math.random(); // 0.341234123, 0.000131341 ...

//NUMERO ALEATORIO DE UN DADO [1,2,3,4,5,6]

int dado  = (int)(Math.random() * CantidadNumerosRango + PrimeroNumeroRango)
int dado = (int)(Math.random() * 6 + 1);
System.out.println("Dado: " + dado);

ORACLE DOCUMENTATION Math
--------------------------------------------------------------------------------
(13) CONVERSION TIPOS CAST
--------------------------------------------------------------------------------
int codigo = (int)'A';    //65
int entero = (int)1.7343; //1
char letra = (char)65;    //A
double real = (double)1;  //1.0
--------------------------------------------------------------------------------
(14) ESTRUCTURA CONDICIONAL BINARIA (2 CAMINOS POSIBLES)
--------------------------------------------------------------------------------
       int dado = (int)(Math.random() * 6 + 1);
       System.out.println("Dado: " + dado);
       if(dado % 2 == 0) {
           System.out.println("Par");
       }else {
           System.out.println("Impar");
       }
--------------------------------------------------------------------------------
(15) ESTRUCTURA CONDICIONAL MULTIPLE (MAS DE 2 CAMINOS)
--------------------------------------------------------------------------------
(1)
       int numero = -5; //0, 5, -5
       System.out.println("Número: " + numero);
       if(numero == 0) {
           System.out.println("Cero");
       }else if(numero > 0) {
           System.out.println("Positivo");
       }else {
           System.out.println("Negativo");
       }
(2)
       int numero = -5; //0, 5, -5
       System.out.println("Número: " + numero);
       if(numero == 0) {
           System.out.println("Cero");
       }
       
       if(numero > 0) {
           System.out.println("Positivo");
       }
       
       if(numero < 0) {
           System.out.println("Negativo");
       }
(3) 
        int numero = 0; //0, 5, -5
        System.out.println("Número: " + numero);
        if (numero == 0) {
            System.out.println("Cero");
        } else {
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
        }
(4)
        /*
        TRADUCIR EL DIA DE LA SEMANA DE NUMERO A LETRA
        1 Lunes
        2 Martes
        ...
        7 Domingo
        */
        String dialetra = "";
        int dia = (int)(Math.random() * 9 + 1);// [1,2,3,4,5,6,7,8,9]
        switch(dia) {
            case 1: dialetra = "Lunes";break;
            case 2: dialetra = "Martes";break;
            case 3: dialetra = "Miercoles";break;
            case 4: dialetra = "Jueves";break;
            case 5: dialetra = "Viernes";break;
            case 6: dialetra = "Sabado";break;
            case 7: dialetra = "Domingo";break;
            default: System.out.println("DIA NO VALIDO");
        }
        System.out.println(dia + "  " + dialetra);
    }
(5)
        int diasmes = 0;
        int anio = (int)(Math.random() * 25 + 2000); //[2000 - 2024];
        int mes = (int)(Math.random() * 12 + 1);// [1,2,3,4,5,6,7,8,9,10,11,12]
        switch(mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            //case 1,3,5,7,8,10,12:
                 diasmes = 31;break;
            //case 4,6,9,11: 
            case 4: case 6: case 9: case 11:
                 diasmes = 30;break;
            case 2: 
                  if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                     diasmes = 29;
                  }else {
                     diasmes = 28; 
                  }
                  break;
        }
        System.out.println(anio + "  " + mes + " = " + diasmes);
--------------------------------------------------------------------------------
(16) BLUCLES
--------------------------------------------------------------------------------
(1)
        {//INICIO 1
            System.out.println("WHILE");
            int i = 1;
            int n = 5;
            while (i <= n) {
                System.out.println(i);
                i++; //i = i + 1    i+=1    i++ CONTADOR    
            }
        }//FIN 1
        {//INICIO 2
            System.out.println("DO-WHILE");
            int i = 1;
            int n = 5;
            do {
                System.out.println(i);
                i++; //i = i + 1    i+=1    i++ CONTADOR    
            } while (i <= n);
        }//FIN 2 
        {//INICIO 3
            System.out.println("FOR");
            int n = 5;
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }//FIN 3

(2)
ERROR SEMANTICO(ERROR LOGICO)

        {//INICIO 2
            System.out.println("FOR");
            int n = 5;
            for (int i = 1; i > n; i++) {//SENTIDO CORRECTO <=
                System.out.println(i);
            }
        }//FIN 2
(3) BREAK

        {//INICIO 1
            System.out.println("FOR");
            int i = 1;
            for (;true;) {
                System.out.println(i);
                if(i == 60000) {
                    break;
                }
                i++;
            }
        }//FIN 1

(4) CONTINUE
Hace del 1 al 5 y vuelve a repetir el 1 al 5 infinitamente

        {//INICIO 1
            System.out.println("FOR");
            int i = 1;
            for (;true;) {
                System.out.println(i);
                if(i == 5) {
                    i = 1;
                    continue;
                }
                i++;
            }
        }//FIN 1
(5) DECREMENTA DEL 10 AL 1
        {//INICIO 1
            System.out.println("FOR");
            int n = 10;
            for (int i=n; i>=1; i--) {
                System.out.print(i + "  ");
            }
        }//FIN 1
(6) ROMPER LA FILA CUANDO LLEGUE A 5
        {//INICIO 1
            System.out.println("FOR");
            int n = 10;
            for (int i=n; i>=1; i--) {
                System.out.print(i + "  ");
                if(i == 5) System.out.println();
            }
        }//FIN 1
(7) DRECREMENTA EL TIPO INTEGER
        {//INICIO 1
            System.out.println("FOR");
            int n = Integer.MAX_VALUE;
            for (int i=n; true; i=i-1000000) {// i = i - 100000    i--
                System.out.println(i);
            }
        }//FIN 1
(8)
        {//INICIO 1
            System.out.println("FOR");
            long n = Long.MAX_VALUE;
            int contador = 1;
            for (long i = n; i > 1; i = i - 1) {// i = i - 100000    i--
                System.out.print(i + "  ");
                if (contador == 5) {
                    System.out.println();
                    contador = 1;
                }
                contador++;
            }
        }//FIN 1
(9) LANZAR UN DADO 100 VECES
        {//INICIO 1
            System.out.println("FOR");
            for (int i=1; i <= 100; i++) {
                int dado = (int)(Math.random()*6 + 1);
                System.out.print(dado + "  ");
            }
        }//FIN 2
(10) CONTATAR CUANTAS VECES SALIO CADA NUMERO EN LAS 100 VECES QUE SE LANZO

--------------------------------------------------------------------------------
CONVERSIONES ENTRE TIPOS DEATOS
--------------------------------------------------------------------------------

Integer.parseInt()
Double.parseDouble()
String.valueOf()
--------------------------------------------------------------------------------
ARRAYS UNIDIMENSIONAL (VECTOR)  LISTAS COLECCIONES
--------------------------------------------------------------------------------



--------------------------------------------------------------------------------
JSP 1
--------------------------------------------------------------------------------
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>001_1</title>
        <style>
            body {
                font-family: Courier New;
                font-size: 1em;
            }
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                text-transform: uppercase;
                text-align: center;
            }
            input[type=text] {
                text-align: center;
                border-radius: 5px;
                width: 20%;
                border: none;
            }
            input[type=submit] {
                background-color: black;
                text-align: center;
                border-radius: 5px;
                width: 10%;
                cursor: pointer;
                border: none;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA)-->
        <%
            //ENTRADA
            String numero1 = "0.0";
            String numero2 = "0.0";
            //SALIDA
            String resultado = "0.0";
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoSumar") != null) {
                try {
                    //ENTRADA
                    numero1 = request.getParameter("txtNumero1");
                    numero2 = request.getParameter("txtNumero2");
                    //PROCESO
                    double suma = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                    //SALIDA
                    resultado = String.valueOf(suma);
                    mensaje = "SUMAR";
                } catch (Exception e) {
                    mensaje = "ENTRADA INCORRECTA";
                }
            }

            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                numero1 = "0.0";
                numero2 = "0.0";
                //SALIDA
                resultado = "0.0";
                mensaje = "";
            }
        %>
        <!-- VISTA (HTML)-->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_001: SUMAR DOS NUMEROS</div><br/>
            <form action="#" method="post">
                <!-- ENTRADA -->
                <label for="lblNumero1">NUMERO 1</label><br>
                <input type="text" id="lblNumero1" name="txtNumero1" value="<%= numero1%>" placeholder="ESCRIBIR AQUI NUMERO 1" style="background-color: green;" /><br/>
                <label for="lblNumero2">NUMERO 2</label><br/>
                <input type="text" id="lblNumero2" name="txtNumero2" value="<%= numero2%>" placeholder="ESCRIBIR AQUI NUMERO 2" style="background-color: green;" /><br/>
                <!-- SALIDA -->
                <label for="lblResultado">RESULTADO</label><br/>
                <input type="text" id="lblResultado" name="txtResultado" value="<%= resultado%>" disabled style="background-color: blue;" /><br/>
                <label for="lblMensaje">MENSAJE</label><br/>
                <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled style="background-color: blue;" /><br/><br/>
                <!-- ACCION -->
                <input type="submit" name="btoSumar" value="SUMAR" style="background-color: black;" />
                <input type="submit" name="btoNuevo" value="NUEVO" style="background-color: black;" />
            </form> 
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
--------------------------------------------------------------------------------
JSP 2
--------------------------------------------------------------------------------
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>001_2</title>
    </head>
    <body>


        <!-- COMPONENTE (JAVA)-->
        <%
            //ENTRADA
            double numero1 = 0;
            double numero2 = 0;
            //SALIDA
            double resultado = 0;
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoSumar") != null) {
                try {
                    //ENTRADA
                    numero1 = Double.parseDouble(request.getParameter("txtNumero1"));
                    numero2 = Double.parseDouble(request.getParameter("txtNumero2"));
                    //PROCESO
                    double suma = numero1 + numero2;
                    //SALIDA
                    resultado = suma;
                    mensaje = "SUMAR";
                } catch (Exception e) {
                    mensaje = "ENTRADA INCORRECTA";
                }
            }

            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                numero1 = 0;
                numero2 = 0;
                //SALIDA
                resultado = 0;
                mensaje = "";
            }

        %>
        <!-- VISTA (HTML)-->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_002: SUMAR DOS NUMEROS</div>
            <form action="sumar_dos_numeros_2.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblNumero1">NUMERO 1</label><br/>
                    <input type="text" id="lblNumero1" name="txtNumero1" value="<%= numero1%>" placeholder="ESCRIBIR AQUI NUMERO 1" style="background-color: green; border: none;" />
                </p>
                <p>
                    <label for="lblNumero2">NUMERO 2</label><br/>
                    <input type="text" id="lblNumero2" name="txtNumero2" value="<%= numero2%>" placeholder="ESCRIBIR AQUI NUMERO 2" style="background-color: green; border: none;" />
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblResultado">RESULTADO</label><br/>
                    <input type="text" id="lblResultado" name="txtResultado" value="<%= resultado%>" disabled style="background-color: blue; border: none;" />
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled style="background-color: blue; border: none;" />
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoSumar" value="SUMAR" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" style="background-color: black; border: none; cursor: pointer;" />
                </p>
            </form> 
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
--------------------------------------------------------------------------------
TIPOS DATOS
--------------------------------------------------------------------------------
package tiposdatos;

public class Main {

    public static void main(String[] args) {
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        imprimirValoresTipoByte1();
    }

    public static void imprimirValoresTipoByte() {
        for (byte i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {//-128 127           127
            System.out.println(i);
        }
    }

    public static void imprimirValoresTipoByte1() {
        for (byte i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {//-128 127           127
            System.out.println(i);
            if(i == 127) break; //Evito el desbordamiento
        }
    }

}
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
        System.out.println("CODIGO    : " + codigo);
        System.out.println("PROMEDIO  : " + promedio);
        System.out.printf("REDONDEADO: %.0f", promedio);
        
        System.out.println();
        
        System.out.printf("CODIGO    : %5s\n"
                        + "PROMEDIO  : %5.2f\n"
                        + "REDONDEADO: %5.0f\n",codigo,promedio,promedio);


CODIGO    : A1
PROMEDIO  : 4.5600000000000005
REDONDEADO: 5
CODIGO    :    A1
PROMEDIO  :  4,56
REDONDEADO:     5

-------------------------------
OPERADORES LOGICOS
-------------
/*
 * Autor: Walter Ismael Sagástegui Lescano
 * Fecha: 27/04/2022
 */
package src;

public class OperadorLogico {

    public static void main(String[] args) {

        boolean x1 = true;
        boolean x2 = false;

        System.out.println("COMPUERTA LOGICA: AND &&");

        System.out.println("A     B     A AND B");
        System.out.println("false false " + (false && false));
        System.out.println("false true  " + (false && true));
        System.out.println("true  false " + (true && false));
        System.out.println("true  true  " + (true && true));

        System.out.println("A  B  A AND B");
        System.out.println("0  0 " + "   " + (0 & 0));
        System.out.println("0  1 " + "   " + (0 & 1));
        System.out.println("1  0 " + "   " + (1 & 0));
        System.out.println("1  1 " + "   " + (1 & 1));

        System.out.println("COMPUERTA LOGICA: OR ||");

        System.out.println("COMPUERTA LOGICA: NOT !");

        System.out.println("A     NOT A");
        System.out.println("false " + "   " + (!false));
        System.out.println("true  " + "   " + (!true));

        System.out.println("COMPUERTA LOGICA: NAND !&&");

        System.out.println("A     B     A NAND B");
        System.out.println("false false " + !(false && false));
        System.out.println("false true  " + !(false && true));
        System.out.println("true  false " + !(true  && false));
        System.out.println("true  true  " + !(true  && true));

        System.out.println("COMPUERTA LOGICA: XOR");

        System.out.println("A     B     A XOR B");
        System.out.println("false false " + !(false == false));
        System.out.println("false true  " + !(false == true));
        System.out.println("true  false " + !(true == false));
        System.out.println("true  true  " + !(true == true));

        System.out.println("COMPUERTA LOGICA: XOR");

        System.out.println("A     B     A XOR B");
        System.out.println("false false " + (false != false));
        System.out.println("false true  " + (false != true));
        System.out.println("true  false " + (true  != false));
        System.out.println("true  true  " + (true  != true));
        
        System.out.println("MAYOR O IGUAL QUE >=");
        System.out.println("Resultado: " + (6 >= 5));
        System.out.println("Resultado: " + (6 > 5 || 6 == 5));
        System.out.println("Resultado: " + (5 >= 5));
        System.out.println("Resultado: " + (5 > 5));
        
        System.out.println("DETERMINAR SI UN NUMERO ESTA DENTRO DE UN RANGO");
        byte x = -4;
        boolean resultado = (-4 <= x && x <= -2) || (3 <= x && x <= 5);
        System.out.println("Resultado1: " + resultado);
        
        System.out.println("HACER UN PROGRAMA QUE DIGA SI UN NUMERO NO PERTENECE PERTENECE AL RANGO [-2,2]");
        byte z1 = -4;
        boolean resultado1 = z1 < -2 && z1 > 2;
        System.out.println("Resultado: " + !resultado1);
        //[-4,-2] OR [3, 5] AND [-5, -3]
        System.out.println("DETERMINAR SI UN NUMERO ESTA DENTRO DE UN RANGO");
        byte x4 = -4;
        boolean resultado4 = (x4>=-4 && x4 <= -2) || (x4 >= 3&& x4 <= 5) || (x4>= -5&& x4 <= -3);
        System.out.println("Resultado4: " + !resultado4);

        
    }
}
--------------

*****************
***   SWING   ***
*****************


----------------
---   0001   ---
----------------

(1)
JTextArea txaContenido = new JTextArea();
JScrollPane scrollpane = new JScrollPane(txaContenido);//Poner un scroll al textarea
(2)
JScrollPane scrollpane = new JScrollPane();
scrollpane.setViewportView(txaContenido);//Poner un scroll al textarea


/*
 * Autor: Walter Ismael Sagástegui Lescano
 * Fecha: 27/04/2022
 */
package src;

public class Enteros {

    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        /*
        System.out.println("TIPOS ENTEROS");
        byte x1 = 5; //1 byte de la ram (EFICIENTE)
        //System.out.println("X1 = " + x1);
        short x2 = 5;
        int x3 = 5;
        long x4 = 5;  //8 bytes de la ram para guardar 5.
        
        System.out.println("DESBORDAMIENTO DE TIPOS DE DATOS");

        byte y1 = (byte) 129;
        System.out.println(y1); //-127

        byte y2 = (byte) -129;
        System.out.println(y2); //127
        
        System.out.println("CAST");//FORZAR UN TIPO MAS GRANDE PERO CON PERDIDA DE INFORMACION
        
        int z1 = (int)1.45;
        System.out.println("Z1 = " +  z1);
*/
        
    }

}
------------------