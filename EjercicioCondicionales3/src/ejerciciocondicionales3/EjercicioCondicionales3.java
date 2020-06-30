/*3) Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas  se le paga $16 por cada una de 
las primeras 40 horas y $20 por cada hora extra.*/
package ejerciciocondicionales3;

import java.util.Scanner;

public class EjercicioCondicionales3 {

    public static void main(String[] args) {
        //Defino las variables de trabajo 
        float salarioSemanal = 0, horasTrabajadas = 0, horasExtras = 0;
        Scanner teclado = new Scanner(System.in);
       
        //Solicitamos horas al usuario
        System.out.println("Ingrese las horas semanales trabajadas ");
        horasTrabajadas = teclado.nextFloat();
        //procesamos la informacion
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;//calculo la cantidad de hs extras que realizo 
            salarioSemanal = horasExtras * 20 + 40 * 16;
        } else {
            salarioSemanal = horasTrabajadas * 16;
        }
        //mostramos los resultados obtenidos 
        System.out.println("Su salario Semanal sera de $" + salarioSemanal);
        if (horasTrabajadas > 40) {
            System.out.println("Hs Extras : " + horasExtras + " $" + (horasExtras * 20));
        }

    }

}
