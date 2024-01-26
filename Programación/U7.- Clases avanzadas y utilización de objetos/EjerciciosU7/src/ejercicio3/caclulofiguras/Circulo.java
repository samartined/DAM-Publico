package ejercicio3.caclulofiguras;

/**
 *
 * @author Edgar
 */
public class Circulo implements FiguraGeometrica {

    private double radio;
    private double diametro;

    public Circulo(double radio) {
        this.radio = radio;
        this.diametro = radio * 2;
    }

    @Override
    public double calcularArea() {
        double areaCirculo = Math.PI * (radio * radio);
        areaCirculo = Math.round(areaCirculo * 100.0) / 100.0;
        System.out.println("El área del círculo es: " + areaCirculo);
        return areaCirculo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroCirculo = Math.PI * diametro;
        perimetroCirculo = Math.round(perimetroCirculo * 100.0) / 100.0;
        System.out.println("El perímetro del círculo es: " + perimetroCirculo);
        return perimetroCirculo;
    }
}
