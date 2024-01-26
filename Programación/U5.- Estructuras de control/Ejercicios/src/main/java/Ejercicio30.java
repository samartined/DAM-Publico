
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio30 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Intrfoduce una frase: ");
        String frase = input.nextLine();

        System.out.println("Elige: ¿Quieres tu frase en minúsculas o en mayúsculas: ");
        String opcion;
        boolean incorrecto = false;

        do {
            opcion = input.nextLine();

            switch (opcion.toLowerCase()) {
                case "minúsculas", "minusculas", "minúscula", "minuscula":
                    System.out.println(frase.toLowerCase());
                    break;

                case "mayúsculas", "mayusculas", "mayúscula", "mayuscula":
                    System.out.println(frase.toUpperCase());
                    break;

                default:
                    incorrecto = true;
                    System.out.println("Por favor, introduzca una opción válida: ");
            }
        } while (incorrecto);
    }
}
