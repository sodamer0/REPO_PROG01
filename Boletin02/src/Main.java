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

    /*
    System.out.println("Introduzca su fecha de nacimiento, sin espacios, para calcular su Número de la Suerte ->");
    String cumpleanhos = teclado.nextLine();

    numeroSuerte(cumpleanhos);
    */

    System.out.println("Introduzca su fecha de nacimiento, sin espacios, para calcular su Número de la Suerte ->");
    int cumpleanhos = teclado.nextInt();
    teclado.nextLine();

    System.out.println("Para la fecha introducida el Número de la Suerte es el: [" + numeroSuerte02(cumpleanhos) + "]");

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


  }//sinMultiplosDel5


  public static void numeroSuerte01(String fecha) {

    char[] arrayComparar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    while (fecha.length() > 1){

      int sumaDigitos = 0;

      for (int i=0; i<fecha.length(); i++) {
        char digito = fecha.charAt(i);

        for (int j = 0; j < arrayComparar.length; j++) {
          if (digito == arrayComparar[j]) {
            sumaDigitos += j;
          }
        }//for1
      }//for1
      fecha = String.valueOf(sumaDigitos);
    }//while

    System.out.println("El Número de la Suerte para la fecha dada es " + fecha);

  }//numeroSuerte



  public static int numeroSuerte02(int fecha){

    int numFecha = fecha;

    while (numFecha >= 10) { //Condición: mientras la cifra de la fecha tenga dos dígitos.
      int sumaCifras = 0; //
        while (numFecha != 0) { //Condición: mientras la cifra sea distinta de cero.
          sumaCifras += numFecha % 10;//*Con cada iteración se suma el resto para /10, que es el
                                    // último dígito del número
          numFecha /= 10; //La fecha se va reduciendo a razón de una división entera (/ 10) por bucle,
                        // que da el número sin su último dígito.
        }
        numFecha = sumaCifras; //Para evaluar el while 1 se iguala numFecha con el valor
                              // de la suma de los dígitos hasta que sea menor que 10.
    }

    return numFecha;

  }//numeroSuerte02






}//Main
