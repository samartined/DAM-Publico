package ejercicio2.gestorvehiculos;

/**
 *
 * @author Edgar
 */
public class Coche extends Vehiculo {

    private final String sistemaArranque = "manual";

    // Constructor
    public Coche(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    // Lógica
    @Override
    public void arrancarVehiculo() {
        super.arrancarVehiculo();
        System.out.println("El coche ha utilizado el encendido " + sistemaArranque + ".");
    }

    public String getSistemaArranque() {
        return "Sistema de arranque: " + sistemaArranque + ".";
    }

    //toString
    @Override
    public String toString() {
        return "Coche {marca: " + getMarca() + ", modelo: " + getModelo() + ", precio: " + getPrecio() + ", estado de arranque: " + isEstaArrancado() + ", sistema de arranque: " + sistemaArranque + ".}";
    }
}
