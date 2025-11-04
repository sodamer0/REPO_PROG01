package san.PROGI02.RepasoFinal;

/*
2. getMaxNums(int[][] matrix) : return int[]
	 Esta función recibe como parámetro una matriz. Debe devolver todos los números mayores de 10 que contenta la matriz.
	 Recuerda que primero debes saber cuantos elementos debes devolver para crear el array que debes devolver con
	 la longitud correcta.
 */

public class RepF02 {




  public static int[] getMaxNums(int[][] matrix) {

    int contador = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] > 10) {
          contador++;
        }
      }
    }

    int [] arrayMayoresDiez = new int[contador];

    int encontrado = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] > 10) {
          arrayMayoresDiez[encontrado] = matrix[i][j];
          encontrado++;
        }
      }
    }

    return arrayMayoresDiez;
  }



}


