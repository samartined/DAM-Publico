package ejercicio5.sistemaarchivos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class Directorio extends SistemaFicheros {

    private List<SistemaFicheros> contenido;

    public Directorio(String nombre) {
        super(nombre);
        contenido = new ArrayList<>();
    }

    public void añadir(SistemaFicheros sistemaFicheros) {
        contenido.add(sistemaFicheros);
    }

    @Override
    public int getTamaño() {
        int tamañoTotal = 0;
        for (SistemaFicheros sistemaFicheros : contenido) {
            tamañoTotal += sistemaFicheros.getTamaño();
        }
        return tamañoTotal;
    }
}
