package ajces.matrices;

public class Utilidades {



  public static void imprimirMatriz (int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
          System.out.printf("%2d\t", matrix[i][j]);
        }
      System.out.println();
    }
  }









}
