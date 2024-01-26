package ejercicio4;

import java.io.File;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la ruta del directorio: ");
        String directoryPath = scanner.nextLine();
        scanner.close();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                String type = file.isDirectory() ? "d" : "-";
                String readPermission = file.canRead() ? "r" : "-";
                String writePermission = file.canWrite() ? "w" : "-";
                String executePermission = file.canExecute() ? "x" : "-";
                long size = file.length();
                String name = file.getName();
                System.out.println(type + "rwx   " + size + "   " + name);
            }
        } else {
            System.out.println("El directorio no existe o no es accesible.");
        }
    }
}