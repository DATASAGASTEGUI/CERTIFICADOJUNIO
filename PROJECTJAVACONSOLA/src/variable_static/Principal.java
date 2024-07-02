package variable_static;

public class Principal {

    public static void main(String[] args) {
        
        Alumno luis = new Alumno("Luis");
        System.out.println("Id Luis: " + luis.getId());
        
        Alumno miguel = new Alumno("Miguel");
        System.out.println("Id Miguel: " + miguel.getId()); 
        
        Alumno carmen = new Alumno("Carmen");
        System.out.println("Id Carmen: " + carmen.getId()); 
    }
    
}
