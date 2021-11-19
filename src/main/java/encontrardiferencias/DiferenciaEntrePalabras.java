package encontrardiferencias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
 *
 * @author Johan Ramirez Martinez
 */

public class DiferenciaEntrePalabras {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);

        System.out.println("Digita primera palabra: ");
        String palabra1 = lecturaTeclado.nextLine();
        System.out.println("Digita segunda palabra: ");
        String palabra2 = lecturaTeclado.nextLine();
        String[] caracteresPalabra1 = palabra1.split("");
        String[] caracteresPalabra2 = palabra2.split("");

        List<String> listaPalabra1 = Arrays.asList(caracteresPalabra1);
        List<String> listaPalabra2 = Arrays.asList(caracteresPalabra2);
        List<String> union = new ArrayList<>(listaPalabra1);
        List<String> interseccion = new ArrayList<>(listaPalabra1);

        union.addAll(listaPalabra2);
        interseccion.retainAll(listaPalabra2);
        union.removeAll(interseccion);

        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("las palabras son iguales");
        }
        else{
            System.out.println("Las diferencias son: ");
            union.forEach(System.out::println);
        }
    }
}
