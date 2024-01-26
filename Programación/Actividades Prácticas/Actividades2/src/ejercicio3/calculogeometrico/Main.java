package ejercicio3.calculogeometrico;

public class Main {

    public static void main(String[] args) {
        // Instanciaciones de las clases
        Circulo circulo = new Circulo(5.0);
        Cuadrado cuadrado = new Cuadrado(4.0);
        Rectangulo rectangulo = new Rectangulo(6.0, 8.0);

        // Uso de los métodos
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}
