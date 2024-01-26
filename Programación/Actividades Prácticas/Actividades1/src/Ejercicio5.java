import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos por teclado la fecha de nacimiento
        System.out.print("Ingrese la fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimientoStr = scanner.next();

        // Crear un objeto SimpleDateFormat con el patrón "dd/MM/yyyy"
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Parseamos la cadena de fecha a un objeto Date
            Date fechaNacimiento = formatoFecha.parse(fechaNacimientoStr);

            // Calculamos la edad
            int edad = calcularEdad(fechaNacimiento);

            // Mostramos la edad
            System.out.println("La edad es: " + edad + " años.");
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato especificado.");
        }

        scanner.close();
    }

    // Función para calcular la edad a partir de la fecha de nacimiento
    private static int calcularEdad(Date fechaNacimiento) {
        // Obtener la fecha actual
        Date fechaActual = new Date();

        // Calculamos la diferencia en milisegundos
        long diferenciaEnMillis = fechaActual.getTime() - fechaNacimiento.getTime();

        // Calculamos la edad en años
        int edadEnAnios = (int) (diferenciaEnMillis / (1000 * 60 * 60 * 24 * 365.25));

        return edadEnAnios;
    }
}
