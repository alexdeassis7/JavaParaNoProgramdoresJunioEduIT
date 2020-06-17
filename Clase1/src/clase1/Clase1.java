package clase1;
//importando la libreria de java Util 
import java.util.Scanner;

public class Clase1 {
  public static void main(String[] args) {
     /*PUNTO DE INICIO DE EJECUCION DE LA APP*/
     //definimos las variable de trabajo 
     int numero1 = 0 ,numero2 = 0 , resultado = 0 ;
     Scanner teclado = new Scanner(System.in);
     
     System.out.println("bienvenido a la app");
     //solicitamos los datos al usuario 
     System.out.println("Ingrese el numero uno");
     //guardamos el numero que ingrese el usuario 
     numero1 = teclado.nextInt();
     
     System.out.println("Ingrese el numero dos");
     numero2 = teclado.nextInt();
     //proceso de la informacion 
     resultado = numero1 + numero2; 
     //mostrar los resultados
      System.out.println("El resultado es " + resultado);
     
     
    }
    
}
