package ejercicio8.simulacionjardin;

import java.sql.Date;

public class Planta extends Organismo {
    private Date fechaPlantacion;

    public Planta(String nombre, Ubicacion ubicacion, Date fechaPlantacion) {
        super(nombre, ubicacion);
        this.fechaPlantacion = fechaPlantacion;
    }

    public void trasladar(Ubicacion ubicacion) {
        System.out.println(getNombre() + " se traslada a: " + ubicacion + ".");
    }

    public void crece() {
        System.out.println(getNombre() + " ha crecido.");
    }

    public void fotoSintesis() {
        System.out.println(getNombre() + "realiza la fotosíntesis.");
    }

    public Date getFechaPlantancion() {
        return fechaPlantacion;
    }

    @Override
    public void muestraCaracteristicas() {
        System.out.println("Planta: " + getNombre() + ", ubicación: " + getUbicacion() + ", fecha de plantación: "
                + getFechaPlantancion() + ".");
    }

}
