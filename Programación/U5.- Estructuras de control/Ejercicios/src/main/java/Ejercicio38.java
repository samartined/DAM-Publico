
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Se le pedirá que introduzca números hasta que ingrese un número con valor -1.");

        double numero;

        double Numeros[] = new double[100];
        int indice = 0;
        double numeroMayor = Double.MIN_VALUE;
        double numeroMenor = Double.MAX_VALUE;
        double suma = 0;
        double sumaPositivos = 0;
        double sumaNegativos = 0;
        double media = 0;

        do {
            System.out.println("Introduce un número: ");

            numero = input.nextDouble();

            if (numero != -1) {
                Numeros[indice] = numero;
                indice++;

                // Mostrar el mayor número
                if (numero > numeroMayor) {
                    numeroMayor = numero;
                }

                // Mostrar el menor número
                if (numero < numeroMenor) {
                    numeroMenor = numero;
                }

                // Suma de todos los numeros.
                suma += numero;
                media = suma / indice;

                // Verificar positivo o negativo
                if (numero >= 0) {
                    sumaPositivos += numero;

                } else {
                    sumaNegativos += numero;
                }

            }
        } while (numero != -1);

        System.out.println(
                "\nEl número más grande es: " + numeroMayor + ".");
        System.out.println(
                "El número más pequeño es: " + numeroMenor + ".");
        System.out.println(
                "La suma de todos los números es: " + suma + ".");
        System.out.println(
                "La suma de todos los números positivos es: " + sumaPositivos + ".");
        System.out.println(
                "La suma de todos los números negativos es: " + sumaNegativos + ".");
        System.out.println("La media de todos los números es: " + media + ".");

    }
}
