
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String fraseCompleta = input.nextLine();

        String palabras[] = fraseCompleta.split(" ");
        System.out.println("Las palabras en la frase son: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        input.close();
    }
}
