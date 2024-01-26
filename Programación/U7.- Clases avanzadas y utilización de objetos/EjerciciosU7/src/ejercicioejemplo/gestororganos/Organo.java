package ejercicioejemplo.gestororganos;

/**
 *
 * @author Edgar
 */
public class Organo {

    protected int idPaciente;
    protected String estadoOrgano;

    public Organo(int idPaciente, String estadoOrgano) {
        this.idPaciente = idPaciente;
        this.estadoOrgano = (true) ? "sano" : "enfermo";
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getEstadoOrgano() {
        return estadoOrgano;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setestadoOrgano(String estadoOrgano) {
        this.estadoOrgano = estadoOrgano;
    }

    public void mostrarDetalles() {
        System.out.println("Órgano: IDPaciente: " + idPaciente + ", estado de salud del órgano: " + estadoOrgano);
    }

}
