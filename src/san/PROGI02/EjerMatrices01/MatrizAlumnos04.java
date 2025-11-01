package san.PROGI02.EjerMatrices01;

  /*
 ........................................................................................................................
  4. Reordenar el array bidimensional según la media total de cada alumno:
    Crea una función que tome el array bidimensional de notas y lo reordene de menor a mayor según la nota media total
    de cada alumno. El resultado debe ser un nuevo array bidimensional donde los alumnos estén ordenados por su nota
    media total de menor a mayor.
    ordenSegunMedia(int[][] array): int[][]
 ......................................................................................................................
  */



public class MatrizAlumnos04 {


  public static int[][] ordSegunMedia (int[][] matrizX) {

    //Matriz una vez ordenada
    int[][] matrizOrdenada = new int[matrizX.length][matrizX[0].length];
    //Array de notas medias de los alumnos
    int[] mediaNotasAlum = new int [matrizX.length];

    //Obtener las medias de cada fila de la matriz inicial
    for (int i = 0; i < matrizX.length; i++) {
      int sumaNotas = 0;
      for (int j = 0; j < matrizX[0].length; j++) {
        sumaNotas += matrizX[i][j];
      }
      mediaNotasAlum[i] = sumaNotas / matrizX[0].length;
    }

    //Crear copia de la matriz inicial
    for (int i = 0; i < matrizX.length; i++) {
      for (int j = 0; j< matrizX[0].length; j++) {
        matrizOrdenada[i][j] = matrizX[i][j];
      }
    }
  /*
    //Ordenar las filas de la matriz inicial comparando las filas con las medias del array.

    for (int i = 0; i < matrizX.length - 1; i++) {
      for (int j = 0; j < matrizX.length - i - 1; j++) {
        //Si la media del almuno j es MAYOR que la del j+1 no están ordenados
        if (mediaNotasAlum[j] > mediaNotasAlum[j + 1]) {
          //aux variable temporal para guardar la media mayor
          int aux = mediaNotasAlum[j];
          //La media inferior se guarda en la posición anterior a la media mayor
          mediaNotasAlum[j] = mediaNotasAlum[j + 1];
          mediaNotasAlum[j + 1] = aux;

          //Se intercambian las filas en la matrizOrdenada
          int[] auxFilas = matrizOrdenada[j];
          matrizOrdenada[j] = matrizOrdenada[j + 1];
          matrizOrdenada[j + 1] = auxFilas;
        }
      }
    }
  */











    return matrizOrdenada;
    //ordAlumsxNotMedTot
  }





}
