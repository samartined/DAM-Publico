package ejercicio8.simulacionjardin;

public class Insecto extends Organismo implements Movilidad {

    public Insecto(String nombre, Ubicacion ubicacion) {
        super(nombre, ubicacion);
    }

    public void comer(Organismo organismo) {
        if (organismo instanceof Insecto) {
            System.out.println(getNombre() + " se alimenta de insectos.");
        } else if (organismo instanceof Planta) {
            System.out.println(getNombre() + " se alimenta de plantas.");
        } else {
            System.out.println("No puede comer este tipo de organismo.");
        }
    }

    public void mover(Ubicacion ubicacion) {
        System.out.println(getNombre() + " se ha movido a la ubicación: " + ubicacion + ".");
    }

    public void trasladar(Ubicacion ubicacion) {
        System.out.println(getNombre() + " se traslada a la ubicación: " + ubicacion + ".");
    }

    @Override
    public void muestraCaracteristicas() {
        System.out.println("Insecto: " + getNombre() + ", ubicación: " + getUbicacion() + ".");
    }
}