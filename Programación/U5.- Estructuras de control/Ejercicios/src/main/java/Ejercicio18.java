
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

//        if (num1 < num2) {
//            for (double i = num1; i <= num2; i++) {
//
//                double random = Math.random();
//                int randomEntero = (int) (random * i);
//                System.out.println(randomEntero);
//
//            }
//        }
//        if (num2 < num1) {
//            for (double i = num2; i <= num1; i++) {
//
//                double random = Math.random();
//                int randomEntero = (int) (random * i);
//                System.out.println(randomEntero);
//
//            }
//        }
        // CORREGIDO
        if (num1 > num2) { //Esta línea verifica si num1 es mayor que num2. En otras palabras, está comprobando si el primer número ingresado (num1) es mayor que el segundo número ingresado (num2).
            double temp = num1; // Si la condición del if es verdadera, se ejecuta esta línea. Aquí se crea una variable temporal (temp) y se le asigna el valor de num1. Básicamente, estamos guardando el valor de num1 en una variable temporal para evitar que se pierda.
            num1 = num2; //Luego, se asigna el valor de num2 a num1. Esto significa que num1 ahora tendrá el valor del segundo número ingresado (num2).
            num2 = temp; // Finalmente, se asigna el valor de la variable temporal temp a num2. Esto significa que num2 ahora tendrá el valor original de num1, que se guardó en la variable temporal en el paso 2.
        }

        System.out.println("Generando 10 números aleatorios entre " + num1 + " y " + num2 + ":");

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = (int) (Math.random() * ((int) num2 - (int) num1 + 1)) + (int) num1;

//Math.random(): La función Math.random() genera un número decimal aleatorio en el rango [0, 1), lo que significa que puede generar números decimales desde 0 (inclusive) hasta 1 (exclusivo).
//((int) num2 - (int) num1 + 1): En esta parte se realiza una operación para determinar el rango de números enteros entre num1 y num2(inclusive).(int) num2 y (int) num1 se utilizan para truncar los números a enteros si no lo son ya. Luego se resta num1 de num2 y se suma 1 para obtener el número total de enteros en el rango.
//(int) (Math.random() * ((int) num2 - (int) num1 + 1)): Multiplicamos el resultado del paso anterior por el valor generado por Math.random().Esto nos da un número decimal aleatorio en el rango[0, n), donde n es la cantidad total de enteros en el rango[num1, num2].
//+ (int) num1: A la salida del paso 1, tenemos un número decimal aleatorio en el rango[0, n). Luego sumamos num1 para desplazar este rango al rango deseado[num1, num2]. Como resultado, obtenemos un número aleatorio entero entre num1 y num2, ambos inclusive.System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);
        }
        sc.close();
    }
}
