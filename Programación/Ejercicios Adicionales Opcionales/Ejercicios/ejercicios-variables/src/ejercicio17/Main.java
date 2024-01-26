package ejercicio17;

public class Main {
    public static void main(String[] args) {
        double numero = 16.5;
        double raizCuadrada = Math.sqrt(numero);
        int resultado = (int) Math.round(raizCuadrada);
        System.out.println("La raíz cuadrada de " + numero + " es " + resultado);
    }
}
