import javax.swing.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    /*
     * EJERCICIO_01: Pedir 5 números, y mostrar al final si se ha introducido alguno negativo.
     */
  /*
    System.out.println("Introduzca 5 números enteros cualesquiera: ");
    int[] array01 = new int[5];
    for (int i = 0; i < 5; i++) {
      array01[i] = teclado.nextInt();
    }
    teclado.nextLine();

    if(detectarNegativos(array01)){
      System.out.println("\nAtención!, tu array contiene números negativos.");
    }else
      System.out.println("\nQué bueno!, tu array no contiene números negativos.");

  }


  */

    /*
      EJERCICIO_02: Pedir números e indicar si es múltiplo de 3. El programa finaliza con -1.
    */
    /*
    int num02=0;
    System.out.println("Introduzca números para comprobar si son múltiplos de 3. El programa finaliza al introducir el número -1");
    do{
      System.out.println("Introduzca un número: ");
      num02 = teclado.nextInt();
      if (num02==-1) {
        break;
      }
      if (num02<0) {
        System.out.println("Introduzca números positivos.");
      }else {
        if (multiploX3(num02)) {
          System.out.println("El número " + num02 + " es múltiplo de 3.");
        } else {
          System.out.println("El número " + num02 + " NO es múltiplo de 3.");
        }
      }
    }while(num02!=-1);
    System.out.println("Programa finalizado.");

    */

    /*
      EJERCICIO_03: Leer 5 números y mostrarlos en orden inverso al introducido.
     */
    /*
    System.out.println("Introduzca 5 números enteros para mostrarlos en orden inverso:");
    int [] array03 = new int[5];
    for(int i=0;i<5;i++){
      System.out.println("Introduzca un número ->");
      array03[i] = teclado.nextInt();
    }
    imprimirArray(array03);
    int [] array03Inverso = inversor(array03);
    imprimirArray(array03Inverso);
    */


    //EJERCICIO_04: Realizar una aplicación que devuelva si una palabra es un palíndromo o no.

    System.out.println("Introduzca una palabra para comprobar si es palíndroma o no: ");
    String palabraPrueba = teclado.nextLine();

    String resultado = verPalindromia(palabraPrueba)? "Es palíndroma" : "No es palídroma.";
    System.out.println(resultado);








    /*
      EJERCICIO_05: Realiza una aplicación con la que puedas jugar con la máquina a pares o nones.
        -El número que escoja la máquina deberá ser aleatorio y evidentemente de estar
        entre el 1 y el 5 (dedos de una mano).
        -Se jugará al mejor de 3 rondas.
        -En cada ronda el jugador deberá elegir si quiere pares o nones.
        -Al finalizar cada ronda, se deberá imprimir por pantalla si ha ganado el jugador
        o la máquina esa ronda. También deberá aparecer qué número ha salido con la suma de las 2 manos
        * y si es PARES o NONES.
         - ¡PARES! Ha salido el 4. La máquina ha ganado esta ronda.
         - ¡NONES! Ha salido el 7. Has ganado esta ronda.
        -Al finalizar la partida al mejor de 3 (recordemos que si un jugador gana las 2 primeras rondas
        *  ya no se debería jugar la 3 ronda) deberá aparecer el siguiente mensaje:
            - ¡Has ganado la partida!
            - ¡Máquina ha ganado!
        -Además, se podrá volver al jugar las partidas que se quiera hasta que digamos
         que no.
            - ¿Quieres jugar otra partida? (S/N)
* */

  }




  public static void imprimirArray(int[] array){
    System.out.print("{ ");
    for (int i=0; i<array.length-1; i++){
      System.out.print(array[i] + ", ");
    }
    System.out.println(array[(array.length-1)] + " }");
  }



  public static boolean detectarNegativos(int[] array){

    int contador=0;
    for (int j=0;j<5;j++){
      if(array[j]<0){
        return true;
      }
    }
    return false;
  }

  public static boolean multiploX3(int numero){
    if(numero % 3 == 0){
      return true;
    }
    return false;
  }

  public static int[] inversor(int[] array){
    int [] arrayAux = new int[array.length];
    for(int i=0, j=(array.length-1);j>=0;i++,j--){
      arrayAux[i] = array[j];
    }
    return arrayAux;
  }

  public static boolean verPalindromia(String palabra){
    char [] palabraDes = new char[palabra.length()];
    char [] palabraDesInv = new char[palabraDes.length];
    for (int i=0; i<palabra.length();i++){
      palabraDes[i] = palabra.charAt(i);
    }
    for (int i=palabraDes.length-1, j=0;i>=0;i--,j++){
      palabraDesInv[j] = palabraDes[i];
    }
    for(int i=0;i<palabraDes.length;i++){
      if (palabraDes[i] == palabraDesInv[i]){
        return true;
      }
    }
    return false;
  }




}
