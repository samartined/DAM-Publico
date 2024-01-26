package ejercicio6;

public abstract class Producto {

    protected int id;
    protected String nombre;
    protected float precio;

    public Producto(int id, String nombre, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;

    }

    public abstract float calcularPrecioFinal();

}
