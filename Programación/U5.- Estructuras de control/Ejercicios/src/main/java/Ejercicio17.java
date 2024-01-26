
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        String diaSemana = input.nextLine();
        String tipoDia = "";

        switch (diaSemana.toLowerCase()) {
            case "lunes", "martes", "miércoles", "miercoles", "jueves", "viernes" ->
                tipoDia = "laboral.";
            case "sábado", "sabado", "domingo" ->
                tipoDia = "no laboral.";
        }

        System.out.println(diaSemana + " es " + tipoDia);

    }
}
