package ejercicio16persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        System.out.println("Digita nombre: ");
        String nombre = lecturaTeclado.nextLine();

        System.out.println("Digita edad: ");
        short edad = Short.parseShort(lecturaTeclado.nextLine());

        System.out.println("Digita sexo: H = hombre  M = mujer ");
        String sexo = lecturaTeclado.nextLine();

        System.out.println("Digita peso en Kg: ");
        float peso = lecturaTeclado.nextFloat();

        System.out.println("Digita altura en metros: ");
        float altura = lecturaTeclado.nextFloat();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        System.out.println(persona1.calcularIMC());
        System.out.println(persona2.calcularIMC());
        System.out.println(persona3.calcularIMC());

        System.out.println(persona1.esMayorDeEdad());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona3.esMayorDeEdad());

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
