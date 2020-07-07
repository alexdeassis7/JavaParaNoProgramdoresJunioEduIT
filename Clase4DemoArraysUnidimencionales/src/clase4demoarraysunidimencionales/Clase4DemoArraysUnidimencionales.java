package clase4demoarraysunidimencionales;

import java.util.Scanner;

public class Clase4DemoArraysUnidimencionales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //defino el vector de 31 elemento 
        float[] tempDeAgosto = new float[31];
        //recorremos el vector con una estructura iterativa FOR
        for (int indice = 0; indice < 31; indice++) {
            System.out.println("TempDeAgosto [" + indice + "] = " + tempDeAgosto[indice]);
        }
        System.out.println("comenzamos a cargar las temperaturas del mes de agosto ");
        //cargamos el vector por teclado mediante un FOR
        for (int i = 0; i < 31; i++) {
            System.out.println("Por favor ingrese la temperatura del dia " + (i + 1));
            tempDeAgosto[i] = teclado.nextFloat();

        }
        //recorremos el vector con una estructura iterativa FOR
        for (int indice = 0; indice < 31; indice++) {
            System.out.println("TempDeAgosto [" + indice + "] = " + tempDeAgosto[indice]);
        }

    }

}
