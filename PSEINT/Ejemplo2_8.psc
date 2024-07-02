Algoritmo Ejemplo2_8
	//Declarar variables
	Definir categoria como ENTERO
	Definir sueldo Como Real
	Definir sueldoF Como Real
	//ENTRADA
	Escribir Sin Saltar"INGRESAR CATEGORIA? "
	Leer categoria
	Escribir Sin Saltar"INGRESAR SUELDO? "
	Leer sueldo
	//Proceso 
	Si categoria = 1 Entonces
		sueldoF = sueldo * 1.15
	FinSi
	Si categoria = 2 Entonces
		sueldoF = sueldo * 1.10
	FinSi
	Si categoria = 3 Entonces
	   sueldoF = sueldo * 1.08
	FinSi
	Si categoria = 4 Entonces
	   sueldoF = sueldo * 1.05
	FinSi
	//SALIDA
	Escribir "SUELDO FINAL ES ", sueldoF
FinAlgoritmo
