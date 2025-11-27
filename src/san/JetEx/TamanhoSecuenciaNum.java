package san.JetEx;


/*
Como entrada, el programa recibe una secuencia de números enteros no negativos; cada número entero se escribe en una
 línea aparte. La secuencia termina con un entero 0; cuando el programa lee 0, debe finalizar su trabajo y mostrar la
  longitud de la secuencia (sin contar el 0 final).

  No lea los números posteriores al 0.
 */

import java.util.Scanner;

public class TamanhoSecuenciaNum {

  private static Scanner teclado = new Scanner(System.in);


    public static void MostrarTamanhoSecuencia() {

      int contador = 0;
      while (true) {
        int number = teclado.nextInt();
        if (number == 0) {
          break;
        }
        contador++;
      }

      if (contador == 0) {
        System.out.println("El número cero finaliza el programa.");
      } else {
        System.out.println("La cantidad de números de la secuencia es: " + contador);
      }

    }


  /*
  Crea un programa que genere todas las "potencias de dos" menores que el número
   ingresado por el usuario.
   */

  public static void powersOfTwo() {

    long num = teclado.nextLong();
    long result = 1;

    while (result < num) {
      System.out.println(result);
      result *= 2;
    }
  }
    //Bucle que reescribe result con la potencia de 2 hasta que supera el valor de num


  public static void sumOfElements() {

    int num = 0;
    int sum = 0;
    while (true) {
      num = teclado.nextInt();
      if (num == 0) {
        break;
      }
      sum += num;
    }
    System.out.println(sum);
  }







}