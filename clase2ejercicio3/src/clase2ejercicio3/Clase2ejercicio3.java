/*3)Un maestro desea saber que porcentaje de hombres y que porcentaje de
mujeres hay en un grupo de estudiantes  */
package clase2ejercicio3;
import java.util.Scanner;
public class Clase2ejercicio3 {
    public static void main(String[] args) {
        //Defino las variabels de trabajo 
        double numHombres = 0, numMujeres = 0, totalAlumnos = 0, pocentajeH = 0, pocentajeM = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario
        System.out.println("Por favor ingrese la cantidad de mujeres");
        numMujeres = teclado.nextDouble(); 
        System.out.println("Por favor ingrese la cantidad de hombres");
        numHombres = teclado.nextDouble(); 
        //procesamos la informacion
        totalAlumnos =  numHombres + numMujeres ;
        pocentajeH = numHombres * 100 / totalAlumnos ;
        pocentajeM = numMujeres * 100 / totalAlumnos ;
        //mostramos resultado por pantalla 
        System.out.println("el porcentaje de Hombres es " + pocentajeH  + "%");
        System.out.println("el porcentaje de Mujeres es " + pocentajeM + "%");
        System.out.println("El total de alumnos de su grupo es " + totalAlumnos);
    }

}
