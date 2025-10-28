package PRUEBAS02;

public class Main {

  public static void main(String[] args) {


    int [][] mediasAlumnos = {
        {4, 6, 7, 3, 9, 8},
        {7, 7, 7, 8, 9, 5},
        {8, 9, 9, 10, 5, 7},
        {3, 4, 5, 5, 6, 4},
        {9, 9, 9, 9, 9, 9},
        {5, 6, 8, 9, 7, 5},
        {1, 2, 4, 5, 6 ,7},
        {7, 8, 4, 5, 6, 8}
    };


    int [] notasMedsAsignaturas = calNotasMedsMaterias(mediasAlumnos);

    imprimirMatriz(mediasAlumnos);

    imprimirArray(notasMedsAsignaturas);

    //main
  }





  public static int[] calNotasMedsMaterias (int [][] matrizX) {

    int [] notasMedsMaterias = new int [matrizX[0].length];

      for (int j = 0; j < matrizX[0].length; j++) {
        int sumaColumna = 0;
        for (int i = 0; i < matrizX.length; i++) {
        sumaColumna += matrizX[i][j];

      }
        notasMedsMaterias[j] = sumaColumna / matrizX.length;
    }


    return notasMedsMaterias;

    //calNotasMedsMaterias
  }

  public static void imprimirArray (int []arrayX) {

    for (int i = 0; i < arrayX.length; i++) {
      System.out.printf("%2d\t", arrayX[i]);
    }
    System.out.println("\n");
  }

  public static void imprimirMatriz (int [][] matriX) {

    for (int i = 0; i < matriX.length; i++) {
      for(int j = 0; j < matriX[i].length; j++) {
        System.out.printf("%2d\t", matriX[i][j]);
      }
      System.out.println("");
    }
    System.out.println("\n");
  }





  //Main
}
