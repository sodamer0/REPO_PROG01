import java.util.Scanner;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    /*
    Ejercicio 1
    Define un array de 12 números enteros con nombre num y asigna los valores
    según la tabla que se muestra a continuación. Muestra el contenido de todos
    los elementos del array. ¿Qué sucede con los valores de los elementos que no
    han sido inicializados?
      array12 = {39, -2, , ,0 , , 14, , 5, 120, , }
    */

    //declaraArray();

    /*
    Ejercicio 3
    Escribe un programa que lea 10 números por teclado y que luego los muestre
    en orden inverso, es decir, el primero que se introduce es el último en mostrarse
    y viceversa.
    */

    /*
    System.out.println("Dar 10 números enteros:");
    int [] miArray = inicializarArray();
    imprimirArray(miArray);

    imprArrayIvert(miArray);
    */

    /*
     Ejercicio 4
    Define tres arrays de 20 números enteros cada uno, con nombres numero, cuadrado
    y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
    cuadrado se deben almacenar los cuadrados de los valores que hay en el array
    numero. En el array cubo se deben almacenar los cubos de los valores que hay en
    numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
    columnas.
     */
    /*
    int [] numero = inicializarArray();

    imprimirArrayColumna(numero);

    int [] cuadrado = cuadradoArray(numero);

    imprimirArrayColumna(cuadrado);

    int [] cubo = cuboArray(numero);

    imprimirArrayColumna(cubo);
    */


    /*
    Ejercicio 5
    Escribe un programa que pida 10 números por teclado y que luego muestre los
    números introducidos junto con las palabras “máximo” y “mínimo” al lado del
    máximo y del mínimo respectivamente.
    */


    //int [] arrayNumeros = inicializarArray();

    //encontrarMaxMin(arrayNumeros);

    /*
    Ejercicio 6
    Escribe un programa que lea 15 números por teclado y que los almacene en un
    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
    del array.
    */

    /*
    Halla el número de calificaciones D, C, B y A del último examen de informática,
    donde n estudiantes de una clase aprobaron el examen.
    El programa obtiene el número n como primera línea de entrada.
    Esto significa que habrá n calificaciones. Luego, el programa obtiene las calificaciones,
    cada una en una línea diferente.
    Crea un programa para contar la ocurrencia de cada calificación y genera cuatro números en
    una sola línea: el número de calificaciones D, C, B y A (en ese orden), separados por espacios en blanco.
     */


    //clasificarNotas();


    /*
    La clase LandOfNumbers contiene el metodo "summitSpecialNumbers" que calcula la suma de los primeros
    n números impares positivos. Dada una entrada n, el metodo genera la secuencia de números impares comenzando
    desde 1 (es decir, 1, 3, 5, ..., hasta el n-ésimo número impar) y devuelve su suma total. Esto se logra iterando
    n veces, recorriendo números impares consecutivos comenzando en 1 e incrementando en 2 en cada iteración,
    y luego acumulando sus valores.
    Esta implementación aprovecha eficazmente el patrón matemático de que la suma de los primeros n números impares
    siempre es igual a n², aunque calcula el resultado iterativamente en lugar de usar la fórmula directa.
    El propósito del metodo es generar esta suma de forma fiable para cualquier entero no negativo n.
     */

    int num = teclado.nextInt();
    System.out.println(summonSpecialNumbers(num));
    //main
  }


  public static int[] inicializarArray(){

    System.out.println("Tamaño del array? ->");

    int tamanho = teclado.nextInt();

    int [] array = new int[tamanho];

    for (int i=0; i<tamanho; i++){
      System.out.println("Índice " + i + "->");
      array[i] = teclado.nextInt();
    }
    return array;
  }

  public static void imprimirArray(int [] array){

    System.out.print("\n{ ");
    for (int i = 0; i< array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" }");
  }

  public static void imprArrayIvert(int [] array){

    System.out.print("\n{ ");
    for (int i = array.length-1; i >= 0; i--) {
      System.out.print(array[i]);
      if (i > 0) {
        System.out.print(", ");
      }
    }
    System.out.println(" }");
  }


  public static void declaraArray(){

    int [] num = new int[12];

    for ( int i=0; i<12; i++ ){
      num[0] = 39;
      num[1] = -2;
      num[4] = 0;
      num[6] = 14;
      num[8] = 5;
      num[9] = 120;
    }

    System.out.print("\n{ ");
    for (int i=0; i<num.length; i++) {
      System.out.print(num[i]);
      if (i < num.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" }");

    //declaraArray
  }

  public static int[] cuadradoArray(int [] array){

    int [] cuboArray = new int [array.length];

    for (int i=0; i<array.length; i++){
      cuboArray[i] = (int) Math.pow(array[i], 2);
    }

    return cuboArray;
  }


  public static int[] cuboArray(int [] array){

    int [] cuboArray = new int [array.length];

    for (int i=0; i<array.length; i++){
      cuboArray[i] = (int) Math.pow(array[i], 3);
    }

    return cuboArray;
  }

  public static void imprimirArrayColumna(int [] array){

    for (int i=0; i< array.length; i++) {
      System.out.printf("Posición [%2d] = [%3d] \n", i, array[i]);
    }
    System.out.println();
  }


  public static void encontrarMaxMin(int [] array) {

    int min = array[0];
    int max = array[array.length-1];

    for ( int i=0; i<array.length; i++ ) {
      if ( array[i] > max ) {
        max = array[i];
      }else if ( array[i] < min ) {
        min = array[i];
      }
    }

    for ( int i=0; i<array.length; i++ ) {

      if ( array[i] == max ) {
        System.out.print(array[i] + "->MÁX ");
      } else if ( array[i] == min ) {
        System.out.print(array[i] + "->MÍN ");
      } else {
        System.out.print(array[i] + "  ");
      }
    }




    //encontrarMaxMin
  }

  public static void clasificarNotas(){

    int numDeNotas = teclado.nextInt();
    char calificacion;
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;


    for ( int i = 0; i<numDeNotas; i++ ) {
      calificacion = teclado.next().charAt(0);
      if ( calificacion == 'A' )  {
        countA++;
      } else if ( calificacion == 'B' ){
        countB++;
      } else if ( calificacion == 'C' ) {
        countC++;
      } else if ( calificacion == 'D' ) {
        countD++;
      }
    }
    System.out.println(countD + " " + countC + " " +  countB + " " + countA);

  }


    public static int summonSpecialNumbers(int n) {
      int suma = 0;
      for (int i = 0; i < n; i++) {
        suma += 1 + 2 * i;
      }
      return suma;
    }



  //Main
}