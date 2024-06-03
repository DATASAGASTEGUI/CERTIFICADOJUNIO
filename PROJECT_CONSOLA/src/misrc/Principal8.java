package misrc;

public class Principal8 {

    public static void main(String[] args) {
        //LAS 5 NOTAS DE UN ALUMNO
      
        double n1 = 5.6;
        double n2 = 5.6;
        double n3 = 8.1;
        double n4 = 5.6;
        double n5 = 8.1;
    
                        //0   1    2    3    4    5    
        double[] nota = {5.6, 5.6, 8.1, 5.6, 8.1, 1.8}; 
        //EJEMPLO 1: TRY ... CATCH
        System.out.println("Nota 1: " + nota[0]);
        try {
              System.out.println("Nota 6: " + nota[5]);//SEMANTICO
        }catch(ArrayIndexOutOfBoundsException e) {
              System.out.println("INDICE 5 NO EXISTE");
        }
        //EJEMPLO 2: RECORRER UN ARRAY (PROMEDIO) = SUMA/5
        double suma = 0.0;
        for(int i=0; i<nota.length; i++) {
            if(i % 2 == 0) {
               suma = suma + nota[i];
            }
        }
        System.out.println("Promedio: " + suma/nota.length);
        
        suma = 0;
        for(double n: nota) { //foreach = for
            suma = suma + n;
        }
        System.out.println("Promedio: " + suma/nota.length);
        
        suma = nota[0] + nota[1] + nota[2] + nota[3] + nota[4] + nota[5];
        System.out.println("Promedio: " + suma/nota.length);
               
    }
    
}
