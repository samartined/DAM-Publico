
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num;

        do {
            System.out.println("Introduce un número: ");
            num = input.nextDouble();

            if (num <= 1) {
                System.out.println("El número que introduzcas debe ser mayor que 1. Introduzca un número válido: ");

            }
        } while (num <= 1);

        num++;
        System.out.println("Número incrementado: " + num);

        input.close();

    }

}
