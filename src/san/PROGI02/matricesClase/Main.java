package src.san.PROGI02.matricesClase;

public class Main {

  public static void main(String[] args) {
    int[][] matrizA = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 1, 16}
    };

    int[][] matrizB = {
        {16, 15, 14, 13},
        {12, 11, 10, 9},
        {8, 7, 6, 5},
        {4, 3, 2, 1}
    };

    int[][] matrizC = new int[matrizA.length][matrizB[0].length];


    matrizC = sumarDosMatrices(matrizA, matrizB);

    imprimirMatriz(matrizC);


    //main
  }



  public static int[][] sumarDosMatrices (int[][] matrix1, int[][] matrix2) {

    int [][] sumaMatrices = new int [matrix1.length][matrix2.length];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2[0].length; j++){
        sumaMatrices[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }

  return sumaMatrices;
  //sumarDosMatrices
  }


  public static void imprimirMatriz (int[][] matriz) {

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
        System.out.printf(" %2d\t", matriz[i][j]);
      }
      System.out.println();
    }
  }

  //san.TESTSPI.Sensores.san.TESTSPI.Sensores.probando.Main
}