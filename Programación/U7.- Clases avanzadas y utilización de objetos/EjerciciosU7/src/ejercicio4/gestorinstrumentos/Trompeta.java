package ejercicio4.gestorinstrumentos;

/**
 *
 * @author Edgar
 */
public class Trompeta implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Estoy tocando la trompeta.");
    }

    @Override
    public void afinar() {
        System.out.println("Estoy afinando la trompeta.");
    }

    @Override
    public String tipoInstrumento() {
        return "Trompeta.";
    }
}
