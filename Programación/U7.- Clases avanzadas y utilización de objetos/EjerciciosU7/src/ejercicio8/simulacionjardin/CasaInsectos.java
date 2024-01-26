package ejercicio8.simulacionjardin;

public class CasaInsectos extends Caseta {
    private String tipoInsectos;

    public CasaInsectos(String nombre, String material, Ubicacion ubicacion, String tipoInsectos) {
        super(nombre, material, ubicacion);
        this.tipoInsectos = tipoInsectos;
    }

    @Override
    public void muestraCaracteristicas() {
        super.muestraCaracteristicas();
        System.out.print(" Tipo de insectos: " + tipoInsectos + ".\n");
    }
}
