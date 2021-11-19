package preciomasiva;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
 * calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 *
 * @author Johan Ramirez Martinez
 */

public class PrecioMasIVA {
    public static void main(String[] args) {
        final double IVA = 0.21;
        double precio, precioMasIva;

        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita el precio del producto: ");
        try {
            precio = lecturaTeclado.nextDouble();
            precioMasIva = (precio * IVA) + precio;
            System.out.println("El precio final del producto + Iva es: " + precioMasIva);
        } catch (Exception ex) {
            System.out.println("Debes ingresar un numero valido, intenta nuevamente");
        }
    }
}
