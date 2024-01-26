
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        String fraseSinEspacios = "";

//        for (char i = frase.charAt(0); i < frase.length(); i++) {
//            if (i == ' ') {
//                i = Character.re;
//            }
//        }
        for (int i = 0; i < frase.length(); i++) {

            fraseSinEspacios = frase.replace(" ", "");
        }
        System.out.println(fraseSinEspacios);
    }
}
