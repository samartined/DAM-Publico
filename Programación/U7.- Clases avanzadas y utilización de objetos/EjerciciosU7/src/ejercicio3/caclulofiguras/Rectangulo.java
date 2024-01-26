package ejercicio3.caclulofiguras;

/**
 *
 * @author Edgar
 */
public class Rectangulo implements FiguraGeometrica {

    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        double areaRectangulo = largo * ancho;
        areaRectangulo = Math.round(areaRectangulo * 100.0) / 100.0;
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        return areaRectangulo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroRectangulo = (largo * 2) + (ancho * 2);
        perimetroRectangulo = Math.round(perimetroRectangulo * 100.0) / 100.0;
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
        return perimetroRectangulo;
    }

}
