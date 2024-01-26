package ejercicio8.simulacionjardin;

public class CasaAves extends Caseta {
    private int cantidadPajaros;

    public CasaAves(String nombre, String material, Ubicacion ubicacion, int cantidadPajaros) {
        super(nombre, material, ubicacion);
        this.cantidadPajaros = cantidadPajaros;
    }

    @Override
    public void muestraCaracteristicas() {
        super.muestraCaracteristicas();
        System.out.println(" Cantidad de aves: " + cantidadPajaros + ".\n");
    }
}
