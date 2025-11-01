package ajces.matrices;
import java.util.Scanner;
import java.util.Random;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main (String [] args) {

    Integer [][] matriz3x6 = new Integer[][]{
        {0, 30, 2, null, null, 5},
        {75, null, null, null, 0, null},
        {null, null, -2, 9, null, 11}
    };

    //Ejercicio07.imprimirMatriz(matriz3x6);

    int[][] matrizRandomiana = Ejercicio05.rellArray6x10Random();

    Utilidades.imprimirMatriz(matrizRandomiana);

    Ejercicio05.maxYminMatriz(matrizRandomiana);

  }








  //san.TESTSPI.Sensores.san.TESTSPI.Sensores.probando.Main
}


