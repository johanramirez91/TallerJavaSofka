package imparesfor;

/**
 * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle for.
 *
 * @author Johan Ramirez Martinez
 */


public class ImparesFor {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
