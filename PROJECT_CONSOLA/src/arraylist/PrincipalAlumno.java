package arraylist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalAlumno {

    //BASE DE DATOS
    static List<Alumno> alumnos_al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;

        List<String> asignaturas_al = new ArrayList<>();
        asignaturas_al.add("Física");
        asignaturas_al.add("Química");

        Alumno alumno = new Alumno("A1", "Luis", "Roncal", 15, asignaturas_al);

        alumnos_al.add(alumno);

        do {
            cls();
            System.out.println("MENU"); //CRUD = Crear(Create) - Leer(Read) - Actualizar(Update) - Eliminar(Delete)
            System.out.println("----");
            System.out.println("(1) AÑADIR ALUMNO"); //Crear
            System.out.println("(2) BUSCAR ALUMNO POR SU ID"); //Leer
            System.out.println("(3) MOSTRAR LAS ASIGNATURAS DE UN ALUMNO DADO"); //Leer
            System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASIGNATURA"); //Leer
            System.out.println("(5) SALIR");

            System.out.print("INGRESAR OPCION? ");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    cls();
                    opcion1();
                    pause();
                    break;
                case "2":
                    cls();
                    opcion2();
                    pause();
                    break;
                case "3":
                    cls();
                    opcion3();
                    pause();
                    break;
                case "4":
                    cls();
                    opcion4();
                    pause();
                    break;
                case "5":
                    sc.close();
                    System.exit(0);
            }
        } while (true);

    }

    public static void opcion1() {
        System.out.println("(1) AÑADIR ALUMNO");
        System.out.println("-----------------");
        Alumno alumno = new Alumno();
        alumno.entrada(alumnos_al);
    }

    public static void opcion2() {
        System.out.println("(2) BUSCAR ALUMNO");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESAR IDALUMNO A BUSCAR (EJEMPLO A1)? ");
        String idAlumnoBuscar = sc.next();
        for (Alumno alumno : alumnos_al) {
            if (alumno.getIdAlumno().equals(idAlumnoBuscar)) {
                System.out.println(alumno);
                System.out.println("Nombre  : " + alumno.getNombre());
                System.out.println("Apellido: " + alumno.getApellido());
                System.out.println("Edad    : " + alumno.getEdad());
                System.out.println("Asignaturas: " + alumno.getAsignaturas_al());
            }
        }
    }

    public static void opcion3() {
        System.out.println("(3) MOSTRAR LAS ASIGNATURAS DE UN ALUMNO DADO");
        System.out.println("---------------------------------------------");
        String idAlumno = Util.leerIdAlumno();
        if (Util.existeIdAlumno(idAlumno, alumnos_al)) {
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().equals(idAlumno)) {
                    System.out.println("Nombre     : " + a.getNombre());
                    System.out.println("Asignaturas: " + a.getAsignaturas_al());
                }
            }
        } else {
            System.out.println("ERROR: ALUMNO NO EXISTE");
        }
    }

    public static void opcion4() {
         System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASIGNATURA"); 
         System.out.println("-------------------------------------------------------"); 
         System.out.println("Asignaturas Validas: Física|Química|Literatura|Matemática");
         String asignatura = Util.leerAsignatura();
         for(Alumno a: alumnos_al) {
            List<String> alumnosaux_al = a.getAsignaturas_al();
            if(Util.existeAsignatura(asignatura, alumnosaux_al)) {
                System.out.println(a.getNombre());
            }
         }
    }

    public static void pause() {
        try {
            System.out.print("\nPRESIONA UNA TECLA PARA CONTINUAR...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
