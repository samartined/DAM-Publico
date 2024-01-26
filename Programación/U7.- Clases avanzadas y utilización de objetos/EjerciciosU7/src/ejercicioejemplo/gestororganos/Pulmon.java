package ejercicioejemplo.gestororganos;

/**
 *
 * @author Edgar
 */
public class Pulmon extends Organo {

    public double capacidad;

    public Pulmon(int idPaciente, String estadoOrgano, int capacidadPulmonar) {
        super(idPaciente, estadoOrgano);
        this.capacidad = capacidadPulmonar;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Corazón: IDPaciente: " + idPaciente + ", Frecuencia Cardiaca: " + capacidad + "ml, estado de salud del órgano: " + estadoOrgano);
    }
}
