package longitudfrase;

import java.util.Scanner;

/**
 * Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
 * indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de "a,e,i,o,u".
 *
 * @author Johan Ramirez Martinez
 */

public class LongitudFrase {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita la frase: ");
        String frase = lecturaTeclado.nextLine();

        int longitudFrase = frase.length();
        int cantidadVocales = frase.replaceAll("[^AEIOUaeiouáéíóú]","").length();
        int totalA = frase.replaceAll("[^Aaá]","").length();
        int totalE = frase.replaceAll("[^Eeé]","").length();
        int totalI = frase.replaceAll("[^Iií]","").length();
        int totalO = frase.replaceAll("[^Ooó]","").length();
        int totalU = frase.replaceAll("[^Uuú]","").length();
        System.out.println("Longitud de la frase: " + longitudFrase);
        System.out.println("Cantidad total de vocales: " + cantidadVocales);
        System.out.println(
                        "\ntotal de vocales 'a': " + totalA +
                        "\ntotal de vocales 'e': " + totalE +
                        "\ntotal de vocales 'i': " + totalI +
                        "\ntotal de vocales 'o': " + totalO +
                        "\ntotal de vocales 'u': " + totalU );
    }
}
