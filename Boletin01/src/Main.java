import java.util.Scanner;
import java.util.Random;

public class Main {
  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {


        /*
    BOLETÍN1_8: Realiza un programa que genere letras aleatoriamente y determine si son vocales o consonantes:

     */
  /*
    System.out.println("Indique cuantas letras aleatorias desea generar->");
    int letrasNum = teclado.nextInt();
    letrasAleatorias(letrasNum);
  */

    // BOLETÍN1_8: Desarrolla una metodo en la que, averigüe si es un número Armstrong. Un número es Armstrong cuando
    // la suma de cada uno de los números que lo componen elevado al número de dígitos de dicho número da como resultado
    //  el propio número. Por ejemplo: 153 = 1^3+5^3+3^3
    /*
    System.out.println("Introduzca un número de tres dígitos para comprobar si es Armstrong->");
    int numArm = teclado.nextInt();
    numerosArmstrong(numArm);
    */




    /*
    BOLETÍN1_12:Desarrolla un programa que, dado un importe en euros (?), calcule la cantidad mínima de billetes necesaria y la
    cantidad restante (el 'cambio' o 'sobrante') que no se puede representar con billetes, asumiendo que solo se utilizan
     billetes de curso legal (por ejemplo, 5?, 10?, 20?, 50?, 100?, 200? y 500?).

     */
    /*
    System.out.println("Introduzca una cantidad en Euros ->");
    int euros = teclado.nextInt();

    pasarABilletes(euros);
    */
    /*
    EJERCICIOS_SEMANALES: Patrones de dígitos: recibe un número entero de al menos 10 dígitos y determina la longitud
     de la mayor subsecuencia de dígitos consecutivos pares (la mayor cantidad de números consecutivos pares) .
    */
    System.out.println("Introduce un número de al menos 10 dígitos->");
    String cifra = teclado.nextLine();
    patronesDigitos(cifra);




  }//main


  public static void pasarABilletes(int monto) {

    int cantidad = monto;

    int[] tipoBillete = {500, 200, 100, 50, 20, 10, 5};
    int[] cantBillete = new int [tipoBillete.length];

    for (int i=0; i<tipoBillete.length; i++){

      if(cantidad >= tipoBillete[i]){
        cantBillete[i] = cantidad / tipoBillete[i];
        cantidad = cantidad % tipoBillete[i];
      }
    }
    int sobrante = cantidad;

    System.out.printf("%d?\n", monto);

    for (int i=0; i<cantBillete.length; i++){
      if (cantBillete[i] > 0){
        System.out.println(cantBillete[i] + " billetes de " + tipoBillete[i] + "?");
      }
    }
    System.out.println("Sobrante = " + sobrante + "?");

  }//pasarAbilletes

  public static void letrasAleatorias(int numLetras){

    char [] abecedarioArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    //Declaro el array con el abecedario completo.
    char [] arrayVocales = {'a', 'e', 'i', 'o', 'u'};
    //Declaro el array con las vocales
    Random indiceAleatorio = new Random();
    //Declaro un obejeto de la clase Random para utilizar sus métodos

    //System.out.println(abecedarioArray.length);

    char [] letrasRandom = new char [numLetras]; // Declaro el array que va a contener las letras aleatorias.

    //Relleno el array de letras aleatorias, que tendrá le tamaño elegido por el usuario y que tendrá
    // elementos extraidos de abecedarioArray de posiciones aleatorias

    for (int i=0; i<numLetras; i++){
      int j = indiceAleatorio.nextInt(abecedarioArray.length);
      letrasRandom[i] = abecedarioArray[j];
    }

    System.out.println();
    for(int i=0; i<letrasRandom.length; i++){
      System.out.print(letrasRandom[i] + " ");
    }
    System.out.println();
    System.out.println();

    //System.out.println(abecedarioArray.length);


    //Imprimo el array de letras aleatorias y lo recorro comparando con el arrayVocales para identificar vocales y consonantes.

    for (int i=0; i<numLetras; i++) { //Recorro el array de letras aleatorias
      boolean esVocal = false;

      for (int j = 0; j < arrayVocales.length; j++) { //Recorro el array de vocales
        if (letrasRandom[i] == arrayVocales[j]) { //Comparo cada letra de letrasAleatorias con TODOS los elementos de arrayVocales.
          esVocal = true; //Si el elemento de letrasRandom coincide con uno de arrayVocales se interrumpe.
          break;
        }
      }//Fin del bucle que recorre el array de vocales

      if (esVocal) { //Del recorrido del primer bucle voy imprimiendo las vocales encontradas y las consonantes
        System.out.println("La letra " + letrasRandom[i] + " es una vocal.");
      } else{
        System.out.println("La letra " + letrasRandom[i] + " es una consonante.");
      }

    }//Fin del bucle que recorre el array de letras aleatorias.


  }//letrasAleatorias



  public static void numerosArmstrong(int numero){

    if (numero < 100 || numero > 999) {
      System.out.println("❌ El número " + numero + " no es de 3 cifras.");
      return;
    }

    String cadenaNumero = String.valueOf(numero);
    int[] arrayDigitos = new int [cadenaNumero.length()];

    for (int i=0; i<cadenaNumero.length(); i++){
      char caracterNumero= cadenaNumero.charAt(i);
      int digitoNumero = Character.getNumericValue(caracterNumero);
      arrayDigitos[i] = digitoNumero;
    }

    /*
    for (int i=0; i<cadenaNumero.length(); i++){
      System.out.println(cadenaNumero.charAt(i) + " ");
    }
    */


    boolean esArmstrong = false;
    int sumaDigitos = 0;

    for(int i=0; i< arrayDigitos.length; i++){
      sumaDigitos += (int) Math.pow(arrayDigitos[i],3);
      if(sumaDigitos==numero){
        esArmstrong = true;
      }
    }

    if (esArmstrong){
      System.out.println("✅ El número " + numero + " es un número Armstrong.");
    }else
      System.out.println("❌ El número " + numero + " NO es un número Armstrong.");

  }//numerosAmstrong

  public static void patronesDigitos(String numero){

    int[] digitos = new int[numero.length()];

    if(numero.length()<10){
      System.out.println("Por favor, introduzca un número de al menos 10 dígitos.");
    }else{

      int maximoRacha = 0;
      int racha = 0;
      for (int i = 0; i < numero.length(); i++){
        if (Integer.parseInt(String.valueOf(numero.charAt(i))) % 2 == 0){
          racha++; //Cada vez que se encuentra un numero par se aumenta "racha".
        }else
          racha = 0;//Cada vez que aparece un impar se interrumpe la racha.

        if (racha > maximoRacha){
          maximoRacha = racha; //El número máximo de racha va a ser el número máximo
                                // de veces que se encuentran números pares consecutivos.
        }
      }
      System.out.println("La secuencia mayor de números pares es de " + maximoRacha + " números.");
    }

  }//Patrones de dígitos






}//Main