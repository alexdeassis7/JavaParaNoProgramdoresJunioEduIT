/*1) Desarrollar un algoritmo que permita determinar si un número
ingresado por teclado es positivo o negativo. 
 */
package clase2condicionaldoble;
import java.util.Scanner;
public class Clase2CondicionalDoble {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos numero al usuario 
        System.out.println("Ingresa por favor un numero entero distinto a 0");
        numeroIngresado = teclado.nextInt();
        //UTILIZAMOS CONDICIONAL DOBLE 
       if(numeroIngresado > 0){
            System.out.println("El numero ingresado es positivo");
        }else{
            System.out.println("El numero ingresado es negativo");
        }     
        
       // if - else   ( condicion ) ? TRUE : FALSE;
       String mensaje = (numeroIngresado > 0) ? "El numero ingresado es positivo" : "El numero ingresado es negativo";        
       System.out.println("El mensaje : " + mensaje);
       System.out.println("Fin del programa");
        
    }
}
