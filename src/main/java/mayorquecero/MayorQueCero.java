package mayorquecero;

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 *
 * @author Johan Ramirez Martinez
 */

import java.util.Scanner;

public class MayorQueCero {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numero = 0;
        do {
            try {
                System.out.println("Digita un numero entero: ");
                numero = lecturaTeclado.nextInt();
                if (numero >= 0) {
                    System.out.println(numero);
                }
            } catch (Exception ex) {
                System.out.println("Debes ingresar un número entero...");
            }
        } while (numero < 0);
    }
}
