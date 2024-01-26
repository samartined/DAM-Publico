
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author Edgar
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Calculadora del área de un círculo.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo: ");

        double radio = scanner.nextDouble();
        double radioAlCuadrado = Math.pow(radio, 2);
        final double NUMERO_PI = 3.1416;
        var areaDelCirculo = radioAlCuadrado * NUMERO_PI;

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nEl área del círculo es: " + df.format(areaDelCirculo));

    }

}
