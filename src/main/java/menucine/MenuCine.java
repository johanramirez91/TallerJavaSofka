package menucine;

import java.util.Scanner;

/**
 * Hacer un programa que muestre el siguiente menú de opciones
 * ****** GESTION CINEMATOGRáFICA ********
 * 1-NUEVO ACTOR
 * 2-BUSCAR ACTOR
 * 3-ELIMINAR ACTOR
 * 4-MODIFICAR ACTOR
 * 5-VER TODOS LOS ACTORES
 * 6- VER PELICULAS DE LOS ACTORES
 * 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
 * 8-SALIR
 * <p>
 * EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES
 * DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR
 * UN MENSAJE " OPCION INCORRECTO". Y MOSTRAR EL MENU NUEVAMENTE.
 * PISTA: CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.
 *
 * @author Johan Ramirez Martinez
 */

public class MenuCine {
    public static void main(String[] args) {
        Scanner lecturaOpcion = new Scanner(System.in);
        short opcion = 0;
        do {
            System.out.println("****** GESTION CINEMATOGRáFICA ********");
            System.out.println("""
                      1-NUEVO ACTOR
                      2-BUSCAR ACTOR
                      3-ELIMINAR ACTOR
                      4-MODIFICAR ACTOR
                      5-VER TODOS LOS ACTORES
                      6- VER PELICULAS DE LOS ACTORES
                      7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
                      8-SALIR
                    """);
            try {
                opcion = lecturaOpcion.nextShort();
                if (opcion > 8 && opcion < 1) {
                    System.out.println("Opción incorrecta, intenta nuevamente");
                }
            } catch (Exception ex) {
                System.out.println("Opción invalida, digita un número entre 1 y 8");
            }

            switch (opcion) {
                case 1 -> System.out.println("Nuevo Actor");
                case 2 -> System.out.println("Buscar Actor");
                case 3 -> System.out.println("Eliminar Actor");
                case 4 -> System.out.println("Modificar Actor");
                case 5 -> System.out.println("Ver todos los actores");
                case 6 -> System.out.println("Ver películas de los actores");
                case 7 -> System.out.println("Ver categoría de las películas de los actores");
                case 8 -> System.out.println("Hasta pronto...");
                default -> System.out.println("Opción incorrecta, intenta nuevamente");
            }
        } while (opcion != 8);
    }
}
