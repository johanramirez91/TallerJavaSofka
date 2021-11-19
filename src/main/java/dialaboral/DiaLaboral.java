package dialaboral;

import java.util.Scanner;

/**
 * Crea una aplicación por consola que nos pida un día de la semana
 * y que nos diga si es un día laboral o no. Usa un switch para ello.
 *
 * @author Johan Ramirez Martinez
 */

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita un día de la semana, ejemplo: martes");
        String dia = lecturaTeclado.nextLine().toLowerCase();
        final String DIALABORAL = " es día laboral";
        switch (dia) {
            case "lunes"     ->   System.out.println(dia + DIALABORAL);
            case "martes"    ->   System.out.println(dia + DIALABORAL);
            case "miercoles" ->   System.out.println(dia + DIALABORAL);
            case "jueves"    ->   System.out.println(dia + DIALABORAL);
            case "viernes"   ->   System.out.println(dia + DIALABORAL);
            case "sabado"    ->   System.out.println(dia + " No es día laboral");
            case "domingo"   ->   System.out.println(dia + " No es día laboral");
            default          ->   System.out.println(dia + " No es un día de la semana, intenta nuevamente");
        }
    }
}
