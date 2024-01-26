package ejercicio2.gestorproductos;

public class ProductoBelleza extends Producto {
    private double impuestoVentas;

    public ProductoBelleza(int codigo, String nombre, double precio, double impuestoVentas) {
        super(codigo, nombre, precio);
        this.impuestoVentas = impuestoVentas;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() + (getPrecio() + impuestoVentas);
    }
}
