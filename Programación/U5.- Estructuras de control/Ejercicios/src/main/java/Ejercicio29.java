
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        String totalCadena = "";

        do {
            System.out.println("Introduce una frase: ");
            frase = input.nextLine();

            totalCadena += frase + " ";

        } while (frase != "");

        System.out.println(totalCadena);

    }
}
