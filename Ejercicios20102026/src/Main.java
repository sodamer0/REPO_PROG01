import java.util.Scanner;
import java.util.Random;

public class Main {

  private static Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {

    /*
    1.	Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia
    la derecha: el primero pasa a ser el segundo, el segundo pasa a ser el tercero y así sucesivamente. El último
     pasa a ser el primero.
    */
    /*
    int [] arrayNumeros = new int[10];
    System.out.print("Introduce 10 números enteros en un array ->");
    for (int i=0; i<10; i++){
      arrayNumeros[i] = teclado.nextInt();
    }

    imprimirArray(arrayNumeros);

    int [] nuevoArray = desplazarArray(arrayNumeros);

    imprimirArray(nuevoArray);
    */

    Random rand = new Random();

    int [] arrayRandom = new int [20];

    for (int i=0; i<20; i++){
      arrayRandom[i] = rand.nextInt(20);
    }


    separarParImpar(arrayRandom);

    /*
    2. 	Crear 20 números random. Después contar de esos 20 números cuantos pares e impares hay.
    El programa creará 2 arrays, uno de pares y otro de impares con el tamaño correcto en base al número de pares
     e impares que haya en esos 20 números random.
    Por último, imprimir por pantalla estos 2 arrays.
    */



    //3.	Pide 5 números por pantalla y crea un algoritmo que ordene estos números de menor a mayor.

    /*
    4.	Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
    debe contener n+m. Después se debe mostrar su contenido.
    */






    //main
  }


  public static void imprimirArray(int [] array){
    System.out.print( "{ ");
    for (int i=0; i<array.length; i++) {
      System.out.print(array[i]);
      if (i < array.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println(" }\n");
    //imprimirArray
  }


  public static int [] desplazarArray(int [] array){

    int [] arrayResuelto = new int[10];


    for (int i=0; i<array.length; i++){
      if(i == 0){
        arrayResuelto[i] = array[array.length-1];
      }else{
        arrayResuelto[i] = array[i-1];
      }


    }

    return arrayResuelto;
    //desplazarArray
  }

  public static void separarParImpar( int [] array){

    int contadorPar = 0;
    int contadorImpar = 0;
    for (int i=0; i<array.length; i++){
          if (array[i] % 2 == 0) {
            contadorPar++;
          } else {
            contadorImpar++;
          }
    }
    int [] arrayPares = new int [contadorPar];
    int [] arrayImpares = new int [contadorImpar];

    int indexPar = 0;
    int indexImpar = 0;

    for(int i=0; i<array.length; i++){
      if (array[i] % 2 == 0) {
        arrayPares[indexPar] = array[i];
        indexPar++;
      }else {
        arrayImpares[indexImpar] = array[i];
        indexImpar++;
      }
    }

    imprimirArray(arrayPares);
    imprimirArray(arrayImpares);
    //separarParImpar
  }








  //Main
}
