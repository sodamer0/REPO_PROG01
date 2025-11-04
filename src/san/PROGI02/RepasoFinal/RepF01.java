package san.PROGI02.RepasoFinal;

/*
1. getMinColumNum(int[][] matrix) : return int[]

	Esta función recibe como argumento una matriz. Se debe devolver el número más pequeño de cada columna.

	Tiempo: 35 min
 */

public class RepF01 {

  public static int[] getMinColumNum (int[][] matrix) {

    int[] minColumn = new int[matrix.length];

    for (int j = 0; j < matrix[0].length; j++) {
      int minimo = matrix[0][j];
      for (int i = 0; i < matrix.length; i++) {
        if (matrix[i][j] < minimo) {
          minimo = matrix[i][j];
        }
      }
      minColumn[j] = minimo;
    }

    return minColumn;
  }

}
