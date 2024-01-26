package ejercicio8.simulacionjardin;

public class Caseta implements Movilidad {

    protected String nombre;
    protected String material;
    protected Ubicacion ubicacion;

    public Caseta(String nombre, String material, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.material = material;
        this.ubicacion = ubicacion;
    }

    @Override
    public void mover(Ubicacion ubicacion) {
        System.out.println("La caseta no puede moverse por sí sola.");
    }

    @Override
    public void trasladar(Ubicacion ubicacion) {
        System.out.println("La caseta " + nombre + " se ha trasladado a la ubicación x: " + ubicacion.getX() + ", "
                + ubicacion.getY() + ".");
    }

    public void muestraCaracteristicas() {
        System.out.println("Casa: " + nombre + ", material: " + material + ", ubicación: " + ubicacion + ":");
    }

}
