package numerohastamil;

import java.util.Scanner;

/**
 * Crear un programa que pida un numero por teclado y que imprima por pantalla
 * los números desde el numero introducido hasta 1000 con saldos de 2 en 2.
 *
 * @author Johan Ramirez Martinez
 */

public class NumeroHastaMil {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita un número entero para obtener secuencia: ");
        int numero = lecturaTeclado.nextInt();
        if (numero > 1000){
            System.out.println("El numero debe ser menor que 1000, intenta de nuevo.");
        }
        for (int secuencia = numero; secuencia <= 1000 ; secuencia+=2) {
            System.out.println(secuencia);
        }
    }
}
