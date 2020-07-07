/*8)Simular el comportamiento de un reloj digital,
imprimiendo la hora, minutos y segundos de un día desde las 0:00:00 hasta las 23:59:59*/
package clase4repasoforejericiosextras8;

public class Clase4RepasoForEjericiosExtras8 {

    public static void main(String[] args) {
        System.out.println("Inicio del Reloj digital");
        for (int hs = 0; hs <= 23; hs++) { //for externo que controla las horas del reloj
            for (int min = 0; min <= 59; min++) {//for interno 1 que controla los minutos
                for (int seg = 0; seg <= 59; seg++) {//for interno 2 que controla los Segundos
                    System.out.println(hs + ":" + min + ":" + seg);
                }
            }
        }
        System.out.println("Fin del Reloj digital");
    }

}
