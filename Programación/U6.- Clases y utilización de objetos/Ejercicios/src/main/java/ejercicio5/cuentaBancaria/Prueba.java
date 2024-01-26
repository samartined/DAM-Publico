package ejercicio5.cuentaBancaria;

/**
 *
 * @author Edgar
 */
public class Prueba {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("12345", "Titular 1");
        CuentaBancaria cuenta2 = new CuentaBancaria("67890", "Titular 2");

        cuenta1.depositarDinero(1000); // Depositar 1000 en la cuenta 1
        cuenta1.transferir(500, cuenta2); // Transferir 500 desde la cuenta 1 a la cuenta 2

        System.out.println(cuenta2.getSaldo());

    }

}
