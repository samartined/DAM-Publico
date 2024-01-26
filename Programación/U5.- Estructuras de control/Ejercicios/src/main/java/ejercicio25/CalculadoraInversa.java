package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class CalculadoraInversa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Introducimos números
        System.out.println("Introduce dos números enteros y un signo aritmético y efectuaremos la operación.\nIntroduce el primer número: ");
        int num1 = input.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = input.nextInt();
        input.nextLine();
        //Solicitamos el operando
        System.out.println("Introduce el signo aritmético (+, -, *, /, ^, %): ");
        String operando = input.nextLine();
        int operacion = 0;
        double operacionDouble = operacion;
        boolean operacionValida = true;

        switch (operando) {
            case "+":
                operacion = num1 + num2;
                break;

            case "-":
                operacion = num1 - num2;
                break;
            case "*":
                operacion = num1 * num2;
                break;
            case "/":
                operacionDouble = num1 / num2;
                break;
            case "^":
                operacionDouble = Math.pow(num1, num2);
                break;
            case "%":
                operacion = num1 % num2;
                break;

            default:
                operacionValida = false;
                break;
        }
        if (operacionValida) {
            switch (operando) {
                case "+", "-", "*", "%":
                    System.out.println(num1 + " " + operando + " " + num2 + " " + "=" + " " + operacion);
                    break;

                case "^", "/":
                    System.out.println(num1 + " " + operando + " " + num2 + " " + "=" + " " + operacionDouble);
                    break;
            }
        } else {
            System.out.println("El signo aritmético no es válido.");
        }
        input.close();
    }
}
