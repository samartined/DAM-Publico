package ejercicio5.sistemaarchivos;

/**
 *
 * @author Edgar
 */
public class Archivo extends SistemaFicheros {

    private int tamaño;

    // Constructor
    public Archivo(String nombre, int tamaño) {
        super(nombre);
        this.tamaño = tamaño;
    }

    @Override
    public int getTamaño() {
        return tamaño;
    }

}
