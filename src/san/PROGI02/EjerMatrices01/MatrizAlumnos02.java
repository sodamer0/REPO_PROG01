package san.PROGI02.EjerMatrices01;

  /*
 ........................................................................................................................
  2. Calcular la nota media de cada asignatura:
    Implementa una función que tome el array bidimensional de notas y retorne un array de enteros que represente la nota
    media de cada asignatura. mediasAsignaturas(int[][] array): int[]
 ......................................................................................................................
  */


public class MatrizAlumnos02 {


  public static int[] calNotasMedsMaterias (int [][] matrizX) {

    int[] notasMedsMaterias = new int[matrizX[0].length];

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





  //MatrizAlumnos02
}
