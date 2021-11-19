package numeromayor;

/**
* Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
  Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
 *
 * @author Johan Ramirez Martinez
 */

public class NumeroMayor {
    public static void main(String[] args) {
        double numero1 = 5;
        double numero2 = 0;
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("El número mayor es: " + numero2);
        }
    }
}
