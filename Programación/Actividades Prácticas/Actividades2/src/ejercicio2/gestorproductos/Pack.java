package ejercicio2.gestorproductos;

import java.util.ArrayList;
import java.util.List;

public class Pack extends Producto {

    private List<Producto> productos;
    private double descuentoPorPack;

    public Pack(int codigo, String nombre, double descuentoPorPack) {
        super(codigo, nombre, 0); // El precio inicial se asigna en 0 ya que el precio final se calcula en base a los productos que contiene.
        
        this.productos = new ArrayList<>();
        this.descuentoPorPack = descuentoPorPack;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularPrecioFinal() {
        double precioTotal = productos.stream().mapToDouble(Producto::calcularPrecioFinal).sum();
        return precioTotal - (precioTotal * descuentoPorPack);
    }

}
