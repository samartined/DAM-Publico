import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ahora procederemos a dividir ambos números.");

        if (num2 == 0) {

            System.out.println("El resultado de la división es: 0.");

        }

        else if (num1 == 0) {

            System.out.println("Resultado indefinido.");

        }

        else {
            int resultado = num1 / num2;

            System.out.println("El resultado de la división es: " + resultado + ".");
        }

    }

}
