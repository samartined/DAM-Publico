/*Realiza un programa que tome una frase e imprima por pantalla cada palabra en una nueva línea, junto con su longitud y su posición inicial y final en la cadena original. */

public class Ejercicio8 {
    public static void main(String[] args) {

        String cadena = "The class String includes methods for examining individual characters of the sequence, for comparing strings, for searching strings, "
                + "for extracting substrings, and for creating a copy of a string with all characters translated to uppercase or to lowercase";

        int posicion = 0;

        String[] palabras = cadena.split(" ");

        for (String palabra : palabras) {
            int longitud = palabra.length();
            System.out.println("Palabra: " + palabra);
            System.out.println("Longitud: " + longitud);
            System.out.println("Posición inicial: " + posicion);
            System.out.println("Posición final: " + (posicion + longitud - 1));
            System.out.println("----------------------------------------");

            posicion += 1;
        }

    }
}
