package san.PROGI02.EjerMatrices01;

/*
  3. Calcular el porcentaje de alumnos aprobados en cada asignatura:
    Desarrolla una función que reciba el array bidimensional de notas y devuelva un array de enteros que represente el
    porcentaje de alumnos aprobados en cada asignatura.
    Para calcular el porcentaje de alumnos aprobados en una asignatura, considera que un alumno se considera aprobado si
    su nota es igual o mayor a 5. porcentajeAprobados(int[][] array): int[]
*/


public class MatrizAlumnos03 {


  public static int [] calPorcentAprobMateria (int [][] matrizX) {

    int [] porcentAprobMateria = new int [matrizX[0].length];

    for (int j = 0; j < matrizX[0].length; j++) {
      int countAprob = 0;
      for (int i = 0; i < matrizX.length; i++) {
        if (matrizX[i][j] > 5) {
          countAprob++;
        }
      }
      porcentAprobMateria[j] = (int) ((double) countAprob / matrizX.length * 100);
    }
    return porcentAprobMateria;
  //calPorcentAprobMateria
  }












//MatrizAlumnos03
}
