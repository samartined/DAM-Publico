package ejercicio3;

/*Uno de los mayores problemas que existen con la lectura y escritura de datos en ficheros, es la codificación. Existen diferentes codificaciones (ANSI, Latin, ISO 8859, UTF, etc..) por eso nos piden hacer un programa para recodificar un fichero. El programa debe abrir un fichero en una codificación concreta y generar un nuevo fichero con otra codificación que queramos.
NOTA. Para ver y cambiar la codificación que tiene un fichero se puede utilizar la aplicación Notepad++ desde el menú/Codificación.   */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ejercicio3 {
    public static void main(String[] args) {
        String inputFile = "Ejercicios/src/ejercicio3/input.txt"; // Fichero original
        String outputFile = "Ejercicios/src/ejercicio3/output.txt"; // Fichero de salida
        String inputEncoding = "ISO-8859-1"; // codificación actual del fichero original
        String outputEncoding = "UTF-8"; // codificación deseada para el fichero de salida

        try (FileInputStream inputStream = new FileInputStream(inputFile);
                InputStreamReader reader = new InputStreamReader(inputStream, inputEncoding);
                FileOutputStream outputStream = new FileOutputStream(outputFile);
                OutputStreamWriter writer = new OutputStreamWriter(outputStream, outputEncoding)) {

            // Para leer el contenido del fichero original y escribirlo en el fichero de
            // salida
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("El fichero ha sido recodificado con éxito.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al recodificar el fichero.");
            e.printStackTrace();
        }
    }
}
