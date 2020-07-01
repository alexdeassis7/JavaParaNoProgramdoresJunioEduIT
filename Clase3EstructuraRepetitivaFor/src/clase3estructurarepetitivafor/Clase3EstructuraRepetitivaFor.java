package clase3estructurarepetitivafor;
import java.util.Scanner;
/*1)Calcular el promedio de un alumno que tiene 7 
calificaciones en la materia de Diseño Estructurado de Algoritmos.*/
public class Clase3EstructuraRepetitivaFor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float promedio = 0 , calificacion = 0 , suma = 0 ;
        
        for (int i = 0 ; i < 7; i++) {
            System.out.println("Ingrese la calificacion " + (i + 1 ));
            calificacion = teclado.nextFloat();
            suma += calificacion;
        }
        promedio = suma / 7;
        System.out.println("El promedio de las calificaciones es :" + promedio);
        
 
    }

}
