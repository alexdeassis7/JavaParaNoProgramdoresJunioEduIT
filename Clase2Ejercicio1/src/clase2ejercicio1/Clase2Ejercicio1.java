/*PROBLEMAS SECUENCIALES:
1)Suponga que un individuo desea invertir su capital en un banco y desea saber 
cuanto dinero ganara depues de un mes si el banco paga a razon de 2% mensual  */
package clase2ejercicio1;
import java.util.Scanner;
public class Clase2Ejercicio1 {
    public static void main(String[] args) {
        //Defino las variables de trabajo
        float capital = 0, ganancia = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al Usuario
        System.out.println("Ingrese el capital que desea invertir");
        //capturo un dato desde el teclado 
        capital = teclado.nextFloat();
       //procesamos la informacion 
        ganancia = capital * 0.02f ;
        //mostramos los resultados por pantalla
        System.out.println("Usted obtendra de gananacia $ " + ganancia );
        
        
        /*Pseudocodigo:
        
        Leer(capital)
        ganancia = capital * 0.02
        mostrar(ganancia)
         */

    }

}
