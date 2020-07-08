/*2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el
elemento uno del vector A con el elemento uno del vector B y así sucesivamente
hasta 45, almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla.*/
package clase4arraysejercicio2;
public class Clase4ArraysEjercicio2 {
    public static void main(String[] args) {
        //definimos los 3 vectores 
        int cantidadDeElementos = 10;
        int[] vectorA = new int[cantidadDeElementos];
        int[] vectorB = new int[cantidadDeElementos];
        int[] vectorC = new int[cantidadDeElementos];
           //Cargamos los vectores A y B
        for (int i = 0; i < cantidadDeElementos; i++) {
            vectorA[i] = (int) (Math.random() * 10 + 1);
            vectorB[i] = (int) (Math.random() * 10 + 1);
        }
        //sumamos A + B y guardamos en C
        for (int i = 0; i < cantidadDeElementos; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        //mostramos el contenido de los vectores A ,B y C
        for (int i = 0; i < cantidadDeElementos; i++) {
            System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + (vectorA[i]+vectorB[i]));
        }
        
                
    }

}
