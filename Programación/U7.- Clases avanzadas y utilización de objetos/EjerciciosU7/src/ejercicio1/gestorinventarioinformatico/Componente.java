package ejercicio1.gestorinventarioinformatico;

/**
 *
 * @author Edgar
 */
public class Componente {

    //Campos
    protected long referencia;
    protected String marca;
    protected String modelo;

    // Constructor
    public Componente(long referencia, String marca, String modelo) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public long getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Setters
    public void setReferecia(long nuevaReferencia) {
        this.referencia = nuevaReferencia;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    // toString
    @Override
    public String toString() {
        return "Componente {Referencia: " + referencia + ", Marca: " + marca + ", Modelo: " + modelo + ".}";
    }
}
