package ajces.matrices;

import java.util.Random;

public class Ejercicio07 {

      /*
    .................................................................................................
    MATRICES_EJERCICIO_01:
      Define un array de números enteros de 3 filas por 6 columnas con nombre num
      y asigna los valores según la siguiente tabla. Muestra el contenido de todos
      los elementos del array dispuestos en forma de tabla como se muestra en la
      figura.
    .................................................................................................
    */

  public static int[][] crearMatriz3x6 () {

    Random generador = new Random();

    int[][] matriz3x6 = new int[3][6];

    matriz3x6 = new int[][]{
        {0, 30, 2,' ',' ', 5},
        {75, ' ', ' ', ' ', 0, ' '},
        {' ', ' ', -2, 9, ' ', 11}
    };
    return  matriz3x6;
  }

    public static void imprimirMatriz (Integer[][] matrix) {

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          if (matrix[i][j] == null) {
            System.out.print("   \t");
          } else {
            System.out.printf("%2d\t", matrix[i][j]);
          }
        }
        System.out.println();
      }
    }








//Ejercicio07
}
