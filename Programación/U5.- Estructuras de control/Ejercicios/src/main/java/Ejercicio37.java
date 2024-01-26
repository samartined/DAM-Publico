
import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class Ejercicio37 {

    enum Mes {
        ENERO(1, 31), FEBRERO(2, 28), MARZO(3, 31), ABRIL(4, 30), MAYO(5, 31), JUNIO(6, 30), JULIO(7, 31), AGOSTO(8, 31), SEPTIEMBRE(9, 30), OCTUBRE(10, 31), NOVIEMBRE(11, 30), DICIEMBRE(12, 31);

        public final int orden;
        public final int dias;

        Mes(int orden, int dias) {
            this.orden = orden;
            this.dias = dias;
        }

        public int getOrden() {
            return orden;
        }

        public int getDias() {
            return dias;
        }

        public String toString() {
            return this.name() + ": " + this.orden + " - " + this.dias + " dias";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mes[] meses = Mes.values();

        System.out.println("Introduce un número de días: ");
        int numDias = input.nextInt();

        for (Mes mes : meses) {
            if (mes.getDias() == numDias) {
                System.out.println(mes.toString());
            }
        }
        input.close();
    }
}
