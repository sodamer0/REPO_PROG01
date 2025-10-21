import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    //EJERCICIO_REPASO_04: Pedir solo un número. Determinar si es un número primo o no.

    /*
    System.out.println("Introduzca un número para comprobar si es primo->");
    int numero = teclado.nextInt();
    esPrimo(numero);
    */

    int [] arrayAdo = {3, 4, 5, 2, 1};

    imprimirArray(arrayAdo);
    imprimirArray(algoritmoBurbuja(arrayAdo));




  }//main

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



  /*public static void esPrimo(int num){

    int divisible = 0;

    for (int i=1; i<=num; i++){
      if(num % i == 0){
        divisible++;
      }
    }
    if (divisible > 2 || num ==1){
      System.out.println("El número " + num + " NO ES PRIMO.");
    }else{
      System.out.println("El número " + num + " ES PRIMO.");
    }

  }*/


  public static int [] algoritmoBurbuja(int [] array){

    //int [] arrayResultado = new int [array.length];

    for ( int i=0; i< array.length-1; i++ ) {
      for ( int j=0; j<array.length-i-1; j++){
        if ( array[j] > array[j+1] ){
          int maximo = array[j];
          array[j] = array[j+1];
          array[j+1] = maximo;
        }
      }

    }
    return array;


    //main
  }


//Main
}