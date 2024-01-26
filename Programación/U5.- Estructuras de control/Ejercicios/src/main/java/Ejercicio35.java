
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio35 {

    enum Dia {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana: ");
        String entrada = input.nextLine().toUpperCase();

        Dia dia = Dia.valueOf(entrada);

        switch (dia) {
            case SABADO, DOMINGO:
                System.out.println("No es un dia laboral.");
                break;
            default:
                System.out.println("Es un día laboral.");
                break;

        }
        input.close();
    }
}
