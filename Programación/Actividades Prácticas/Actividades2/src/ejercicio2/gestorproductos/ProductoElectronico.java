package ejercicio2.gestorproductos;

public class ProductoElectronico extends Producto {

    private double tarifaReciclaje;

    public ProductoElectronico(int codigo, String nombre, double precio, double tarifaReciclaje) {
        super(codigo, nombre, precio);
        this.tarifaReciclaje = tarifaReciclaje;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + tarifaReciclaje;
    }
}
