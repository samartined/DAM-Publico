package ejercicio4.DNI;

import java.util.Scanner;

public class ValidadorDNI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir por teclado los números del DNI
        System.out.print("Ingresa los 8 dígitos del DNI: ");
        int numerosDNI = scanner.nextInt();

        // Pedir por teclado la letra del DNI
        System.out.print("Ingresa la letra del DNI: ");
        char letraDNI = scanner.next().toUpperCase().charAt(0);

        // Validar el DNI
        if (validarDNI(numerosDNI, letraDNI)) {
            System.out.println("El DNI ingresado es válido.");
        } else {
            System.out.println("El DNI ingresado no es válido.");
        }

        scanner.close();
    }

    // Función para validar el DNI
    private static boolean validarDNI(int numerosDNI, char letraDNI) {

        // Array con las letras posibles
        char[] letrasPosibles = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
                'V', 'H', 'L', 'C', 'K', 'E' };

        // Calcular el resto de la división de los números del DNI por 23
        int resto = numerosDNI % 23;

        // Verificar si la letra ingresada coincide con la calculada
        return letraDNI == letrasPosibles[resto];
    }
}
