
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] listaNumeros = new int[20];

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = new Random().nextInt(100);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Lista de Números: " + Arrays.toString(listaNumeros));

        while (true) {
            System.out.print(
                    "\nBienvenido. ¡Se han generado 20 números aleatorios!\nIntroduce:\n1 - para introducir nuevos números en la lista de forma aleatoria,\n2 - para mostrar la lista de 20 números,\n3 - para ordenar la lista en orden ascendente, \n4 - para cerrar el programa.\nEscoge: ");

            int eleccionMenu = input.nextInt();

            switch (eleccionMenu) {

                // Cuantos elementos nuevos se van a guardar
                case 1:
                    System.out.print(
                            "\nCuantos elementos nuevos quieres que se generen (entre 1 y 20): \tPara volver al menú pulsa 0.");
                    System.out.println("");
                    int numerosParaGenerar;
                    do {
                        numerosParaGenerar = input.nextInt();
                        if (numerosParaGenerar < 1 || numerosParaGenerar > 20) {
                            System.out
                                    .print("Valor no admisible. Por favor, introduce un número entero entre 1 y 20: ");
                        } else if (numerosParaGenerar == 0) {
                            System.out.println("\nVolviendo al menú...");
                            break;
                        }

                    } while (numerosParaGenerar < 1 || numerosParaGenerar > 20);

                    int[] listaConNuevosNumeros = new int[listaNumeros.length + numerosParaGenerar];
                    System.arraycopy(listaNumeros, 0, listaConNuevosNumeros, 0, listaNumeros.length);

                    for (int i = listaNumeros.length; i < listaConNuevosNumeros.length; i++) {
                        listaConNuevosNumeros[i] = new Random().nextInt(100);
                    }
                    listaNumeros = listaConNuevosNumeros.clone();
                    imprimirArray(listaNumeros);
                    break;

                // Mostrar en cualquiero momentos los elementos
                case 2:
                    imprimirArray(listaNumeros);
                    break;

                // Ordenar contenido de forma ascendente
                case 3:
                    System.out.println("");
                    Arrays.sort(listaNumeros);
                    System.out.println("¡La lista de números se ha ordenado!");
                    imprimirArray(listaNumeros);
                    System.out.println("Volviendo al menú...\n");
                    break;

                // Salir del programa
                case 4:
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void imprimirArray(int[] array) {
        System.out.println("\nLa lista contiene los siguientes números: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + ".\n");
        System.out.println();
    }
}
