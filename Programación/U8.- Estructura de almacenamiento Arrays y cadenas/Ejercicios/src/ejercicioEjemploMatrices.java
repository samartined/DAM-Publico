
/** Imagina un sistema de transporte público en una ciudad. Hay 5 paradas de autobús en la ciudad numeradas del 1 al 5. Los autobuses circulan entre estas paradas, y se registran las conexiones entre las paradas. Crea un programa que muestre una matriz que represente las conexiones entre las paradas de autobús.
 *
 *   1 2 3 4 5
 * 1 0 1 0 1 0
 * 2 1 0 1 1 0
 * 3 0 1 0 1 1
 * 4 1 1 1 0 0
 * 5 0 0 1 0 0
 *
 * Cada fila y columna de la matriz representa una parada de autobús. Si hay una conexión entre dos paradas, el valor en la matriz es 1; de lo contrario, es 0.
 */
/**
 *
 * @author Edgar
 */
public class ejercicioEjemploMatrices {

    public static void main(String[] args) {

        int[][] conexionesBus = {{1, 2}, {1, 4}, {2, 3}, {2, 4}, {3, 1}, {3, 4}, {3, 5}};
        int paradas = 5;
        int[][] matrizConexionesBus = new int[paradas][paradas];

        for (int[] conexion : conexionesBus) {
            int i = conexion[0] - 1;
            int j = conexion[1] - 1;
            matrizConexionesBus[i][j] = 1;
            matrizConexionesBus[j][i] = 1;
        }

        for (int[] matrizConexionesBu : matrizConexionesBus) {
            for (int j = 0; j < matrizConexionesBu.length; j++) {
                System.out.print(matrizConexionesBu[j] + " ");
            }
            System.out.println();
        }

    }

}
