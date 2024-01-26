
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        String listaFrutas[] = {"Manzana", "Plátano", "Naranja", "Uva", "Fresa", "Kiwi", "Sandía", "Piña", "Melocotón", "Cereza"};
        Scanner input = new Scanner(System.in);
        int eleccion;
        int indice = 1;

        System.out.println("Estas son nuestras frutas: ");
        for (String fruta : listaFrutas) {
            System.out.println(indice + ".- " + fruta);
            indice++;
        }

        while (true) {

            System.out.println("\nElige una opción:\n1. Escoger una fruta por posición.\n0. Salir");
            eleccion = input.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("\nIntroduce el valor numérico de la fruta que quieres o introduce 0 para salir: ");
                    do {
                        eleccion = input.nextInt();
                        if (eleccion >= 1 && eleccion <= listaFrutas.length) {
                            String frutaSeleccionada = listaFrutas[eleccion - 1];
                            System.out.println("Aquí tienes tu " + frutaSeleccionada);
                        } else if (eleccion == 0) {
                            System.out.println("\nHasta pronto.");
                            return;
                        } else {
                            System.out.println("Opción no válida. Por favor, introduce una opción válida: ");
                            continue;
                        }
                    } while ((eleccion > listaFrutas.length) && (eleccion != 1 && eleccion != 0));
                    break;
                case 0:
                    System.out.println("\nHasta pronto.");
                    input.close();
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, introduce una opción válida: ");
            }
        }
    }
}
