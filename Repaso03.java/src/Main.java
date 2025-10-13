import java.util.Scanner;

public class   Main {
  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    /*
    EJERCICIO_01. Se pedirán 2 números por teclado. Se pedirá que se imprima por pantalla todos aquellos números que
     estén entre ambos. Esto se repetirá indefinidamente hasta que los 2 números sean iguales y
     que en ese caso el programa finalizará.
    */
    /*
    System.out.println("Introduzca un número ->");
    int numero1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número ->");
    int numero2 = teclado.nextInt();
    ejercicio01(numero1, numero2);
    */
    //EJERCICI0_02. Modifica el programa anterior para que solo se impriman por pantalla los números impares.

    /*
    System.out.println("Introduzca un número ->");
    int numero3 = teclado.nextInt();
    System.out.println("Introduzca un segundo número ->");
    int numero4 = teclado.nextInt();
    ejercicio02(numero3, numero4);
    */



    /*
    EJERCICIO_03. Modifica el programa anterior haciendo que al finalizar el programa imprima por pantalla la cantidad
    de números pares que se han impreso por pantalla durante el tiempo que duró el programa hasta que se hayan escrito
    2 números iguales.
    */





/*
  EJERCICIO_04. Crea una aplicación que dados 5 números por teclado los vaya sumando hasta que el valor sea mayor que
 3000. Cuando finalice se quiere saber cuántas iteraciones tuvo que hacer.
 */



  /*
  5. Una empresa necesita una aplicación para validar DNI. El programa deberá de pedir DNIs en la clase main hasta que
   escribamos un 0 para salir. Debemos hacer otra clase que se llame ValidadorDni que llamando a una función de su
  clase “validar()” nos devuelva un Boolean. Los DNI cumplan el patrón descrito por la administración:
    a. Longitud de 9 caracteres.
    b. Los caracteres de 1 al 8 deben de ser números, el noveno será letra.
    c. No son válidos los siguientes DNI: 00000000T, 00000001R, 99999999R.
    d. La letra se calcula dividiendo los 8 dígitos entre 23. El resultado del resto de esa división determina
     la letra según la siguiente tabla.
   */

    System.out.println("Introduzca el numero del DNI-> ");
    int numeroDni = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Introduzca la letra del DNI->");
    char letraDNI = teclado.nextLine().charAt(0);

    ValidadorDNI comprobacion = new ValidadorDNI();

    String respuesta = (comprobacion.validar(numeroDni,letraDNI))? "Dni válido":"Dni NO válido";
    System.out.println(respuesta);




  }

  public static void ejercicio01(int num1, int num2) {


    if (num1 == num2) {
      System.out.println(num1 + ", " + num2);
      return;
    }

    if (num1 < num2) {
      for (int i = num1; i <= num2; i++) {
        if (i == num2) {
          System.out.print(i + ".");
        } else
          System.out.print(i + ", ");
      }
    } else { //num1>num2
      for (int i = num1; i <= num2; i--) {
        if (i == num2) {
          System.out.print(i + ".");
        } else
          System.out.print(i + ", ");
      }
    }
  }



  public static void ejercicio02(int num1, int num2) {
    // Determinar inicio y fin del rango sin usar Math
    int inicio, fin;
    if (num1 <= num2) {
      inicio = num1;
      fin = num2;
    } else {
      inicio = num2;
      fin = num1;
    }

    boolean hayImpar = false;

    // Recorrer el rango e imprimir solo impares
    for (int i = inicio; i <= fin; i++) {
      if (i % 2 != 0) {
        if (hayImpar) {
          System.out.print(", ");
        }
        System.out.print(i);
        hayImpar = true;
      }
    }

    // Imprimir el punto final solo si se imprimió al menos un número impar
    if (hayImpar) {
      System.out.println(".");
    } else {
      System.out.println(); // o solo System.out.println(); si se permite línea vacía
    }
  }

  public static void ejercicio03(int num1, int num2) {

    do{
      System.out.println("Introduce el primer número->");
      num1=teclado.nextInt();
      System.out.println("Introduce el segundo número->");
      num2=teclado.nextInt();
      int contador=1;
      int inicio, fin;
      if (num1 <= num2) {
        inicio = num1;
        fin = num2;
      } else {
        inicio = num2;
        fin = num1;
      }
      boolean hayImpar = false;
      for (int i = inicio; i <= fin; i++) {
        if (i % 2 != 0) {
          if (hayImpar) {
            System.out.print(", ");
          }
          System.out.print(i);
          contador++;
          hayImpar = true;
        }
      }
      if (hayImpar) {
        System.out.println(".");
      } else {
        System.out.println(); // o solo System.out.println(); si se permite línea vacía
      }

      System.out.println("Se han imprimido " + contador + " números.");

    }while(num1!=num2);



  }











}