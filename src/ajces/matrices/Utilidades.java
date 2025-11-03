package ajces.matrices;

public class Utilidades {



  public static void imprimirMatriz (int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          System.out.printf("%5d", matrix[i][j]);
        }
      System.out.println();
    }
  }

  public static void imprimirArray (int[] arrayX) {

    for (int i = 0; i < arrayX.length; i++) {
      System.out.printf("%5d", arrayX[i]);
    }
      System.out.println();

  }
}
