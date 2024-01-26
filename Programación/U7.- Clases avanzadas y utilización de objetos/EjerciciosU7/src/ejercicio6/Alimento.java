package ejercicio6;

public class Alimento extends Producto {
    private final float IMPUESTO_VENTAS = 0.15f;

    public Alimento(int id, String nombre, float precio) {
        super(id, nombre, precio);
    }

    @Override
    public float calcularPrecioFinal() {
        return precio + (precio * IMPUESTO_VENTAS);
    }

}
