package reeemplazarletras;

import java.util.Scanner;

/**
 * Del texto, "La sonrisa sera la mejor arma contra la tristeza"
 * Reemplaza todas las a del String anterior por una e, adicionalmente concatenar a
 * esta frase una adicional que ustedes quieran incluir por consola y las muestre luego unidas.
 *
 * @author Johan Ramirez Martinez
 */

public class ReemplazoLetras {
    public static void main(String[] args) {
        final String FRASE = "La sonrisa sera la mejor arma contra la tristeza";
        Scanner lecturaTeclado = new Scanner(System.in);
        String reemplazoFrase = FRASE.replace("a", "e");
        System.out.println("Digita tu frase: ");
        String fraseUsuario = lecturaTeclado.nextLine();
        System.out.println(reemplazoFrase.concat(fraseUsuario));
    }
}
