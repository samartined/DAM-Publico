package ejercicio2.gestorvehiculos;

/**
 *
 * @author Edgar
 */
public class Ej2 {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Coche("Toyota", "G90", 7853.99);

        Coche coche = new Coche("Mercedes", "SB", 12893.23);
        coche.arrancarVehiculo();
//        coche.pararVehiculo();

        System.out.println();

        Moto moto = new Moto("Yamaha", "R6 Race 2022", 11445);
        moto.arrancarVehiculo();
        moto.pararVehiculo();

        System.out.println("");

        moto.setTipoArranque();

        System.out.println("Estado de los vehículos: ");
        System.out.println(coche);
        System.out.println(moto);

    }
}
