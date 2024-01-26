package ejercicio5.cuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String operacionTransferencia;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //El método siguiente podría funcionar pero no nos sirve para la implementacion de la respuesta dada al ejercicio.
//    public void ingresarDinero() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Indique la cantidad a ingresar: ");
//        double cantidadIndicada = input.nextDouble();
//        if (cantidadIndicada > 0) {
//            saldo += cantidadIndicada;
//        } else {
//            System.out.println("La cantidad indicada no es válida.");
//        }
//    }
    public void retirarDinero(double cantidad) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la cantidad a ingresar: ");
        double cantidadIndicada = input.nextDouble();
        if (saldo >= cantidadIndicada) {
            saldo -= cantidadIndicada;
            System.out.println("Retirada de dinero realizada con éxito.\nSu saldo actual es de " + saldo + " €.");
        } else {
            System.out.println("No dispone de saldo suficiente.");
        }
    }

    //CORREGIMOS
//    public void transferencia() { // AQUÍ DEBERÍA SER UN VERBO
//        Scanner input = new Scanner(System.in);
//        System.out.println("Indique el número de cuenta al que quiere realizar la transferencia: ");
//        String cuentaIndicada = input.nextLine();
//        System.out.println("Indique la cantidad a transferir: ");
//        double cantidadIndicada = input.nextDouble();
////        boolean cuentaRegistrada = false;
//    
//        
//        
//        if (cuentaIndicada.equals(numeroCuenta)) {
//            if (this.saldo >= cantidadIndicada) {
//                this.saldo -= cantidadIndicada;
//                saldo += cantidadIndicada;
//
//            } else {
//                System.out.println("No dispone de saldo suficiente.");
//            }
//        } else {
//            System.out.println("La cuenta indicada no existe.");
//        }
//}
    public void transferir(double cantidad, CuentaBancaria cuentaDestino) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            cuentaDestino.depositarDinero(cantidad); // Llama al método para depositar en la cuenta de destino.
            System.out.println("Transferencia realizada con éxito.");
        } else {
            System.out.println("No dispone de saldo suficiente para realizar la transferencia.");
        }
    }

    public void depositarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito de dinero realizado con éxito.\nSu saldo actual es de " + saldo + " €.");
    }
}
