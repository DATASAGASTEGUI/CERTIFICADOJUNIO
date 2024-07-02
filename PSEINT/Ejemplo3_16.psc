Algoritmo Ejemplo3_16
	//DECLARAR VARIABLES
	Definir n1,n2,n3,n4,menornota Como Entero
	Definir promedio Como Real
	//ENTRADA
	Escribir "INGRESAR NOTA 1? " Sin Saltar //5
	Leer n1
	Escribir "INGRESAR NOTA 2? " Sin Saltar //4
	Leer n2
	Escribir "INGRESAR NOTA 3? " Sin Saltar //3
	Leer n3
	Escribir "INGRESAR NOTA 4? " Sin Saltar //1
	Leer n4	
	//PROCESO
	menornota = n1 //menornota = 5
	Si n2 < menornota Entonces 
		menornota = n2
	FinSi
	Si n3 < menornota Entonces 
		menornota = n3
	FinSi	
	Si n4 < menornota Entonces 
		menornota = n4
	FinSi
	promedio = (n1+n2+n3+n4-menornota)/3
	//SALIDA
	Escribir "Promedio: ", promedio
FinAlgoritmo
