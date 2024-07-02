Algoritmo Ejemplo3_20
	//DECLARAR VARIABLES
	Definir n, f Como Entero
	//ENTRADA
	Escribir "INGRESAR NUMERO N? "
	Leer n
	//PROCESO
	Si n >= 0 Entonces
		f = 1 
		Si n<>0 Entonces
			Para i = 1 Hasta n Con Paso 1 Hacer
				f = f * i
			Fin Para
			Escribir "FACTORIAL DISTINTO CERO: ",f
		SiNo
			Escribir "FACTORIAL CERO: ",f
		FinSi
	SiNo
		Escribir "NO EXISTE FACTORIAL DE UN NEGATIVO"
	FinSi	
	//SALIDA
FinAlgoritmo
