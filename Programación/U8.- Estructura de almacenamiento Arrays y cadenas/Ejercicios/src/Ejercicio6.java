
/*
 * Escribe un programa que verifique si una frase es un palíndromo, ignorando los espacios, la puntuación y las diferencias entre mayúsculas y minúsculas. Un palíndromo es aquella expresión que se lee de izquierda a derecha que de derecha a izquierda.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        String cadena = "Anita lava la tina";
        System.out.println("La frase es un palíndromo: " + esPalindromo(cadena));
    }

    public static boolean esPalindromo(String str) {
        String cadenaSinEspacios = str.toLowerCase().replace(" ", "");
        String cadenaAlreves = "";
        for (int i = cadenaSinEspacios.length() - 1; i >= 0; i--) {
            cadenaAlreves += cadenaSinEspacios.charAt(i);
        }
        return cadenaSinEspacios.equals(cadenaAlreves);

    }
}
