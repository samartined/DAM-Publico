package ejercicio1.gestorinventarioinformatico;

/**
 *
 * @author Edgar
 */
public class Microprocesador extends Componente {

    private int frecuencia;

    public Microprocesador(long referencia, String marca, String modelo, int frecuencia) {
        super(referencia, marca, modelo);
        this.frecuencia = frecuencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "Microprocesador {Referencia: " + getReferencia() + ", marca: " + getMarca() + ", modelo: " + getModelo() + ", frecuencia:" + frecuencia + " Ghz.}";
    }
}
