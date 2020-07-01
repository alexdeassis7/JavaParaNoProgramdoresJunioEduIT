package clase3ejerciciowhile;

public class Clase3EjercicioWhile {

    public static void main(String[] args) {
        /*Mostrar todos los numeros pares entre 0 y 100
         */
        int x = 0;
        System.out.println("Mostramos lo numeros pares entre 0 y 100 ");
        while (x <= 100) {
            System.out.println("Numero : " + x);
            //contador = contador + 2;
            x += 2;
        }
        /*Mostrar todos los numeros pares entre 100 y 0
         */
        x = 100 ;
        System.out.println("Mostramos lo numeros pares entre 100 y 0 ");
        while(x >= 0){
            
            System.out.println("Numero : " + x);
            //contador = contador - 2
            x -= 2;
        }

    }

}
