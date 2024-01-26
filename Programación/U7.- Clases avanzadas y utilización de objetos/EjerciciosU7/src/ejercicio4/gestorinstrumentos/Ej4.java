package ejercicio4.gestorinstrumentos;

/**
 *
 * @author Edgar
 */
public class Ej4 {

    public static void main(String[] args) {

        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();
        Trompeta trompeta = new Trompeta();

        guitarra.afinar();
        guitarra.tocar();
        System.out.println("Instrumento: " + guitarra.tipoInstrumento());

        System.out.println("");

        piano.afinar();
        piano.tocar();
        System.out.println("Instrumento: " + piano.tipoInstrumento());

        System.out.println("");

        trompeta.afinar();
        trompeta.tocar();
        System.out.println("Instrumento: " + trompeta.tipoInstrumento());

    }

}
