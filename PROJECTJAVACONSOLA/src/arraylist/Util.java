package arraylist;

import java.util.List;
import java.util.Scanner;


public class Util {
   
    public static boolean existeIdAlumno(String idAlumno, List<Alumno> alumnos_al) {
       boolean existe = false;
       for(Alumno a: alumnos_al)  {
           if(a.getIdAlumno().equals(idAlumno)) {
              existe = true;
              break;
           }
       }
       return existe;
    }
    
    public static int leerEdad() {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+";   //[1-150]        888888
        boolean correcto;
        String edad;
        do {
             System.out.print("INGRESAR EDAD? ");
             edad = sc.next();
             correcto = edad.matches(patron) && Integer.parseInt(edad) >= 1
                                             && Integer.parseInt(edad) <= 150;
             if(!correcto) {
                System.out.println("ERROR: ENTRADA");
             }
        }while(!correcto);
        return Integer.parseInt(edad);
    }
    
    public static int leerNumeroAsignatura() {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+";   //[1-5]        888888
        boolean correcto;
        String numero;
        do {
             System.out.print("CUANTAS ASIGNATURAS DESEA INGRESAR? ");
             numero = sc.next();
             correcto = numero.matches(patron) && Integer.parseInt(numero) >= 1
                                             && Integer.parseInt(numero) <= 5;
             if(!correcto) {
                System.out.println("ERROR: ENTRADA");
             }
        }while(!correcto);
        return Integer.parseInt(numero);
    } 
    
    public static String leerIdAlumno() { 
        Scanner sc = new Scanner(System.in);
        String patron = "A[0-9]{1,2}";   //A1 A2 A3 ... A99
        boolean correcto;
        String idAlumno;
        do {
             System.out.print("INGRESAR IDALUMNO? ");
             idAlumno = sc.next();
             correcto = idAlumno.matches(patron);
             if(!correcto) {
                System.out.println("ERROR: ENTRADA");
             }
        }while(!correcto);
        return idAlumno;
    }    

    public static String leerAsignatura() { 
        Scanner sc = new Scanner(System.in);
        String patron = "Física|Química|Literatura|Matemática";   //Fisica, Química, Literartura, Matemática
        boolean correcto;
        String asignatura;
        do {
             System.out.print("INGRESAR ASIGNATURA? ");
             asignatura = sc.next();
             correcto = asignatura.matches(patron);
             if(!correcto) { 
                System.out.println("ERROR: ENTRADA");
             }
        }while(!correcto); 
        return asignatura;
    }     
   
    public static boolean existeAsignatura(String asignatura, List<String> alumnos_al) {
        boolean existe = false;
        for(String s: alumnos_al) {
            if(s.equals(asignatura)) {
               existe = true;
               break;
            }
        }
        return existe;
    } 
    
}
