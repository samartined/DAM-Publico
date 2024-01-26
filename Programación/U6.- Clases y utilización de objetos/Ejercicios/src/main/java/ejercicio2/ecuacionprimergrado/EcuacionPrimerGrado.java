package ejercicio2.ecuacionprimergrado;

/**
 *
 * @author Edgar
 */
public class EcuacionPrimerGrado {

    private double a;
    private double b;

    public EcuacionPrimerGrado(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getCoeficienteA() {
        return a;
    }

    public double getCoeficienteB() {
        return b;
    }

    public double calcularSolucion() {
        // La solución de la ecuación ax + b = 0 es x = -b / a
        if (a == 0) {
            throw new ArithmeticException("La ecuación no tiene solución. 'a' no puede ser igual a 0.");
        }
        return -b / a;
    }

    public String toString() {
        // Representación de la ecuación en formato "ax + b = 0"
        return a + "x + " + b + " = 0";
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado(2.0, -8.0);
        System.out.println("Ecuación: " + ecuacion);
        try {
            double solucion = ecuacion.calcularSolucion();
            System.out.println("Solución: x = " + solucion);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
