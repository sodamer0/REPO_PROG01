package san.PROGI02.EjerMatrices01;

import java.util.Scanner;
import java.util.Random;

/*
........................................................................................................................
[Alumnos]
Tenemos un array bidimensional que representa un conjunto de alumnos. Cada fila del array representa a un alumno,
y cada columna de esa fila contiene las notas del alumno en diferentes asignaturas.
  1. Calcular la nota media de cada alumno:
    Escribe una función que reciba el array bidimensional de notas y devuelva un array de enteros que represente la nota
    media de cada alumno. mediaAlumnos(int[][] array): int[]
  2. Calcular la nota media de cada asignatura:
    Implementa una función que tome el array bidimensional de notas y retorne un array de enteros que represente la nota
    media de cada asignatura. mediasAsignaturas(int[][] array): int[]
  3. Calcular el porcentaje de alumnos aprobados en cada asignatura:
    Desarrolla una función que reciba el array bidimensional de notas y devuelva un array de enteros que represente el
    porcentaje de alumnos aprobados en cada asignatura.
    Para calcular el porcentaje de alumnos aprobados en una asignatura, considera que un alumno se considera aprobado si
    su nota es igual o mayor a 5. porcentajeAprobados(int[][] array): int[]
  4. Reordenar el array bidimensional según la media total de cada alumno: Crea una función que tome el array
    bidimensional de notas y lo reordene de menor a mayor según la nota media total de cada alumno. El resultado debe
    ser un nuevo array bidimensional donde los alumnos estén ordenados por su nota media total de menor a mayor.
    ordenSegunMedia(int[][] array): int[][]
  5. Identificar a los alumnos con mejor rendimiento en una asignatura específica. Retorna un array con los indices de
    cada alumno (opcional). mejoresAlumnosPorAsignatura(int[][]):int[][]
........................................................................................................................
*/

public class Main {

  public static void main(String[] args) {

    System.out.println("Creamos una matriz 8x6 de contenido aleatorio para el ejercicio ->");

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


    int [][] mediasAlumnos02 = Utilidades.crearMatrizRandom8x6();

    Utilidades.imprimirMatriz(mediasAlumnos02);


    //Apartado 1:
/*
    System.out.println("Calcular las notas medias por alumno (filas)");

    int [] notasMedias = MatrizAlumnos01.calNotasMedsAlumnos(mediasAlumnos02);

    int [] notasMediasRound = MatrizAlumnos01.calNotasMedsAlumnosRound(mediasAlumnos02);

    Utilidades.imprimirArray(notasMedias);

    Utilidades.imprimirArray(notasMediasRound);

    //Apartado 2:

    System.out.println("Calcular las notas medias por asignatura (columnas)");

    int [] notasMediasAsignaturas = MatrizAlumnos02.calNotasMedsMaterias(mediasAlumnos02);

    Utilidades.imprimirArray(notasMediasAsignaturas);

    //Apartado 3:

    System.out.println("Calcular el porcentaje de aprobados (>=5) por asignatura (columnas)");

    int [] porcentAprobAsignaturas = MatrizAlumnos03.calPorcentAprobMateria(mediasAlumnos02);

    Utilidades.imprimirArray(porcentAprobAsignaturas);
*/
    //Apartado 4:

    System.out.println("Obtener una nueva matriz de notas con los alumnos ordenados por sus medias totales de menor a mayor.");

    //int[] arrayNotasMediasAlumnos = MatrizAlumnos04.

    int [][] matrizNotasMedias = MatrizAlumnos04.ordSegunMedia(mediasAlumnos02);

    Utilidades.imprimirMatriz(matrizNotasMedias);

    //main
  }






  //Main
}
