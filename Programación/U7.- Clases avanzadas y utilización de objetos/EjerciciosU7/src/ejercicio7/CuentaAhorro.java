package ejercicio7;

public class CuentaAhorro extends Cuenta {
    private static final float TASA_INTERES = 0.03f;

    public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteres() {
        return saldo * TASA_INTERES;
    }
}
