package ejercicio2;

/*Escribe un programa que lea el contenido de un fichero y escriba su contenido al revés en el mismo fichero. Por ejemplo, si el contenido leído es “Esta es una frase de ejemplo” debe escribir  “ejemplo de frase una es Esta” */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        String filePath = "/home/edgar/Desktop/Actividad Práctica 1/Ejercicios/src/ejercicio2/fichero.txt";

        try {
            // Inicializamos StringBuilder con la frase deseada
            StringBuilder content = new StringBuilder("Esta es una frase de ejemplo\n");

            // Leemos el archivo
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            }

            // Dividimos el contenido en líneas, invertir cada línea y reconstruir
            String[] lines = content.toString().split("\n");
            StringBuilder reversedContent = new StringBuilder();
            for (String ln : lines) {
                String[] words = ln.split("\\s+");
                Collections.reverse(Arrays.asList(words));
                reversedContent.append(String.join(" ", words)).append("\n");
            }

            // Escritura en el archivo
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(reversedContent.toString().trim());
            }

            System.out.println("Contenido invertido y escrito en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo.");
            e.printStackTrace();
        }
    }
}
