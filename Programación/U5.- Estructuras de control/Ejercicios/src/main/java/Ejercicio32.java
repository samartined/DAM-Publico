
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce una palabra por teclado: ");
        String palabra1 = input.nextLine();
        System.out.println("Introduce la segunda palabra para indicar si son iguales: ");
        String palabra2 = input.nextLine();

        var eliminadorEspacios1 = "";
        var eliminadorEspacios2 = "";
//
//        for (var i = 0; i < palabra1.length(); i++) {
//
//            eliminadorEspacios1 += palabra1.charAt(i);
//            if (eliminadorEspacios1.equals("")) {
//                eliminadorEspacios1.replace(" ", "");
//
//            }
//        }
//
//        for (var j = 0; j < palabra2.length(); j++) {
//
//            eliminadorEspacios2 += palabra2.charAt(j);
//            if (eliminadorEspacios2.equals("")) {
//                eliminadorEspacios2.replace(" ", "");
//            }
//        }

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son distintas.");

        }

        input.close();
    }
}
