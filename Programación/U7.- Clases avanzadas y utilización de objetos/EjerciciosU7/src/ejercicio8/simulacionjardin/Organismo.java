package ejercicio8.simulacionjardin;

public abstract class Organismo {
    private String nombre;
    private Ubicacion ubicacion;

    public Organismo(String nombre, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public abstract void muestraCaracteristicas();
}
