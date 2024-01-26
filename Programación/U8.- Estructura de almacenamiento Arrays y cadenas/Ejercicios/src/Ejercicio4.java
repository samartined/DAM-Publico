
/**
 *
 * @author Edgar
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        int[][] conexiones = {{1, 2}, {2, 3}, {3, 1}, {4, 5}, {5, 1}};
        int numeroPuntos = 5;
        int[][] matriz = new int[numeroPuntos][numeroPuntos];

        for (int[] conexion : conexiones) {
            int i = conexion[0] - 1;
            int j = conexion[1] - 1;
            matriz[i][j] = 1;
            matriz[j][i] = 1;
        }
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
}
