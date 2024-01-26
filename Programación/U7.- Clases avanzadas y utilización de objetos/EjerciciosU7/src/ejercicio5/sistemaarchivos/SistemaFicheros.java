package ejercicio5.sistemaarchivos;

/**
 *
 * @author Edgar
 */
public abstract class SistemaFicheros {

    private String nombre;

    // Constructor
    public SistemaFicheros(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getTamaño();

}
