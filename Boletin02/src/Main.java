import java.util.Scanner;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    /*
    BOLETÍN02_01: Realiza un programa que reciba 5 variables de tipo entero. Se deberá mostrar por pantalla el valor
     menor y el mayor.
     */
    /*
    System.out.println("Introduzca 5 números enteros cualesquiera ->");
      int [] array = new int[5];
      for (int i=0; i<array.length; i++){
        System.out.println("Número: ");
        array[i]=teclado.nextInt();
        teclado.nextLine();
      }
    enteroMenorMayor(array);
    */


    /*
    BOLETÍN02_02: Realiza un programa utilizando bucles que dibuje la siguiente figura:
    *

    **

    ***

    ****

    *****

     */

    // printAsteriscos01();

    /*
    BOLETÍN02_03: Realiza un programa utilizando bucles que dibuje la siguiente figura:
      *

     ***

    *****

   *******

    *****

     ***

      *

     */

  printAsteriscos02();






  }//main



  public static void enteroMenorMayor(int [] arrayEnteros){

      int maximo = arrayEnteros[0];
      int minimo = arrayEnteros[0];
      for ( int i=0; i<arrayEnteros.length; i++){
        if (arrayEnteros[i] > maximo ){
            maximo = arrayEnteros[i];
        }
      }
      System.out.println("El mayor entero de la secuencia de números es " + maximo);

      for ( int i=0; i<arrayEnteros.length; i++){
        if (arrayEnteros[i] < minimo ){
           minimo = arrayEnteros[i] ;
        }
      }
      System.out.println("El mayor entero de la secuencia de números es " + minimo);

    }//enteroMayorMenor



  public static void printAsteriscos01(){
    int n=1;
    for (int i=0; i<5; i++){
      for ( int j=0; j<n; j++){
        System.out.print("*");
      }
      System.out.println("\n");
      n++;
    }

  }//printAsteriscos


  public static void printAsteriscos02(){
    int n=1;
    int m=7;

    for( int i=0; i<n; i++){
      for( int j=0; j<m; j++){
        System.out.print("");
        System.out.print("*");
      }

    }
    System.out.println("\n");
    n++;
    m--;
  }




}//Main
