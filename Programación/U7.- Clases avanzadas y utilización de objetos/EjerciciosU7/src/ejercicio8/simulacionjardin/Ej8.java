package ejercicio8.simulacionjardin;

public class Ej8 {
    public static void main(String[] args) {

        Organismo hormiga = new Insecto("Hormiga", new Ubicacion(0, 10));
        Organismo abeja = new Insecto("Abeja", new Ubicacion(0, 20));
        Organismo paloma = new Ave("Paloma", new Ubicacion(0, 30));
        Organismo aguila = new Ave("Aguila", new Ubicacion(0, 40));

        Organismo[] organismos = { hormiga, abeja, paloma, aguila };

        for (Organismo organismo : organismos) {
            organismo.muestraCaracteristicas();
        }

        ((Insecto) hormiga).comer(abeja);

        System.out.println("Ubicación de la hormiga: " + hormiga.getUbicacion() + ".");
        System.out.println("Ubicación de la abeja: " + abeja.getUbicacion() + ".");
        System.out.println("Ubicación de la paloma: " + paloma.getUbicacion() + ".");
        System.out.println("Ubicación de la aguila: " + aguila.getUbicacion() + ".");

        // Casting and method calls
        ((Insecto) hormiga).mover(new Ubicacion(5, 15));
        ((Insecto) abeja).mover(new Ubicacion(10, 25));
        ((Ave) paloma).trasladar(new Ubicacion(15, 35));
        ((Ave) aguila).trasladar(new Ubicacion(20, 45));

        System.out.println("Ubicación de la hormiga: " + hormiga.getUbicacion() + ".");
        System.out.println("Ubicación de la abeja: " + abeja.getUbicacion() + ".");
        System.out.println("Ubicación de la paloma: " + paloma.getUbicacion() + ".");
        System.out.println("Ubicación de la aguila: " + aguila.getUbicacion() + ".");
    }
}
