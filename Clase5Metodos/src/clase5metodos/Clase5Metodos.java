package clase5metodos;

import java.util.Scanner;

public class Clase5Metodos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int valorIngresado = 0;
        double ivaRetorno = 0;
        // Algoritmo Principal
        System.out.println("Inicio de la App");
        //Invocamos al procedimiento "ejecutar"
        //mostrarNumerosPares(50,100);        
        System.out.println("Por favor ingrese el valor del producto ");
        valorIngresado = teclado.nextInt();
        //INVOCAMOS A LA FUNCION IVA
        ivaRetorno = iva(valorIngresado);

        System.out.println("El precio final de su producto es $" + (valorIngresado + ivaRetorno));

        System.out.println("Fin de la App");
    }

    //Definimos Un Metodo del tipo Funcion
    public static double iva(int valor) {
        //Cuerpo de la funcion 
        double porcentaje = 0.21;
        double resultado = valor * porcentaje;
        return resultado;
    }

    //Definimos Un Metodo del tipo procedimiento
    public static void mostrarNumerosPares(int limiteInferior, int limiteSuperior) {
        //Cuerpo del Procedimiento 
        for (int i = limiteInferior; i <= limiteSuperior; i += 2) {
            System.out.println(i);
        }

    }

}
