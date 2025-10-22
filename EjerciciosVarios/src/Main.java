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

    int [] numero = inicializarArray();

    imprimirArrayColumna(numero);

    int [] cuadrado = cuadradoArray(numero);

    imprimirArrayColumna(cuadrado);

    int [] cubo = cuboArray(numero);

    imprimirArrayColumna(cubo);



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



  //Main
}