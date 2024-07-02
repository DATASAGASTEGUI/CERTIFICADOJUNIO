Algoritmo Ejemplo1_17
	//DECLARAR VARIABLES
	Definir cant, b20, b10, b5, b1, residuo Como Entero
	//ENTRADA
	Escribir Sin Saltar "INGRESE CANTIDAD EN EUROS A CONVERTIR? "
	Leer cant
	//PROCESO
	b20 = Trunc(cant / 20) 
	residuo20 = cant Mod 20
	
	b10 = Trunc(residuo20 / 10)
	residuo10 = residuo20 Mod 10
	
	b5 = Trunc(residuo10 / 5)
	residuo5 = residuo10 Mod 5
	
	b1 = Trunc(residuo5 / 1)
	residuo1 = residuo5 Mod 1
	//SALIDA
	Escribir "B20: ", b20
	Escribir "B10: ", b10
	Escribir "B5:  ", b5
	Escribir "B1:  ", b1
	Escribir "RESTO: ",residuo1
FinAlgoritmo
