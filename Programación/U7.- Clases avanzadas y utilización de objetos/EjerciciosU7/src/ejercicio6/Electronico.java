package ejercicio6;

public class Electronico extends Producto {
    private final float TARIFA_RECICLAJE = 10.0f;

    public Electronico(int id, String nombre, float precio) {
        super(id, nombre, precio);
    }

    @Override
    public float calcularPrecioFinal() {
        return precio + TARIFA_RECICLAJE;
    }
}