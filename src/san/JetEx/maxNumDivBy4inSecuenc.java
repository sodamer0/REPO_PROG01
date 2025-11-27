package san.JetEx;

import java.util.Scanner;

/*
Te dan una secuencia de números naturales. Encuentre el elemento máximo divisible por 4. La entrada se pasa al programa
de la siguiente manera:
El primer número es el número total de elementos de la secuencia.
Utilice este número como condición para su bucle.

Los próximos números son parte de la secuencia que es necesario evaluar.

Los números en la secuencia pueden o no ser divisibles por 4. El programa debe imprimir un solo número: el elemento
máximo de la secuencia que es divisible por 4.

Intente resolver este problema utilizando un bucle while.

Nota: El primer número pasado al programa (número de elementos en la secuencia) no forma parte de la secuencia.
 */



public class maxNumDivBy4inSecuenc {

  public static final Scanner teclado = new Scanner(System.in);

  static void maxDiv4 () {

    int tamanho = teclado.nextInt();
    int contador = 0;
    int maximo = 0;

    while (contador != tamanho) {
      int numero = teclado.nextInt();
      if (numero % 4 == 0) {
        if (numero > maximo) {
          maximo = numero;
        }
      }
      contador++;
    }
    System.out.println(maximo);
  }

  /*  OPCIÓN MÁS COMPLETA ->
          int tamanho = teclado.nextInt();
        int contador = 0;
        int maximo = 0;
        boolean encontrado = false; // 👈 bandera
        while (contador < tamanho) { // mejor usar '<' que '!=' por seguridad
            int numero = teclado.nextInt();
            if (numero % 4 == 0) {
                if (!encontrado || numero > maximo) {
                    maximo = numero;
                    encontrado = true;
                }
            }
            contador++;
        }
        if (encontrado) {
            System.out.println(maximo);
        } else {
            System.out.println("No hay múltiplos de 4");
        }

    FLAG -> "¿Debo actualizar el máximo?"
    ✅ Sí, si:
        Todavía no había encontrado ningún múltiplo de 4 → !encontrado es true
        → Entonces este es el primero, y debo guardarlo como máximo, sin importar su valor (aunque sea negativo o cero).
    O
        Ya había encontrado al menos uno, y este nuevo número es mayor que el máximo actual → numero > maximo es true.

   */



}
