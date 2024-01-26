package ejercicio7;

public class CuentaCorriente extends Cuenta {
    private static final float TASA_INTERES = 0.5f;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo) {
        super(numeroCuenta, titular, saldo);
    }

    @Override
    public double calcularInteres() {
        return saldo * TASA_INTERES;
    }
}
