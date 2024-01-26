package ejercicio8.simulacionjardin;

public class Ave extends Organismo {

    public Ave(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
    }

    public void trasladar(Ubicacion ubicacion) {
        System.out.println("El ave " + getNombre() + " vuela a la ubicación: " + ubicacion + ".");
    }

    @Override
    public void muestraCaracteristicas() {
        System.out.println("Ave: " + getNombre() + ", ubicación: " + getUbicacion() + ".");
    }
}