package areacirculo;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
 (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 *
 * @author Johan Ramirez Martinez
 */

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        try {
            System.out.println("Digita el radio del circulo: ");
            double radio = lecturaTeclado.nextDouble();
            double area = Math.PI * Math.pow(radio, 2); //Otra opción: Math.PI * radio * radio
            System.out.println("El área del circulo es: " + area);
        } catch (Exception e) {
            System.out.println("Debes ingresar un número valido, intenta nuevamente");
        }
    }
}
