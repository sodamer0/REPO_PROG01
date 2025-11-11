package san.PROGI01.Algoritmos;

  /*
   (1)Secuencia creciente: Pide al usuario que ingrese una serie de números hasta que ingrese un cero. Detecta y
    cuenta todas las subsecuencias de al menos 3 números consecutivos que estén en orden creciente.

   (2)Patrones de dígitos: Recibe un número entero de al menos 10 dígitos y determina la longitud de la
    mayor subsecuencia de dígitos consecutivos pares.

   (3)Temperaturas diarias: Recibe temperaturas diarias de un mes. Encuentra la racha más larga de días consecutivos
    con temperatura superior a 30°C.
   */

import java.util.Scanner;

public class EjercicioProfesor {

  private static Scanner teclado = new Scanner(System.in);



  public static void subSecNumCrec() {
    int num;
    int rachaCreciente = 0;
    int contadorSecuencias = 0;

    System.out.println("Introduzca un número entero cualquiera->");
    int anterior = teclado.nextInt();

    // Si el primer número es 0, termina inmediatamente
    if (anterior == 0) {
      System.out.println("Ha introducido " + contadorSecuencias + " secuencias de números en orden creciente.");
      return;
    }

    while (true) {
      System.out.println("Introduzca un número entero cualquiera->");
      num = teclado.nextInt();

      //Si es 0, termina SIN procesarlo
      if (num == 0) {
        break;
      }

      if (num > anterior) {
        rachaCreciente++;
      } else {
        if (rachaCreciente >= 2) {
          contadorSecuencias++;
        }
        rachaCreciente = 0;
      }

      anterior = num;
    }

    // Verificar si había una racha válida al final
    if (rachaCreciente >= 2) {
      contadorSecuencias++;
    }

    System.out.println("Ha introducido " + contadorSecuencias + " secuencias de números en orden creciente.");
  }


  public static void subSecNumConsecCrec () {
    int num;
    int rachaCreciente = 0;
    int contadorSecuencias = 0;

    System.out.println("Introduzca un número entero cualquiera->");
    int anterior = teclado.nextInt();

    // Si el primer número es 0, termina inmediatamente
    if (anterior == 0) {
      System.out.println("Ninguna secuencia de números consecutivos en orden creciente.");
      return;
    }

    while (true) {
      System.out.println("Introduzca un número entero cualquiera->");
      num = teclado.nextInt();
      //Si es 0, termina SIN procesarlo
      if (num == 0) {
        break;
      }
      if (num == anterior +1) {
        rachaCreciente++;
      } else {
        if (rachaCreciente >= 2) {
          contadorSecuencias++;
        }
        rachaCreciente = 0;
      }
      anterior = num;
    }
    // Verificar si había una racha válida al final
    if (rachaCreciente >= 2) {
      contadorSecuencias++;
    }
    System.out.println("Ha introducido " + contadorSecuencias + " secuencias de números consecutivos en orden creciente.");
  }

}
