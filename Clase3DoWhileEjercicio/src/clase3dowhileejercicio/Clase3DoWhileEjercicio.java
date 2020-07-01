/*1) Desarrollar un algoritmo que permita ingresar 10 números enteros por
teclado y que muestre por pantalla el promedio. */
package clase3dowhileejercicio;

import java.util.Scanner;

public class Clase3DoWhileEjercicio {

    public static void main(String[] args) {
        float promedio = 0;
        float limite = 10, contador = 1, suma = 0, num = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el numero " + contador);   
            num = teclado.nextFloat();
            //suma += num;
            suma = suma + num;
            contador++;
        } while (contador <= limite);
        //calculamos el promedio 
        promedio = suma / limite;
        System.out.println("El promedio de los numero ingresado es :" + promedio);

    }

}
