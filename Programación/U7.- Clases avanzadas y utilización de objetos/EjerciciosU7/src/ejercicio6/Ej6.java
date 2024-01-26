package ejercicio6;

public class Ej6 {
    public static void main(String[] args) {

        Producto p1 = new Electronico(1, "Laptop", 200f);
        Producto p2 = new Alimento(2, "Manzana", 1f);
        Producto p3 = new Ropa(3, "Camisa", 50f, true);

        System.out.println("Precio final del producto " + p1.nombre + ": " + p1.calcularPrecioFinal());
        System.out.println("Precio final del producto " + p2.nombre + ": " + p2.calcularPrecioFinal());
        System.out.println("Precio final del producto " + p3.nombre + ": " + p3.calcularPrecioFinal());
    }
}
