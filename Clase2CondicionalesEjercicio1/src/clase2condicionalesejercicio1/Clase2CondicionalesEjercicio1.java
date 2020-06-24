/*1) Implementar un algoritmo que calcule y muestre por pantalla el valor
final de la compra de un artículo. El algoritmo debe permitir el ingreso del
precio del artículo y la cantidad de artículos. Si el subtotal es superior a
1000, entonces se debe aplicar un descuento del 10 %.*/
package clase2condicionalesejercicio1;
import java.util.Scanner;
public class Clase2CondicionalesEjercicio1 {
    public static void main(String[] args) {
        //DEFINO MIS VARIABLE DE TRABAJO 
        Scanner teclado  = new Scanner(System.in);
        int cantidad = 0;
        float precio = 0 , descuento = 0 ,subtotal = 0, totalCompra = 0;
        //solicitamos datos al usuario 
        System.out.println("Ingrese el precio del articulo");
        precio = teclado.nextFloat();
        System.out.println("Ingrese la cantidad de articulos a comprar");
        cantidad = teclado.nextInt();
        //procesamos la informacion 
        subtotal = precio * cantidad;
        //APLICAMOS CONDICIONAL SIMPLE
        if (subtotal > 1000){
           descuento = subtotal * 0.10f;
        }        
        totalCompra = subtotal - descuento;
        //APLICAMOS CONDICIONAL SIMPLE
        if(descuento > 0 ){
            System.out.println("Se Aplico un descuento de $" + descuento);
        }        
        System.out.println("el valor final de la compra es : $" + totalCompra);
            
        
    }
    
}
