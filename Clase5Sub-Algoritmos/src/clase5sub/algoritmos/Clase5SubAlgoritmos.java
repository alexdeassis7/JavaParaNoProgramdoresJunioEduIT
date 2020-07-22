/*Calcular El promedio de tres notas de un alumno y la definir la condicion  
de aprobado(promedio >= 6) o desaprobado(promedio < 6) */
package clase5sub.algoritmos;

import java.util.Scanner;

public class Clase5SubAlgoritmos {

    static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
    static Scanner teclado = new Scanner(System.in);
    static String condicionAlumno = "";

    public static void main(String[] args) {
        /**Lo resolvemos mediante Metodos
         SubProblemas 1: entrada de datos 
         SubProblemas 2: calculo del promedio 
         SubProblemas 3: calcula la condicion del alumno
         SubProblemas 4: Salida de resultados          
         */
        //solicitamos las notas al usuario
        solicitarNotas();
        //calculamos el promedio de las notas 
        calcularPromedio();
        //validamos la condicion del alumno 
        validarCondicion();
        //mostramos los resultados por pantalla 
        mostrarResultados();
        
    }
    //METODO 1 : Procedimiento que solicita las notas al usuario 
    public static void solicitarNotas() {
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();
    }
    //METODO 2 : Procedimiento que calcula el promedio 
    public static void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }
    //METODO 3 :Procedimiento que valida la condicion del alumno 
    public static void validarCondicion() {
        if (promedio >= 6) {
            condicionAlumno = "Aprobado";
        } else {
            condicionAlumno = "Desaprobado";
        }
    }
    //METODO 4 : procedimiento que muestras los resultados por pantalla 
    public static void mostrarResultados() {
        System.out.println("Las notas del alumnos son :" + nota1 + " - " + nota2 + " - " + nota3 + " - ");
        System.out.println("el promedio del alumno es : " + promedio);
        System.out.println("La condicion del alumno es " + condicionAlumno);
    }

}
