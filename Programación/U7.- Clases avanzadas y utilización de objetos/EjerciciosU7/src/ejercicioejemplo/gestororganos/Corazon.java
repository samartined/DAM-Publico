package ejercicioejemplo.gestororganos;

/**
 *
 * @author Edgar
 */
public class Corazon extends Organo {

    public int frecuenciaCardiaca;

    public Corazon(int idPaciente, String estadoOrgano, int frecuenciaCardiaca) {
        super(idPaciente, estadoOrgano);
        this.frecuenciaCardiaca = frecuenciaCardiaca;

    }

    public String mostrarFC() {
        return "Frecuencia Cardiaca: " + frecuenciaCardiaca + "pm.";
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Corazón: IDPaciente: " + idPaciente + ", Frecuencia Cardiaca: " + frecuenciaCardiaca + "pm, estado de salud del órgano: " + estadoOrgano);
    }

    public void comprobarFC() {
        var estadoFC = (frecuenciaCardiaca >= 60 && frecuenciaCardiaca <= 100) ? "Frecuencia cardiaca normal." : "Frecuencia cardiaca anormal.";
        System.out.println(estadoFC);
    }

}
