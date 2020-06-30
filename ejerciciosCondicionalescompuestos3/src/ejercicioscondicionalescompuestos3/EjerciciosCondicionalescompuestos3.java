/*1)	Determinar la cantidad de dinero que recibirá un trabajador por concepto 
de las horas extras trabajadas en una empresa, sabiendo que cuando las horas de
trabajo exceden de 40, el resto se consideran horas extras y que estas se pagan 
al doble de una hora normal cuando no exceden de 8 ; si las horas extras exceden 
de 8 se pagan las primeras 8 al doble de lo que se pagan las horas normales y el resto al triple */
package ejercicioscondicionalescompuestos3;
import java.util.Scanner;
public class EjerciciosCondicionalescompuestos3 {
    public static void main(String[] args) {
        //Defino las variables de trabajo 
        float hsTrabajadas = 0 , valorHora = 0 ,hsExtras = 0  , totalAPagar = 0 ,cobra_extras = 0 ;
        float paga_doble = 0 ,paga_triple = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al user
        System.out.println("Ingrese las horas trabajadas");
        hsTrabajadas = teclado.nextFloat();
        System.out.println("Ingrese el valor de la hora ");
        valorHora= teclado.nextFloat();
        //procesamos la informacion
        if(hsTrabajadas <= 40){
            totalAPagar =  hsTrabajadas * valorHora;
        }else{
            hsExtras = hsTrabajadas - 40 ;
            if(hsExtras  <= 8){
                cobra_extras = hsExtras * valorHora * 2 ;
            }else{
                paga_doble = 8 * valorHora * 2 ;
                paga_triple = (hsExtras - 8 ) * valorHora * 3;
                hsExtras = paga_doble + paga_triple;
            }
            totalAPagar = 40 * valorHora + hsExtras ;
        }
        System.out.println("El total a pagar es " + totalAPagar);
        
    }
    
}
