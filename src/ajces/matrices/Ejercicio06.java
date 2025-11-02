package ajces.matrices;


import java.util.Random;

/*
  .................................................................................................
   MATRICES_EJERCICIO_06:
   Modifica el programa anterior de tal forma que no se repita ningún número en
    la matriz.
  .................................................................................................
    */
public class Ejercicio06 {

  //SOLUCIÓN A:

  public static int [][] rellArray6x10RandomNR() {

    int[][] matrizRandomNR = new int[6][10];

    Random generador = new Random();
    int nuevoNumAle = 0; //Número random
    int totalElementos = 6 * 10; //Total de elementos que caben en la matriz
    int[] arrayNumsRep = new int[totalElementos];
    int contadorUsados = 0;
    //Se va a recorrer la matriz almacenando los números random en un array y
    // comparando cada nuevo número generado con los ya almacenados.

    for (int i = 0; i < matrizRandomNR.length; i++) {
      for (int j = 0; j < matrizRandomNR[0].length; j++) {
        boolean repetido;

          //Se generan numeros random que se almacenan el el array,
          //Si el número ya está en el array se cierra el do-while
          //y entonces se almacenará en la matriz.
          do {
            repetido = false;
            nuevoNumAle = generador.nextInt(1000) + 1;
            // Se interrumpe el do-while cada vez que aparece un número repetido
            for (int w = 0; w < contadorUsados; w++) {
                if (arrayNumsRep[w] == nuevoNumAle) {
                  repetido = true;
                  break;
                }
              }
          } while (repetido); //Interrupción cada vez que aparece un número repetido
          //Aquí se va rellenando la matriz con números NO repetidos y el array con los SÍ repetidos.
        matrizRandomNR[i][j] = nuevoNumAle;
        arrayNumsRep[contadorUsados] = nuevoNumAle;
        contadorUsados++; //El contador de números va incrementado el array
      }
    }

    return matrizRandomNR;
  }

  //SOLUCIÓN B:

  public static void rellArray6x10RandomNRB () {

    int[][] num = new int[6][10];
    int fila;
    int columna;
    // Genera el contenido del array sin que se repita ningún valor
    boolean repetido;
    int i;
    int j;
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);
        // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    System.out.print("\n ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print(" " + columna + " ");
    }
    System.out.println();
    System.out.print("┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    for(fila = 0; fila < 6; fila++) {
      System.out.print(" " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", num[fila][columna]);

        // Calcula el mínimo y guarda sus coordenadas
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        // Calcula el máximo y guarda sus coordenadas
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("└");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ",columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
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










  //Ejercicio06
}
