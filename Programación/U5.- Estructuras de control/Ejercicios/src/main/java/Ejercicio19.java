
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo: ");
        int num = sc.nextInt();
        while (num < 0) {
            System.out.println("Valor incorrecto. Introduzca un número válido: ");
            num = sc.nextInt();
            if (num >= 0) {
                break;
            }
        }
        String numCasting = String.valueOf(num);
        int cifras = 0;
        for (int i = 0; i < numCasting.length(); i++) {
            cifras += 1;
        }

        System.out.println("El número " + num + " tiene " + cifras + " cifra/s.");
    }
}
