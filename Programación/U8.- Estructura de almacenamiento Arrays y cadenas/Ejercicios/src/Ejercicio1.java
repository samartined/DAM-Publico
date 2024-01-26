
/**
 *
 * @author Edgar
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int[] arrayEnteros = new int[100];

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i] = i + 1;
        }

        for (int i = 0; i < arrayEnteros.length; i++) {
            if (arrayEnteros[i] % 2 == 0) {
                System.out.println(arrayEnteros[i]);
            }
        }
    }
}
