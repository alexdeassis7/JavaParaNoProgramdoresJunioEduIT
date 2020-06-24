/*1) Desarrollar un algoritmo que permita ingresar un número entero
comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al
que se corresponde. */
package clase2condicionalmultiple;

import java.util.Scanner;

public class Clase2CondicionalMultiple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroingresado = 0;
        System.out.println("Ingrese un numero entre 1 y 7 ");
        numeroingresado = teclado.nextInt();
        //UTILIZAMOS CONDICIONAL MULTIPLE 
        switch (numeroingresado) {
            case 1:
                System.out.println("el dia 1 es Domingo");
                break;
            case 2:
                System.out.println("el dia 2 es Lunes");
                break;
            case 3:
                System.out.println("el dia 3 es Martes");
                break;
            case 4:
                 System.out.println("el dia 4 es Miercoles");
                break;
            case 5:
                 System.out.println("el dia 5 es Jueves");
                break;
            case 6:
                 System.out.println("el dia 6 es Viernes");
                break;
            case 7:
                System.out.println("El dia 7 es Sabado ");
                break;
            default:
                System.out.println("El numero " + numeroingresado + " Es invalido !");
        }
        System.out.println("Fin del programa");

    }

}
