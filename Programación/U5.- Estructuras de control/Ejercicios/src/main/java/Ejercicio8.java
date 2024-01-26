
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un carácter por pantalla para indicarte la numeración ASCII que le corresponde: ");

        char caracter = input.next().charAt(0);

        int numeroASCII = (int) caracter;

        System.out.println("\nEl número del código ASCII que le corresponde es: " + numeroASCII);
    }
}
