package ajces.matrices;
import san.PROGI02.EjerMatrices01.Utilidades;

import java.util.Scanner;
import java.util.Random;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main (String [] args) throws InterruptedException {

    Integer [][] matriz3x6 = new Integer[][]{
        {0, 30, 2, null, null, 5},
        {75, null, null, null, 0, null},
        {null, null, -2, 9, null, 11}
    };

    //Ejercicio01.imprimirMatriz(matriz3x6);

    //int[][] matrizRandomiana = Ejercicio05.rellArray6x10Random();

    int[][] matrizRandomianaSinRep = Ejercicio06.rellArray6x10RandomNR();

    //int[][] matrizRandomSinRepB = Ejercicio06.rellArray6x10RandomNRB();

    //Utilidades.imprimirMatriz(matrizRandomiana);

    //Ejercicio05.maxYminMatriz(matrizRandomiana);

    Utilidades.imprimirMatriz(matrizRandomianaSinRep);

    Ejercicio06.maxYminMatriz(matrizRandomianaSinRep);

    //Utilidades.imprimirMatriz(matrizRandomSinRepB);

    //Ejercicio06.maxYminMatriz(matrizRandomSinRepB);



  }








  //san.TESTSPI.Sensores.san.TESTSPI.Sensores.probando.Main
}


