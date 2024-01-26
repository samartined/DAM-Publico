package ejercicio3.ecuacionsegundogrado;

/**
 *
 * @author Edgar
 */
public class EcuacionSegundoGrado {

    private double a, b, c;

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double[] calcularSoluciones() {
        double discriminante = b * b - 4 * a * c;
        double[] soluciones = new double[2]; // Puede haber hasta 2 soluciones reales

        if (discriminante > 0) {
            // Dos soluciones reales distintas
            soluciones[0] = (-b + Math.sqrt(discriminante)) / (2 * a);
            soluciones[1] = (-b - Math.sqrt(discriminante)) / (2 * a);
        } else if (discriminante == 0) {
            // Una solución real (raíz doble)
            soluciones[0] = -b / (2 * a);
        } else {
            // No hay soluciones reales
            soluciones[0] = Double.NaN; // NaN (No es un número)
            soluciones[1] = Double.NaN;
        }

        return soluciones;
    }

    public String getEcuacion() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }

    public static void main(String[] args) {

        EcuacionSegundoGrado ecuacion2g = new EcuacionSegundoGrado(1, -3, 2);
        System.out.println("Ecuacion: " + ecuacion2g.getEcuacion());

        double[] soluciones = ecuacion2g.calcularSoluciones();
        if (soluciones == null) {
            System.out.println("No hay soluciones reales.");
        } else {
            System.out.println("Soluciones: ");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.println("x" + (i + 1) + " = " + soluciones[i]);
                if (i < soluciones.length - 1) {

                }
            }
        }

    }
}
