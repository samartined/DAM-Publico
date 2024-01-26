
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        final double IVA = 0.21;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor para calcular el precio final con IVA: ");
        double valor = input.nextDouble();
        double operacion = valor + (valor * IVA);
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("Precio con IVA: " + df.format(operacion));
    }
}
