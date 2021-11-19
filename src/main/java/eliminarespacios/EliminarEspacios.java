package eliminarespacios;

import java.util.Scanner;

/**
 * Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.
 *
 * @author Johan Ramirez Martinez
 */

public class EliminarEspacios {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita tu frase: ");
        String frase = lecturaTeclado.nextLine();
        String fraseSinEspacios = frase.replaceAll("\\s+","");
        System.out.println("Frase sin espacios: ");
        System.out.println(fraseSinEspacios);
    }
}
