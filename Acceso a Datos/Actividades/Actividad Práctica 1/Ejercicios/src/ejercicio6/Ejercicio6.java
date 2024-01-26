package ejercicio6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {

    private static final String ALUMNOS_FILE = "alumnos.dat";
    private static final String INDICE_FILE = "indice.dat";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            escribirDatosIniciales();
            System.out.print("Ingrese el identificador del alumno: ");
            int identificador = input.nextInt();
            leerDatosPorIdentificador(identificador);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        input.close();
    }

    private static void escribirDatosIniciales() throws IOException {
        try (RandomAccessFile alumnosFile = new RandomAccessFile(ALUMNOS_FILE, "rw");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(INDICE_FILE))) {

            Map<Integer, Long> indiceMap = new HashMap<>();

            escribirAlumno(alumnosFile, "Juan Perez", 5, indiceMap);
            escribirAlumno(alumnosFile, "Maria González", 7, indiceMap);
            escribirAlumno(alumnosFile, "Carlos Rodríguez", 3, indiceMap);

            objectOutputStream.writeObject(indiceMap);
        }
    }

    private static void escribirAlumno(RandomAccessFile alumnosFile, String nombre, int nota,
            Map<Integer, Long> indiceMap) throws IOException {
        long posicionActual = alumnosFile.getFilePointer();

        indiceMap.put(indiceMap.size() + 1, posicionActual);

        alumnosFile.writeUTF(nombre);
        alumnosFile.writeInt(nota);

        indiceMap.put(indiceMap.size(), posicionActual);
    }

    private static void leerDatosPorIdentificador(int identificador) throws IOException, ClassNotFoundException {
        try (RandomAccessFile alumnosFile = new RandomAccessFile(ALUMNOS_FILE, "r");
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(INDICE_FILE))) {

            Map<Integer, Long> indiceMap = (Map<Integer, Long>) objectInputStream.readObject();

            if (indiceMap.containsKey(identificador)) {
                long posicion = indiceMap.get(identificador);

                alumnosFile.seek(posicion);

                if (alumnosFile.getFilePointer() < alumnosFile.length()) {
                    System.out.println("Identificador: " + identificador);
                    System.out.println("Nombre: " + alumnosFile.readUTF());
                    System.out.println("Nota: " + alumnosFile.readInt());
                } else {
                    System.out.println("No hay datos disponibles");
                }

            } else {
                System.out.println("Identificador no encontrado");
            }
        }
    }
}
