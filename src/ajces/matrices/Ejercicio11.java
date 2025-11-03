package ajces.matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

  private static Scanner teclado = new Scanner(System.in);
  /*
  .................................................................................................
   MATRICES_EJERCICIO_11:
    Realiza un programa que muestre por pantalla un array de 10 filas por 10
    columnas relleno con números aleatorios entre 200 y 300. A continuación, el
    programa debe mostrar los números de la diagonal que va desde la esquina
    superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
    y la media de los números que hay en esa diagonal.
  .................................................................................................
 */


  public static int[][] crearMatrizRandom() {

    System.out.println("Filas de la matriz: ");
    int filas = teclado.nextInt();
    System.out.println("Columnas de la matriz: ");
    int columnas = teclado.nextInt();

    int[][] matrizX = new int[filas][columnas];

    Random generador = new Random();

    for (int i = 0; i < matrizX.length; i++) {
      for (int j = 0; j < matrizX[0].length; j++) {
        matrizX[i][j] = generador.nextInt(200, 300);
      }
    }

    return matrizX;
  }




  public static int[] diagonalMatriz (int[][] matriz) {

    int[] arrayDiagonal = new int[matriz.length];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if ( i == j) {
          arrayDiagonal[i] = matriz[i][j];
        }
      }
    }

    System.out.println("Diagonal principal:");
    for (int i = 0; i < arrayDiagonal.length; i++) {
      System.out.print(arrayDiagonal[i] + " ");
    }
    System.out.println("\n");

    int maximo = arrayDiagonal[0];

    int minimo = arrayDiagonal[0];

    int sumaArray = 0;

    double mediaArray = 0.0;

    for (int i = 0; i < arrayDiagonal.length; i++) {
      if (arrayDiagonal[i] < minimo) {
        minimo = arrayDiagonal[i];
      }
      if (arrayDiagonal[i] > maximo) {
        maximo = arrayDiagonal[i];
      }
      sumaArray += arrayDiagonal[i];
    }
    mediaArray = (double) sumaArray / arrayDiagonal.length;

    System.out.println("Máximo de la diagonal de la matriz: " + maximo);
    System.out.println("Mínimo de la diagonal de la matriz: " + minimo);
    System.out.printf("\nMedia de la diagonal de la matriz: %.2f", mediaArray);

    return arrayDiagonal;
  }






}
