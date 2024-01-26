package ejercicio2.gestorvehiculos;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Moto extends Vehiculo {

    private String sistemaArranque = (true) ? "manual" : "eléctrico";

    // Constructor
    public Moto(String marca, String modelo, double precio) {
        super(marca, modelo, precio);
    }

    // Lógica
    @Override
    public void arrancarVehiculo() {
        super.arrancarVehiculo();
        System.out.println("La moto ha utilizado el encendido " + sistemaArranque + ".");
    }

    public String getSistemaArranque() {
        return "Sistema de arranque: " + sistemaArranque + ".";
    }

    public void setTipoArranque() {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el nuevo sistema de arranque: \n(m: 'Manual'; e: 'eléctrico') -->");
        String indicacionSistemaArrancado;

        while (true) {
            indicacionSistemaArrancado = input.nextLine();
            switch (indicacionSistemaArrancado) {
                case "m":
                    sistemaArranque = "manual";
                    return;
                case "e":
                    sistemaArranque = "eléctrico";
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

//toString
    @Override
    public String toString() {
        return "Moto {marca: " + getMarca() + ", modelo: " + getModelo() + ", precio: " + getPrecio() + "€, estado de arranque: " + isEstaArrancado() + ", sistema de arranque: " + sistemaArranque + ".}";
    }

}
