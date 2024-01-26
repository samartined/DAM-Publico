
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número total de ventas");
        int numeroTotalVentas = input.nextInt();
//
//        System.out.println("Ahora introduce el valor de las ventas: ");
//        for (int i = 0; i < numeroTotalVentas; i++) {
//
//            int ventasEfectivas = input.nextInt();
//        }

        // Corrección
        double valorTotalVentas = 0;

        System.out.println("Ahora introduce el valor de las ventas: ");
        for (int i = 1; i <= numeroTotalVentas; i++) {
            System.out.println("Valor de la venta nº" + i + ": ");
            int ventasEfectivas = input.nextInt();
            valorTotalVentas += ventasEfectivas;
        }
        System.out.println("El total de las ventas es de " + valorTotalVentas);
    }
}
