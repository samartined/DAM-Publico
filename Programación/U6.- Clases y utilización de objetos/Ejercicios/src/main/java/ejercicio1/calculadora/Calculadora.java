package ejercicio1.calculadora;

/**
 *
 * @author Edgar
 */
public class Calculadora {

    private int numero1, numero2;

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int producto(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

}
