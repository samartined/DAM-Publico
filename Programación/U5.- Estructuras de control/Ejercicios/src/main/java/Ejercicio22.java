
/**
 *
 * @author Edgar
 */
public class Ejercicio22 {

    public static void main(String[] args) {

        String frase = "La lluvia en Madrid es una maravilla";
        int contador = 0;

        for (var i = 0; i < frase.length(); i++) {

            var silaba = frase.charAt(i);
            switch (silaba) {
                case 'a', 'e', 'i', 'o', 'u' ->

                    contador++;
            }
        }

        System.out.println("Hay " + contador + " vocales.");
    }

}
