package ejercicio3.caclulofiguras;

/**
 *
 * @author Edgar
 */
public class Ej3 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        Rectangulo rectangulo = new Rectangulo(23, 67);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();

        Triangulo triangulo = new Triangulo(4, 06, 4, 5, 3);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();

    }
}
