package ejercicio4.gestorinstrumentos;

/**
 *
 * @author Edgar
 */
public class Piano implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Estoy tocando el piano.");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando el piano.");
    }

    @Override
    public String tipoInstrumento() {
        return "Piano.";
    }
}
