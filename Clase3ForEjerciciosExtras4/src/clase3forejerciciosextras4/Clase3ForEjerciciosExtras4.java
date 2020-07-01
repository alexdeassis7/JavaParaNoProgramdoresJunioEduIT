/*4)	Leer 20 números e imprimir cuantos son positivos , cuantos negativos y cuantos neutros*/
package clase3forejerciciosextras4;

import java.util.Scanner;

public class Clase3ForEjerciciosExtras4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0 , contPositivos = 0 ,contNeutros = 0 , contNegativos = 0; 
        
        for (int i = 0; i < 20 ; i++) {            
            System.out.println("ingrese el numero "  + (i+1) );
            numeroIngresado = teclado.nextInt();
            if(numeroIngresado < 0){
                contNegativos ++;
            }else if(numeroIngresado > 0){
                contPositivos ++;
            }else {
                contNeutros ++;
            }
        }
        
        System.out.println("usted ingreso ");
        System.out.println(contPositivos + " positivos ");
        System.out.println(contNegativos + " negativos ");
        System.out.println(contNeutros + " Ceros ");
                
        
    }
    
}
