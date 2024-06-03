Algoritmo Ejemplo1_4
	//DECLARAR VARIABLES
	Definir codigo Como Caracter
	Definir c1,c2,c3,c4,c5,promedio Como Real
	//ENTRADA
	Escribir Sin Saltar "INGRESAR CODIGO MATRICULA? "
	Leer codigo
	Escribir Sin Saltar 'INGRESAR CALIFICACION 1? '
	Leer c1
	Escribir Sin Saltar 'INGRESAR CALIFICACION 2? '
	Leer c2
	Escribir Sin Saltar 'INGRESAR CALIFICACION 3? '
	Leer c3
	Escribir Sin Saltar 'INGRESAR CALIFICACION 4? '
	Leer c4
	Escribir Sin Saltar 'INGRESAR CALIFICACION 5? '
	Leer c5
	//PROCESO
	promedio = (c1+c2+c3+c4+c5)/5
	//SALIDA
    Escribir "CODIGO: ", codigo
	Escribir "PROMEDIO: ", promedio
	Escribir "REDONDEADO: ", redon(promedio)
FinAlgoritmo
