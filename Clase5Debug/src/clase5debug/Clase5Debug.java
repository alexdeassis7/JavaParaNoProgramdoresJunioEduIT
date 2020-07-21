package clase5debug;

import javax.swing.JOptionPane;

public class Clase5Debug {

    public static void main(String[] args) {
        //solicitamos dato al usuario para dimensionar un array
        int cantidadDeElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros Aleatorios deseas generar??"));

        System.out.println("el numero ingresado en la ventana es " + cantidadDeElementos);

        //creamos el array 
        int num_aleatorios[] = new int[cantidadDeElementos];

        //cargamos la matriz de numeros aleatorios 
        for (int i = 0; i < num_aleatorios.length; i++) {
            num_aleatorios[i] = (int) (Math.random() * 100);
        }

        System.out.println("Mostramos el array cargado aleatoriamente ");
        for (int i = 0; i < num_aleatorios.length; i++) {
            System.out.println(num_aleatorios[i]);
        }
        System.out.println("Fin del Array ");

    }

}
