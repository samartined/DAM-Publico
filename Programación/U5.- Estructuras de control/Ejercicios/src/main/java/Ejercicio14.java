
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        System.out.println("Calculadora de ecuaciones de segundo grado.\nIntroduzca el valor a: ");
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        System.out.println("Introduce b: ");
        double b = input.nextDouble();
        System.out.println("Introduce c: ");
        double c = input.nextDouble();

        double discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante < 0) {
            System.out.println("\nNinguna de las soluciones son números eales.");
        } else if (discriminante == 0) {
            double operacion = (-b + (Math.sqrt(discriminante))) / (2 * a);
            System.out.println("\nLa ecuación tiene una única solución.\nEl resultado es " + operacion);

        } else {
            double operacionPositiva = (-b + (Math.sqrt(discriminante))) / (2 * a);
            double operacionNegativa = (-b - (Math.sqrt(discriminante))) / (2 * a);
            System.out.println("\nLa ecuación tiene dos soluciones.\n");
            System.out.println("x1 = " + operacionPositiva);
            System.out.println("x2 = " + operacionNegativa);

        }
    }
}
