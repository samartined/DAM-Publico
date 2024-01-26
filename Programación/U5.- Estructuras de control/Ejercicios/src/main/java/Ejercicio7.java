
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número por pantalla para indicarte el valor ASCII que le corresponde: ");

        int valorASCII = scanner.nextInt();

        char caracter = (char) valorASCII;

        System.out.println("\nEl carácter es: " + caracter);

    }
}
