
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio15 {

    public static void main(String[] args) {

//        System.out.println("Introduce un número: "); ESTO ESTÁ MAL
        Scanner input = new Scanner(System.in);
        double num;
//
//        do {
//            System.out.println(num);
//        } while (num != 0);

        // CORREGIDO
        do {
            System.out.println("Introduce un número mayor o igual que cero: ");
            num = input.nextDouble();

            if (num < 0) {
                System.out.println("El número ingresado es menor que cero. Por favor, vuelve a intentarlo.");
            }
        } while (num < 0);

        System.out.println("El número ingresado es: " + num);
        input.close();

    }
}
