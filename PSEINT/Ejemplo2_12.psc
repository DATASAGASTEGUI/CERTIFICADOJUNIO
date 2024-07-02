Algoritmo Ejercicio2_12
	//DECLARAR VARIABES
	Definir a,b Como Entero
	//ENTRADA
	Escribir sin saltar "INGRESAR A? "
	Leer a
	Escribir sin saltar "INGRESAR B?"
	Leer b
	//PROCESO-SALIDA
	Si a <> b Entonces //(1)IF...THEN
		Si a > b //(2)IF...THEN (ANIDADO)
			Escribir "EL MAYOR ES A: ", a
			Escribir "EL MENOR ES B: ", b
		SiNo//(2)ELSE
			Escribir "EL MAYOR ES B: ", b
			Escribir "EL MENOR ES A: ", a
		FinSi
	Sino//(1)ELSE
		Escribir "LOS NUMEROS SON IGUALES"
	FinSi
FinAlgoritmo
