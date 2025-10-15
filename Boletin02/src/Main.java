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

  //printAsteriscos02();


  /*
  BOLETÍN02_06: Realiza un programa que imprima las tablas de multiplicar del 1 al 10 con el formato dado:
  */

  //tablasMultiplicar();

    /*
    BOLETÍN02_12: Realiza un programa que muestre por pantalla los números del 1 al 100 sin mostrar aquellos
     números que sean múltiplos de 5.
    */


  //sinMultiplosDel5();


  /*
  BOLETÍN02_05: Se desea conocer el 'lucky number' de cualquier persona. Este número se consigue reduciendo la fecha
   de nacimiento a un número de un solo dígito. Por ejemplo: 16-08-1973 -> 16+8+1973 = 1997 -> 1+9+9+7 = 26 -> 2+6 = 8.
    El número de la suerte sería el 8.*/


    System.out.println("Introduzca su fecha de nacimiento sin espacios para calcular su Número de la Suerte ->");
    int cumpleanhos = teclado.nextInt();

    numeroSuerte(cumpleanhos);

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


    for (int i=0; i<4; i++){
      for (int j=0; j<3-i; j++){
        System.out.print("_");
      }//Bucle para los espacios
      for ( int j=0; j<2*i+1;j++){
        System.out.print("*");
      }//Bucle para los asteriscos
      System.out.println();
    }//Bucle para los saltos de línea de la parte superior de la figura.

    //for()




  }//printAsteriscos02




  public static void tablasMultiplicar(){

    for (int i=1; i<=10; i++){

      System.out.println();
      System.out.println("Tabla de multiplicar del " + i);
      System.out.println();

      for (int j=1; j<=10; j++){

        System.out.println(i + " x " + j + " = " + j*i);
      }//Bucle para imprimir las operaciones en cada tabla
    }//Bucle para imprimir cada tabla y su título.


  }//tablasMultiplicar


  public static void sinMultiplosDel5(){

    System.out.print("{ ");
    for (int i=1; i<=100; i++){
      if (i % 5 != 0){
        if(i == 99){
          System.out.print(i + ".");
        }else
          System.out.print(i + ", ");
      }
    }
    System.out.print(" }");


  }


  public static void numeroSuerte(int fecha){

    String strFecha = String.valueOf(fecha); //Convierto el número en String

    int [] arrayFecha = new int [strFecha.length()]; //Creo un array del tamaño del número.



    int numeroSuerte = 0;

    for (int i=0; i<strFecha.length(); i++){ //Bucle para rellenar un array con los caracteres del String.
      //Se rellena cada elemento del array con el char correspondiente del String ya convertido en int.
      arrayFecha[i] = Integer.parseInt(String.valueOf(strFecha.charAt(i)));

    }

    int suma = 0;

    for (int i=0; i<arrayFecha.length; i++){
      suma += arrayFecha[i];
    }

    String strSuma = String.valueOf(suma);

    int [] arraySuma = new int [strSuma.length()];

    int suma2 = 0;

    for (int i=0; i<arraySuma.length; i++){
      arraySuma[i] = Integer.parseInt(String.valueOf(strSuma.charAt(i)));
      suma2 += arraySuma[i];
    }

    numeroSuerte = suma2;

    System.out.println("Su número de la Suerte es el " + numeroSuerte);
  }




}//Main
