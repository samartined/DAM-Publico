
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número e indicaré si es un número primo o no: ");
        int num = input.nextInt();

        while (num == 1 || num == 0) {
            System.out.println(num + " no es un número primo. Por favor, introduce un número mayor que 1: ");
            num = input.nextInt();
        }

        for (int i = 2; i <= num; i++) {

            if ((num % num == 0 && num % 1 == 0) && num % i != 0) {
                System.out.println(num + " es primo.");
                break;
            } else {
                System.out.println(num + " no es primo.");
                break;
            }
        }
        
        // ESTA MAL

    }
}
