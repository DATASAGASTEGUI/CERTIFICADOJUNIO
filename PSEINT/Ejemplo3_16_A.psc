Algoritmo Ejemplo3_16_A
		//DECLARAR VARIABLES
		Definir n1,n2,n3,n4,menornota Como Entero
		Definir promedio Como Real
		//ENTRADA
		Escribir "INGRESAR NOTA 1? " Sin Saltar
		Leer n1
		Escribir "INGRESAR NOTA 2? " Sin Saltar
		Leer n2
		Escribir "INGRESAR NOTA 3? " Sin Saltar
		Leer n3
		Escribir "INGRESAR NOTA 4? " Sin Saltar
		Leer n4	
		//PROCESO
		menornota = n1 
		Si n2 < menornota Entonces 
			menornota = n2
		SiNo
				Si n3 < menornota Entonces
					menornota = n3
				SiNo
					Si n4 < menornota Entonces
						menornota = n4
					FinSi
				FinSi
		FinSi
		promedio = (n1+n2+n3+n4-menornota)/3
		//SALIDA
		Escribir "Promedio: ", promedio
FinAlgoritmo	
	

