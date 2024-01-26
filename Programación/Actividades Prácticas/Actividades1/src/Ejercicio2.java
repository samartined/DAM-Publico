import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int numero1 = 0;
        int numero2 = 0;

        while (opcion != 4) {
            System.out.println("Menú interactivo");
            System.out.println("1. Introducir el primer número");
            System.out.println("2. Introducir el segundo número");
            System.out.println("3. Mostrar la suma de los números introducidos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduzca el primer número: ");
                    numero1 = scanner.nextInt();
                    break;
                case 2:
                    if (numero1 == 0) {
                        System.out.println("Debe introducir el primer número primero.");
                    } else {
                        System.out.print("Introduzca el segundo número: ");
                        numero2 = scanner.nextInt();
                    }
                    break;
                case 3:
                    if (numero1 == 0 || numero2 == 0) {
                        System.out.println("Debe introducir ambos números primero.");
                    } else {
                        int suma = numero1 + numero2;
                        System.out.println("La suma de los números es: " + suma);
                        numero1 = 0;
                        numero2 = 0;
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        scanner.close();
    }
}
