package ejercicio7;

public class Ej7 {
    public static void main(String[] args) {

        Cuenta[] cuentas = new Cuenta[3];

        cuentas[0] = new CuentaAhorro("12345", "John Doe", 10000);
        cuentas[1] = new CuentaCorriente("54321", "Jane Doe", 20000);
        cuentas[2] = new CuentaInversion("67890", "John Smith", 30000);

        for (Cuenta cuenta : cuentas) {
            double interes = cuenta.calcularInteres();
            System.out.printf(cuenta.toString() + " Interes: %.2f\n", interes);
        }
    }
}
