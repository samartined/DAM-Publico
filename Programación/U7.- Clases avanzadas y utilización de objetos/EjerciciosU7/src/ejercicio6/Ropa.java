package ejercicio6;

public class Ropa extends Producto {
    private static final float PRECIO_MARCA = 20.0f;
    private boolean esDeMarca;

    public Ropa(int id, String nombre, float precio, boolean esDeMarca) {
        super(id, nombre, precio);
        this.esDeMarca = esDeMarca;
    }

    @Override
    public float calcularPrecioFinal() {
        return esDeMarca ? precio + PRECIO_MARCA : precio;
    }
}
