package ejercicio1.gestorinventarioinformatico;

/**
 *
 * @author Edgar
 */
public class DiscoDuro extends Componente {

    private int capacidad;

    public DiscoDuro(long referencia, String marca, String modelo, int capacidad) {
        super(referencia, marca, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro {Referencia: " + getReferencia() + ", marca: " + getMarca() + ", modelo: " + getModelo() + ", capacidad:" + capacidad + " TB.}";
    }
}
