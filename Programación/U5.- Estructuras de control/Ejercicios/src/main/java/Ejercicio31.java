
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        int contador = 0;

        for (var i = 0; i < frase.length(); i++) {

            var comprobante = frase.charAt(i);
            if (comprobante == ' ') {

            } else {
                contador++;
            }
        }
        System.out.println("La frase tiene una longitud de " + contador + " carácteres.");
    }
}
