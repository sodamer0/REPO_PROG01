package san.PROGI02.RepasoFinal;

public class Main {

  public static void main(String[] args) {

    int[][] matrix = {
        {12, 7, 23, 4, 19},
        {8, 15, 3, 21, 6},
        {14, 2, 18, 11, 25},
        {9, 20, 5, 16, 13},
        {17, 10, 12, 1, 8}
    };

    int[] minColumnas = RepF01.getMinColumNum(matrix);

    imprimirArray(minColumnas);

    int[] mayoresDiez = RepF02.getMaxNums(matrix);

    imprimirArray(mayoresDiez);

    int maximus = RepF03.getMax(mayoresDiez);

    System.out.println(maximus);

  }

  public static void imprimirArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%4d", array[i]);
    }
    System.out.println();
  }








}
