package san.PROGI02.EjerMatrices01;


  /*
 ........................................................................................................................
    1. Calcular la nota media de cada alumno:
  Escribe una función que reciba el array bidimensional (matriz 2x2) de notas y devuelva un array de enteros que
  represente la nota media de cada alumno. mediaAlumnos(int[][] matriz): int[]
 ......................................................................................................................
  */

public class MatrizAlumnos01 {


  public static int[]  calNotasMedsAlumnos (int[][] matriz) {

    int[] notasMedsAlumnos = new int[matriz.length];

    //Debemos recorrer la matriz obteniendo la media de las notas, que es la media de CADA FILA.

    for (int i = 0; i < matriz.length; i++) { //bucle que recorre la matriz por filas
      int sumaFila = 0; // Se reinicia para cada fila de la matriz

      for (int j = 0; j < matriz[i].length; j++) { //bucle que recorre la matriz por columnas
        sumaFila += matriz[i][j]; //Sumamos los elementos de cada fila
      }
      notasMedsAlumnos[i] = sumaFila / matriz[i].length; //Hallamos la media por fila y se rellena el array
    }
    return notasMedsAlumnos;
  }

  public static int[]  calNotasMedsAlumnosRound (int[][] matriz) {

    int[] notasMedsAlumnosRound = new int[matriz.length];


    //Debemos recorrer la matriz obteniendo la media de las notas, que es la media de CADA FILA.

    for (int i = 0; i < matriz.length; i++) { //bucle que recorre la matriz por filas
      int sumaFila = 0; // Se reinicia para cada fila de la matriz

      for (int j = 0; j < matriz[i].length; j++) { //bucle que recorre la matriz por columnas
        sumaFila += matriz[i][j];
      }
      double mediaFila = (double) sumaFila / matriz[i].length;
      notasMedsAlumnosRound[i] = (int) Math.round(mediaFila);
    }
    return notasMedsAlumnosRound;
  }





  //MatrizAlumnos01
}
