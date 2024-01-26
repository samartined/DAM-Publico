package ejercicio4.Reloj;

/**
 *
 * @author Edgar
 */
public class Prueba {

    public static void main(String[] args) {

        Reloj reloj = new Reloj();

        System.out.println("La fecha que tiene el reloj es: " + reloj.obtenerFechaHora("dd/MM/yyyy"));

        System.out.println("La hora que tiene el reloj es: " + reloj.obtenerFechaHora("hh:mm:ss"));

        System.out.println("Iniciamos el cronometro");
        reloj.iniciarCronometro();

        // Se esperan 15 segundos para corroborar su funcionamiento
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Paramos el cronómetro");
        reloj.pararCronometro();

        System.out.println("El tiempo cronometrado ha sido: " + reloj.obtenerTiempoCronometrado());
    }
}
