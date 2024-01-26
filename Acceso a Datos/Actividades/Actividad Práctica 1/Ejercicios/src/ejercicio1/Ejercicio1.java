package ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String rutaFichero = "Ejercicios/src/ejercicio1/mi_fichero.txt";
        Scanner input = new Scanner(System.in);
        int option = 0;

        System.out.println("Bienvenido al programa de escritura y modificación de ficheros.\n");

        while (option != 4) {
            System.out.println("Menú:");
            System.out.println("1.- Escribir en el fichero");
            System.out.println("2.- Leer el contenido del fichero");
            System.out.println("3.- Borrar el contenido del fichero");
            System.out.println("4.- Salir");
            System.out.print("Ingrese una opción: ");
            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    escribirEnFichero(input, rutaFichero);
                    break;

                case 2:
                    leerFichero(input, rutaFichero);
                    break;

                case 3:
                    borrarFichero(rutaFichero);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }
        input.close();
    }

    private static void escribirEnFichero(Scanner input, String rutaFichero) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(rutaFichero, true); // Usar true para agregar al final del fichero
            System.out.println("Escriba su texto: ");
            String textoUsuario = input.nextLine();
            fw.write(textoUsuario + "\n"); // Escribir en el fichero
            System.out.println("Texto escrito con éxito.");
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close(); // Cerrar el FileWriter
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    private static void leerFichero(Scanner input, String rutaFichero) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(rutaFichero);
            br = new BufferedReader(fr);
            String linea;
            System.out.println("Contenido del fichero:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al abrir el documento: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    private static void borrarFichero(String rutaFichero) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(rutaFichero);
            fw.write(""); // Escribir una cadena vacía para borrar el contenido del fichero
            System.out.println("Contenido del fichero borrado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        } finally {
            try {
                if (fw != null) {
                    fw.close(); // Cerrar el FileWriter
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}
