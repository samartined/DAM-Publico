
/**
 *
 * Supongamos que tenemos un grafo ponderado no dirigido con 5 nodos (A, B, C, D y E). Cada arista entre los nodos tiene un peso que representa la distancia entre ellos. Debes crear una matriz de adyacencia que represente este grafo y calcular la distancia entre los nodos según la matriz.
 *
 * Define una matriz de adyacencia que tenga los siguientes valores de distancia entre los nodos:
 *
 * Distancia entre A y B: 2
 * Distancia entre A y C: 3
 * Distancia entre B y C: 1
 * Distancia entre B y D: 4
 * Distancia entre C y D: 2
 * Distancia entre C y E: 5
 * Distancia entre D y E: 1
 *
 * El programa debe mostrar algo similar a:
 *
 * Distancia entre A y B: 2
 * Distancia entre A y C: 3
 * Distancia entre A y D: 6
 * Distancia entre A y E: 7
 * Distancia entre B y C: 1
 * Distancia entre B y D: 4
 * Distancia entre B y E: 5
 * Distancia entre C y D: 2
 * Distancia entre C y E: 5
 * Distancia entre D y E: 1
 *
 * @author Edgar
 */
public class EjercicioEjemploMatrices2 {

    public static void main(String[] args) {

        int[][] matrizAdyacencia = {
            {0, 2, 3, 0, 0},
            {2, 0, 1, 4, 0},
            {3, 1, 0, 2, 5},
            {0, 4, 2, 0, 1},
            {0, 0, 5, 1, 0}
        };

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = i + 1; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] > 0) {
                    String nodoA = String.valueOf((char) ('A' + i));
                    String nodoB = String.valueOf((char) ('A' + j));
                    int distancia = matrizAdyacencia[i][j];
                    System.out.println("Distancia entre " + nodoA + " y " + nodoB + ": " + distancia);
                }
            }
        }
    }
}
