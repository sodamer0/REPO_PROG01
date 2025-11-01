package san.PROGI02.EjerMatrices01;

import java.util.Random;

public class Utilidades {

  public static int[][] crearMatrizRandom8x6 () {

    Random generador = new Random();
    int [][] matrizRandom = new int [8][6];
    for (int i = 0; i < matrizRandom.length; i++) {
      for(int j = 0; j < matrizRandom[0].length; j++) {
        matrizRandom[i][j] = generador.nextInt(10) + 1;
      }
      ;    }
    return matrizRandom;
  }

  public static void imprimirMatriz (int [][] matriX) {

    for (int i = 0; i < matriX.length; i++) {
      for(int j = 0; j < matriX[0].length; j++) {
        System.out.printf("%2d\t", matriX[i][j]);
      }
      System.out.println("");
    }
    System.out.println("\n");
  }
  public static void imprimirArray (int []arrayX) {

    for (int i = 0; i < arrayX.length; i++) {
      System.out.printf("%2d\t", arrayX[i]);
    }
    System.out.println("\n");
  }




}
