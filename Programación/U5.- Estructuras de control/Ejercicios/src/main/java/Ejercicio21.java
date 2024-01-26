
/**
 *
 * @author Edgar
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        for (int numero = 2; numero <= 100; numero++) {

            boolean esPrimo = true;
            int limite = (int) Math.sqrt(numero);

            for (int i = 2; i <= limite; i++) {

                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero);
            }
        }

    }

}
