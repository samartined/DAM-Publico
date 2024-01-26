package ejercicio1.gestorinventarioinformatico;

/**
 *
 * @author Edgar
 */
public class Ej1 {

    public static void main(String[] args) {

        Componente componente = new Componente(1, "Nvidia", "GE-Force-9032");

        DiscoDuro disco = new DiscoDuro(1, "Toshiba", "KingV7", 2);

        Microprocesador microprocesador = new Microprocesador(1, "AMD", "Rayzen", 26);

        System.out.println(componente + "\n" + disco + "\n" + microprocesador);
    }
}
