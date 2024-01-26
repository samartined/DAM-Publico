package ejercicio2.gestorproductos;

public class EmpresaMain {
    public static void main(String[] args) {

        // Crear productos
        ProductoElectronico laptop = new ProductoElectronico(1, "Laptop", 1000, 50);
        ProductoBelleza perfume = new ProductoBelleza(2, "Perfume", 50, 0.1);

        // Crear paquete
        Pack pack = new Pack(3, "Electronics Pack", 0.1);
        pack.agregarProducto(laptop);
        pack.agregarProducto(perfume);

        // Mostrar precios finales
        System.out.println("Precio final Laptop: " + laptop.calcularPrecioFinal() + " €.");
        System.out.println("Precio final Perfume: " + perfume.calcularPrecioFinal() + " €.");
        System.out.println("Precio final Electronics Pack: " + pack.calcularPrecioFinal() + " €.");
    }
}
