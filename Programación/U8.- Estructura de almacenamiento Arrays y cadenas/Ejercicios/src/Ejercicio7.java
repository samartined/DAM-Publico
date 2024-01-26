
/*A partir de una cadena de texto cualesquiera que contenga dígitos y caracteres, se pide extraer todos los números enteros y realizar la suma de todos ellos. Por ejemplo, de la siguiente cadena “El tigre vive alrededor de 10 años, suele medir 70 cm y puede llegar a comer 40kg de carne” el resultado tiene que ser (10+70+40) 120.
Nota: Se puede utilizar la función Character.isDigit para comprobar si un carácter es un digito o no. */

public class Ejercicio7 {
    public static void main(String[] args) {

        String cadena = "El tigre vive alrededor de 10 años, suele medir 70 cm y puede llegar a comer 40kg de carne";
        int suma = 0;
        String temporal = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (Character.isDigit(caracter)) {
                temporal += caracter;
            } else if (!temporal.equals("")) {
                suma += Integer.parseInt(temporal);
                temporal = "";
            }
        }
        if (!temporal.equals("")) {
            suma += Integer.parseInt(temporal);
        }
        System.out.println("La suma de los números es: " + suma);
    }
}
