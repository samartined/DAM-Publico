
/**
 *
 * @author Edgar
 */
public class Ejercicio24 {

    public static void main(String[] args) {

        String frase = "La lluvia en Madrid es una maravilla";
        String cadenaFinal = "";

        for (var i = 0; i < frase.length(); i++) {

            char silaba = frase.charAt(i);
            int asciiSilaba = (int) silaba;
            String cadenaASCII = String.valueOf(asciiSilaba) + " ";
            cadenaFinal += cadenaASCII + " ";

        }
        System.out.println("Frase original: " + frase);

        System.out.println("Frase en ASCII: " + cadenaFinal);
    }
}
