
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio27 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double numero;
        int contador = 0;

        do {
            System.out.println("Inserta un número (el programa no se detendrá hasta que insertes el número '-1': )");
            numero = input.nextDouble();
            contador++;

            System.out.println("Has introducido " + contador + " nuúmero/s.");

        } while (numero != -1);

    }
}
