package ejercicio15;

public class Main {

    public static void main(String[] args) {

        // Declaración de variables
        final double VELOCIDAD_LUZ = 299792.458;
        double distanciaSol_tierra = Math.pow(149.6, 9);

        // Cálculo del tiempo que tarda la luz en llegar del Sol a la Tierra
        double tiempo = distanciaSol_tierra / VELOCIDAD_LUZ;

        // Mostrar resultado redondeado a 2 decimales
        String tiempoRedondeado = String.format("%.2f", tiempo);
        System.out.println(
            "El tiempo que tarda la luz en llegar del Sol a la Tierra es de " + tiempoRedondeado + " segundos."
                + "\n");

        // Pasar segundos a horas y minutos
        int horas = (int) tiempo / 3600;
        int minutos = (int) (tiempo % 3600) / 60;
        int segundos = (int) tiempo % 60;

        // Mostrar resultado
        System.out.println("El tiempo que tarda la luz en llegar del Sol a la Tierra es de " + horas + " horas, "
            + minutos + " minutos y " + segundos + " segundos.");
    }
}