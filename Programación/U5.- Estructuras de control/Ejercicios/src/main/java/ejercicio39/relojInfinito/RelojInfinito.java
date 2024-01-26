package ejercicio39.relojInfinito;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Edgar
 */
public class RelojInfinito {

    public static void main(String[] args) {

        while (true) {
            DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH.mm.ss");

            while (true) {

                LocalTime horaActual = LocalTime.now();
                String promptHora = horaActual.format(formatoHora);
                System.out.println("\r" + promptHora);

                // Esto es para que no se muestre la hora entera en bucle:
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
