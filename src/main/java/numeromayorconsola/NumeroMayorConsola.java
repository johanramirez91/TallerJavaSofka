package numeromayorconsola;

import java.util.Scanner;

public class NumeroMayorConsola {
    public static void main(String[] args) {

        Scanner lecturaTeclado = new Scanner(System.in);
        try {
            System.out.println("Digita primer número: ");
            double numero1 = lecturaTeclado.nextDouble();
            System.out.println("Digita segundo número: ");
            double numero2 = lecturaTeclado.nextDouble();
            if (numero1 > numero2) {
                System.out.println("El número mayor es: " + numero1);
            } else if (numero1 == numero2) {
                System.out.println("Los numeros son iguales");
            } else {
                System.out.println("El número mayor es: " + numero2);
            }
        } catch (Exception ex) {
            System.out.println("Debes ingresar un numero valido, intenta nuevamente");
            System.out.println(ex);
        }

    }
}
