package impareswhile;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
 *
 * @author Johan Ramirez Martinez
 */

public class ImparesWhile {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 100) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero += 1;
        }
    }
}
