
import java.util.Scanner;

/**
 * Crea un programa que reciba un string y encuentre la palabra más larga en el
 * string. Ignora los signos de puntuación y distingue entre mayúsculas y
 * minúsculas. En caso de empate se indicará la primera palabra que se encuentre
 * con más caracteres.
 *
 * @author Edgar
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        String frase = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. "
                + "Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) "
                + "desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, "
                + "sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s "
                + "con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, "
                + "como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum";
        String palabraMasLarga = "";
        String[] cadena = frase.split(" ");

        for (String palabra : cadena) {
            String palabraLimpia = palabra.replaceAll("[^a-zA-Z]", "");
            if (palabraLimpia.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabraLimpia;
            }
        }
        System.out.println("La palabra más larga es: " + palabraMasLarga);
    }
}
