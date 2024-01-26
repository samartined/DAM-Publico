
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String pssword = input.nextLine();
        System.out.println("Vuelve a introducir la contraseña. Tienes 3 intentos: ");
        String validada = input.nextLine();
        int intentos = 3;

        if (!validada.equals(pssword)) {

            do {
                intentos = --intentos;
                if (intentos == 0) {
                    System.out.println("Contraseña incorrecta. No le quedan más intentos.");
                    break;
                }
                System.out.println("Contraseña incorrecta. Vuelva a introducir la contraseña. Le quedan " + intentos + " intentos.");
                validada = input.nextLine();
            } while ((intentos > 0) && (!validada.equals(pssword)));

        } else {
            System.out.println("Enhorabuena");
        }
    }
}
