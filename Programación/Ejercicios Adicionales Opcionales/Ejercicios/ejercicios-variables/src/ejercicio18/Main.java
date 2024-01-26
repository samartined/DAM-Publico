package ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x: ");
        double x = scanner.nextDouble();

        double resultado = Math.pow(Math.E, Math.PI * x);

        double resultadoRedondeado = Math.round(resultado * 100.0) / 100.0;

        System.out.println("El resultado de e(π * x) es: " + resultadoRedondeado);

        scanner.close();
    }
}