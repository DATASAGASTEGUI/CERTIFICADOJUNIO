Algoritmo Ejercicio2_14
	//DECLARAR VARIABES
	Definir a,b,c, mayor Como Entero
	//ENTRADA
	Escribir sin saltar "INGRESAR A? "
	Leer a
	Escribir sin saltar "INGRESAR B? "
	Leer b
	Escribir Sin Saltar "INGRESAR C? "
	Leer c
	//PROCESO
	Si a >= b y a >= c Entonces
		mayor = a
	FinSi
	Si b >= a y b >= c Entonces
		mayor = b
	FinSi
	Si c >= a y c >= b Entonces
		mayor = c
	FinSi
	//SALIDA
	Escribir "MAYOR: ", mayor
FinAlgoritmo
