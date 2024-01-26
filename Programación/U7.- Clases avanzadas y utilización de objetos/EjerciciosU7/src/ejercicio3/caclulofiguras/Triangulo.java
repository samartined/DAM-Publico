package ejercicio3.caclulofiguras;

/**
 *
 * @author Edgar
 */
public class Triangulo implements FiguraGeometrica {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double areaTriangulo = (base * altura) / 2;
        areaTriangulo = Math.round(areaTriangulo * 100.0) / 100.0;
        System.out.println("El área del triángulo es: " + areaTriangulo);
        return areaTriangulo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroTriangulo = lado1 + lado2 + lado3;
        perimetroTriangulo = Math.round(perimetroTriangulo * 100.0) / 100.0;
        System.out.println("El perímetro del triángulo es: " + perimetroTriangulo + " cm.");
        return perimetroTriangulo;
    }

}
