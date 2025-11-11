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


  public static void subSecDigNum (){

    long numero = 0;

    System.out.println("Escriba un número entero de, al menos, 10 cifras ->");

    numero = teclado.nextLong();

    String numeroString = String.valueOf(numero);
    // Si es negativo, quitamos el signo para contar solo dígitos
    String digitos = numeroString.startsWith("-") ? numeroString.substring(1) : numeroString;
    //Si la cadena empieza con '-', toma la subcadena desde el carácter 1 en adelante (es decir, sin el signo).
    //Si no, usa la cadena completa.

    if (digitos.length() < 10) {
      System.out.println("El número debe tener al menos 10 dígitos.");
      return;
    }

    int rachaPares = 0;

    int maxRacha = 0;

    for (int i = 0; i < numeroString.length(); i++) {

      if (numeroString.charAt(i) == '0' || numeroString.charAt(i) == '2' || numeroString.charAt(i) == '4'
          || numeroString.charAt(i) == '6' || numeroString.charAt(i) == '8') {
        rachaPares++;

      } else {
        rachaPares = 0;

      }

      if (rachaPares > maxRacha ) {
        maxRacha = rachaPares;
      }
    }

    System.out.println("Longitud de la mayor subsecuencia de números pares consecutivos: " + maxRacha);


  }


  public static void rachaMaxTemp30 () {

    int temperatura = 0;

    System.out.println("Escriba las temperaturas diarias durante el mes pasado ->");

    int racha30 = 0;

    int maxRacha30 = 0;

    for (int i=0; i < 31; i++) {
      temperatura = teclado.nextInt();
      if (temperatura > 30) {
        racha30++;
      } else {
        racha30 = 0;
      }
      if (maxRacha30 > racha30 ) {
        maxRacha30 = racha30;
      }

    }

    System.out.println("Máxima serie de días con tempertura media mayor a 30 grados " +maxRacha30);

    teclado.close();

  }



  //EjercicioProfesor
}
