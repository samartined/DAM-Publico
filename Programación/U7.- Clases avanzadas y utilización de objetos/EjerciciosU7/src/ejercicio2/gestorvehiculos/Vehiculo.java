package ejercicio2.gestorvehiculos;

/**
 *
 * @author Edgar
 */
public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected double precio;
    protected boolean estaArrancado;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estaArrancado = false;
    }

    // Lógica
    public boolean isEstaArrancado() {
        return estaArrancado;
    }

    public void arrancarVehiculo() {
        this.estaArrancado = true;
        if (this instanceof Coche) {
            System.out.println("El coche está arrancando...");
        } else if (this instanceof Moto) {
            System.out.println("La moto está arrancando...");
        } else {
            System.out.println("El vehículo está arrancando...");
        }

    }

    public void pararVehiculo() {
        this.estaArrancado = false;
        if (this instanceof Coche) {
            System.out.println("El coche está parando...");
        } else if (this instanceof Moto) {
            System.out.println("La moto está parando...");
        } else {
            System.out.println("El vehículo está parando...");
        }
    }

    // Getters & Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Vehiculo {marca:" + marca + ", modelo:" + modelo + ", precio:" + precio + "€, estaArrancado:" + estaArrancado + "}";
    }

}
