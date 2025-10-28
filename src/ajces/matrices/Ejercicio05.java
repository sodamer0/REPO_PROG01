package ajces.matrices;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio05 {

  /*
   .................................................................................................
   MATRICES_EJERCICIO_05:
    Realiza un programa que rellene un array de 6 filas por 10 columnas con
    números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
    continuación, el programa deberá dar la posición tanto del máximo como del
    mínimo.
    ................................................................................................
  */

  public static int [][] rellArray6x10Random () {

    int[][] matrizRandom = new int[6][10];

    Random generador = new Random();

    for (int i = 0; i < matrizRandom.length; i++) {
      for (int j = 0; j < matrizRandom[0].length; j++) {
        matrizRandom[i][j] = generador.nextInt(1000) + 1;
      }
    }
    return matrizRandom;
  }




  public static void maxYminMatriz (int[][] matriz) {

    int max = matriz[0][0];
    int min = matriz[0][0];
    int[] posicionMax = new int[1];
    int[] posicionMin = new int[1];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        if (matriz[i][j] > max) {
          max = matriz[i][j];
          posicionMax = new int[]{i, j};
        }
        if (matriz[i][j] < min) {
          min = matriz[i][j];
          posicionMin = new int[]{i, j};
        }
      }
    }
    System.out.println("\nLa posición del máximo " + max + " es: (" + posicionMax[0] + ", " + posicionMax[1] + ")");
    System.out.println("La posición del mínimo " + min + " es: (" + posicionMin[0] + ", " + posicionMin[1] + ")");



    //maxYminMatriz
  }


















//Ejercicio05
}
