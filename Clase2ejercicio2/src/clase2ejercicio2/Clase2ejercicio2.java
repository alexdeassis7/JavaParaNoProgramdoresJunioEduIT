/*2)Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente 
desea saber cuanto debera pagar finalmente por su compra  */
package clase2ejercicio2;
import java.util.Scanner;
public class Clase2ejercicio2 {
    public static void main(String[] args) {
        //Definimos las variables de trabajo 
        float totalCompra = 0 , totalAPagar = 0 ,  descuento = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos dato al usuario
        System.out.println("ingrese por favor el total de su compra");
        totalCompra = teclado.nextFloat();
        //procesamos la infomarcion 
        descuento = totalCompra * 0.15f;
        totalAPagar = totalCompra - descuento;
        //mostramos los resultados
        System.out.println("usted pagara $ " + totalAPagar );
        System.out.println("se aplico descuento del 15% , el decuento final fue $" + descuento);
        
    }
    
}
