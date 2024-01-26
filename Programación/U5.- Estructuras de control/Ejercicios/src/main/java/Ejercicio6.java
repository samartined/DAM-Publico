
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número y te indicaré si es divisible entre 2: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es número par divisible entre 2.");
        } else {
            System.out.println(numero + " es número impar y no es divisible entre 2.");
        }

    }
}
