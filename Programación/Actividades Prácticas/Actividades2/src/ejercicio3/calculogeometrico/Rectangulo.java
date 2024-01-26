package ejercicio3.calculogeometrico;

public class Rectangulo implements Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return this.ancho * this.alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (this.ancho + this.alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
    }
}
