package ejercicio7;

public class CuentaInversion extends Cuenta {
    private static final float INTERES = 0.06f;

    public CuentaInversion(String numeroCuenta, String titular, double precio) {
        super(numeroCuenta, titular, precio);
    }

    @Override
    public double calcularInteres() {
        return saldo * INTERES;
    }
}
