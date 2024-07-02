Algoritmo Ejemplo2_8_A
	    //DECLARAR VARIABLES
		Definir categoria Como Entero
		Definir sueldo, sueldoFinal Como Real
		//ENTRADA
		Escribir Sin Saltar "INGRESAR CATEGORIA (1-4 CATEGORIAS)? "
		Leer categoria
		Escribir Sin Saltar "INGRESAR SUELDO? "
		Leer sueldo
		//PROCESO
		Segun categoria Hacer
			Caso 1: sueldoFinal <- sueldo * 1.15
			Caso 2: sueldoFinal <- sueldo * 1.10
			Caso 3: sueldoFinal <- sueldo * 1.08
			Caso 4: sueldoFinal <- sueldo * 1.05
		FinSegun
		//SALIDA
		Escribir "INCREMENTO: ", (sueldoFinal - sueldo)
		Escribir Sin Saltar "SUELDO FINAL DEL EMPLEADO ES ", sueldoFinal	

FinAlgoritmo
