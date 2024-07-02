*****************************
***   EXPRESION REGULAR   ***
*****************************

LISTA DE SECUENCIAS ESPECIALES
------------------------------

\d 	Coincide con cualquier dígito. Equivalente a [0-9] = [0123456789]                                          [2345] = [2-5]
\D	Coincide con cualquier caracter que no sea dígito. Equivalente a [^0-9]
\s  Coincide con cualquier carácter de espacio en blanco. Equivalente a [\t\n\r\f\v]
\S  Coincide con cualquier carácter que no sea un espacio en blanco. Equivalente a [^\t\n\r\f\v].
\w  Coincide con cualquier carácter alfanumérico. Equivalente a [a-zA-Z0-9_]
\W  Coincide con cualquier carácter no alfanumérico. Equivalente a [^a-zA-Z0-9_]

.   Coincide con cualquier carácter excepto nueva línea
\   El carácter puesto a continuación será convertido en carácter especial o, si ya es especial, deja de ser especial
^   Negación

NUMERO DE CARACTERES
--------------------

*     0 o más caracteres
+     1 o más caracteres
?     0 o 1 caracter (Ninguno o uno)
{3}   3 caracteres exactamente
{3,4} mínimo 3 caracteres y máximo 4 caracteres
{x,}  Indica que se repite un mínimo de x veces sin límite máximo. 



EJEMPLOS DE EXPRESIONES REGULARES
---------------------------------

(1) ER que coincida con números enteros de uno a mas dígitos.

    [0-9]
	[0123456789]
	
(2) ER que coincida con cadenas que inician en 'ab' y continuan con cero o mas caracteres cualquiera:      

    ab.*

(3) ER que coincida con cadenas que inician con a, b o c y no continua con ningun caracter

    [abc]

(4) ER 	que coincida con cadenas que incien con cualquier caracter excepto a,b o c y continuen con ningun caracter

    [^abc]              H, =, ? OK              a, b, c ERROR                      

(5) ER que coincida con cadenas que inicien con una vocal y continue con cualquier caracter menos los caracters que estan en el rango 'm' y 'p' e ingore la sensible a minúsculas y mayúsculas.

  [aeiouAEIOU][^m-pM-P]

(6) ER que coincida con cadenas que inicien con una vocal y continue con cero o un caracter cualquiera, menos
    los caracters que estan en el rango m y p e ingore la sensible a minúsculas y mayúsculas.

  [aeiouAEIOU][^m-pM-P]?


(7) ER que coincide con cadenas que inicia con una letra mayúscula y continua con cualquier cosa.


(8) ER que coincida con cadenas que inicia con un número de uno o dos digitos y nada a continuación.

    [0-9]{1,2}                           8, 88, 2, 22, 24

 
(20) ER que reconozca todas las cadenas que inician con la letra "e" y contnua con cero(nada) o una letra "s".

     es?
	 
	


(21) ER para identificar un dia del mes: 1 2 3 4 5 6 7 8 9
                                         01 02 03 04 05 06 07 08 09 
										 10 11 12 13 14 15 16 17 18 19
										 20 21 22 23 24 25 26 27 28 29
										 30 31

     
	([1-9]|0[1-9]|1[0-9]|2[0-9]|3[01])  

(22)

2000   2001  2002   2003 	--->  200[0123]

1916  1917  1918  2000   2001  2002   2003 	---> (191[6-8]|200[0123])

(23) ER que reconozca números enteros positivos y negativos

     45  -45  +45
	 [-+]?[0-9]+
	 
(24) ER que reconozca numero enteros y puntu flotante

     45   34343   3         [-+]?[0-9]+
	 1.7  234.345           ([-+]?[0-9]+\\.[0-9]+)
	 
	 
					        [-+]?[0-9]+|([-+]?[0-9]+\\.[0-9]+)
							
	1.7  234,345  						[-+]?[0-9]+|([-+]?[0-9]+[\\.,][0-9]+)
	
	
(25) ER para validar un correo

                         [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}
						 
						  aa._+@----....aaaaa1111.co
						                         .oracle
												                   .con
																   .es
				         [a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.(con|es)
		
(26)
    EXPRESION REGULAR PARA RECONOCER CORREOS DE HOTMAIL, GMAIL Y YAHOO.		
						 
						 hotmail, gmail, yahoo
						 
						 walter.sagastegui@
