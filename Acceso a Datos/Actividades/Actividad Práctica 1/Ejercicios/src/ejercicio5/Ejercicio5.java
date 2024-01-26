package ejercicio5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;

        System.out.println("Bienvenido al programa de carga y escritura de propiedades.\n");

        // Solicitar la ruta del fichero al usuario
        System.out.print("Ingrese la ruta del fichero properties: ");
        String rutaFichero = input.nextLine();

        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(rutaFichero)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Error al cargar el fichero properties.");
            e.printStackTrace();
            return;
        } finally {
            input.close();
        }

        while (option != 3) {
            System.out.println("Menú:");
            System.out.println("1.- Leer propiedad.");
            System.out.println("2.- Escribir propiedad y su valor.");
            System.out.println("3.- Guardar y salir.");
            System.out.print("Ingrese una opción: ");

            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre de la propiedad: ");
                    String propertyName = input.nextLine();
                    String propertyValue = properties.getProperty(propertyName);
                    if (propertyValue != null) {
                        System.out.println("El valor de la propiedad " + propertyName + " es: " + propertyValue);
                    } else {
                        System.out.println("La propiedad " + propertyName + " no existe.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre de la propiedad: ");
                    String newPropertyName = input.nextLine();
                    System.out.print("Ingrese el valor de la propiedad: ");
                    String newPropertyValue = input.nextLine();
                    properties.setProperty(newPropertyName, newPropertyValue);
                    System.out.println("Propiedad agregada con éxito.");
                    break;

                case 3:
                    try (FileOutputStream fileOutputStream = new FileOutputStream(rutaFichero)) {
                        properties.store(fileOutputStream, "Propiedades actualizadas");
                        System.out.println("Fichero properties actualizado y guardado con éxito.");
                    } catch (IOException e) {
                        System.out.println("Error al guardar el fichero properties.");
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        }
        input.close();
    }
}
