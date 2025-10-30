package ajces.arrays;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class ejercicios {

  private static Scanner teclado = new Scanner (System.in);

  public static void main(String[] args) {

      /*
      .................................................................................................
      ARRAYS_EJERCICIO_07:
        Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
        muestre por pantalla separados por espacios. El programa pedirá entonces por
        teclado dos valores y a continuación cambiará todas las ocurrencias del primer
        valor por el segundo en la lista generada anteriormente. Los números que se
        han cambiado deben aparecer entrecomillados.
      .................................................................................................
      */


      //sustituirDosNum();


      /*
      .................................................................................................
    ARRAYS_EJERCICIO_16:
      Escribe un programa que rellene un array de 20 elementos con números enteros
      aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
      programa mostrará el array y preguntará si el usuario quiere resaltar los
      múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
      escribiendo los números que se quieren resaltar entre corchetes.
      .................................................................................................
      */


      //resaltarMultiplos();


      /*
      .................................................................................................
    ARRAYS_EJERCICIO_17:
      Escribe un programa que muestre por pantalla un array de 10 números enteros
      generados al azar entre 0 y 100. A continuación, el programa debe pedir un
      número al usuario. Se debe comprobar que el número introducido por teclado
      se encuentra dentro del array, en caso contrario se mostrará un mensaje por
      pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
      correctamente. A continuación, el programa rotará el array hacia la derecha
      las veces que haga falta hasta que el número introducido quede situado en la
      posición 0 del array. Por último, se mostrará el array rotado por pantalla.
      .................................................................................................
      */

      //rotarArrayByNum();


      /*
      .................................................................................................
    ARRAYS_EJERCICIO_19:
      Realiza un programa que sea capaz de insertar un número en una posición
      concreta de un array. En primer lugar, el programa generará un array de 12
      números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
      debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
      el programa preguntará por el número que se quiere insertar y por la posición
      donde será insertado. Los números del array se desplazan a la derecha para
      dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
      siempre se perderá.
      .................................................................................................
      */

      //insertarNumArray();


      /*
      .................................................................................................
    ARRAYS_EJERCICIO_20:
      Implementa un programa que calcule la denominación ordinal de los reyes de
      una secuencia histórica. El programa solicitará la cantidad de reyes que se
      van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
      por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
      por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
      aparecer como Felipe 1º y el segundo como Felipe 2º.
      .................................................................................................
      */


      nombresReyes();

      //main
    }

    public static void sustituirDosNum() {

      int [] arrayNums = new int [100];
      Random rand = new Random();
      for (int i=0; i<100; i++) {
        arrayNums[i] = rand.nextInt(20);
        System.out.print(arrayNums[i] + " ");
      }
      System.out.println("\nIntroduzca dos números cualquiera: ");
      int numero1 = teclado.nextInt();
      int numero2 = teclado.nextInt();
      for ( int i=0; i<100; i++ ) {
        if (arrayNums[i] == numero1) {
          arrayNums[i] = numero2;
        }
      }
      for ( int i=0; i<100; i++ ) {
        if (arrayNums[i] == numero2) {
          System.out.print("'" + arrayNums[i] + "' ");  // Con comillas si es numero2
        } else {
          System.out.print(arrayNums[i] + " ");  // Sin comillas en caso contrario
        }
      }
    }


    public static void resaltarMultiplos() {

      Random randomear = new Random();
      int [] arrayNumeros = new int [20];
      int opcion = 0;
      //Rellenar y visualizar array.
      System.out.print("{ ");
      for ( int i=0; i<arrayNumeros.length; i++) {
        arrayNumeros[i] = randomear.nextInt(400);
        System.out.print(arrayNumeros[i] + " ");
      }
      System.out.print("}\n");
      System.out.println("Desea visualizar los múltiplos de 5 en el array o los de múltiplos de 7?");
      System.out.println("1. Ver los múltiplos de 5.\n2. Ver los múltiplos de 7.");
      opcion = teclado.nextInt();
      if (opcion == 1) {
        //Imprimir el array con los múltiplos de 5 resaltados.
        System.out.print("{ ");
        for ( int i=0; i<arrayNumeros.length; i++ ) {

          if ( arrayNumeros[i] % 5 == 0) {
            System.out.print( "[" + arrayNumeros[i] + "]" + " ");
          } else {
            System.out.print(arrayNumeros[i] + " ");
          }

        }
        System.out.print("}\n");
      } else if ( opcion == 2) {
        //Imprimir el array con los múltiplos de 7 resaltados.
        System.out.print("{ ");
        for ( int i=0; i<arrayNumeros.length; i++) {

          if ( arrayNumeros[i] % 7 == 0) {
            System.out.print( "[" + arrayNumeros[i] + "]" + " ");
          } else {
            System.out.print(arrayNumeros[i] + " ");
          }

        }
        System.out.print("}\n");
      } else {
        System.out.println("Por favor, elija una opción válida.");
      }
    }


    public static void rotarArrayByNum() {

      Random randomear = new Random();
      int [] arrayNum = new int [10];
      int opcion = 0;
      boolean contenido = false;

      System.out.print("{ ");
      for (int i=0; i<arrayNum.length; i++) {
        arrayNum[i] = randomear.nextInt(100);
        System.out.print(arrayNum[i] + " ");
      }
      System.out.print("}\n");

      System.out.println("Busquemos un número, entre 0 y 100, de su elección, en el array ->");



      while ( !contenido) {

        System.out.println("Introduzca un número entero->");
        opcion = teclado.nextInt();
        for ( int i=0; i<arrayNum.length; i++) {
          if ( arrayNum[i] == opcion) {
            contenido = true;
            int numeroBuscado = arrayNum[i];
            for ( int j=i; j>0; j--) {
              arrayNum[j] = arrayNum[j-1];
            }
            arrayNum[0] = numeroBuscado;
            break;
          }
        }          if (!contenido) {
          System.out.println("El número introducido no está contenido en el array, por favor, introduzca otro número:");
        }


      }

      System.out.print("{ ");
      for (int i=0; i<arrayNum.length; i++) {
        System.out.print(arrayNum[i] + " ");
      }
      System.out.print("}");

      // rotarArryByNum
    }


    public static void insertarNumArray() {

      //Declarar variable necesarias para la funcion.
      Random randomear = new Random();
      int [] array01 = new int [12];
      int [] array02 = new int [12];
      int numeroNew = 0;
      int posicion = 0;

      //Rellenar el array inicial con números aleatorios de 0 a 200, AMBOS INCLUIDOS.
      for (int i = 0; i < array01.length; i++) {
        array01[i] = randomear.nextInt(400 - 0 + 1) + 0;
      }
      //Imprimir índices y elementos.
      //Array inicial->
      System.out.print("Índices: ");
      for (int i = 0; i < array01.length; i++) {
        System.out.printf("%4d", i );
      }
      System.out.println();
      System.out.printf("Valores: ");
      for (int i = 0; i < array01.length; i++) {
        System.out.printf("%4d", array01[i]);
      }
      System.out.println();
      System.out.println("\nIndique un número para insertar en el array y la posición dónde insertarlo ->");
      numeroNew = teclado.nextInt();
      posicion = teclado.nextInt();

      for (int i=array01.length-1; i > posicion; i--)  {
        array01[i] = array01[i-1];
      }
      array01[posicion] = numeroNew;


      System.out.print("Índices: ");
      for (int i = 0; i < array01.length; i++) {
        System.out.printf("%4d", i );
      }
      System.out.println();
      System.out.printf("Valores: ");
      for (int i = 0; i < array01.length; i++) {
        System.out.printf("%4d", array01[i]);
      }



      //insertarNumArray
    }



    public static void nombresReyes() {

      //Crear un array de strings para contener los nombres.
      int dinastia = 0;
      System.out.print("Introduzca el número de reyes a ordenar ->");
      dinastia = teclado.nextInt();
      teclado.nextLine();
      String [] kingdom = new String[dinastia];
      System.out.print("Introduzca uno a uno los nombres de los reyes ->");
      for (int i = 0; i < dinastia; i++) {
        System.out.print("Rey " + (i + 1) + ": ");
        kingdom[i] = teclado.nextLine();
      }

      //Contar coincidencias de cada nombre.

      int[] contador = new int [dinastia];

        /*Se almacenan en un array del mismo tamaño
         que el que contiene los nombres de reyes las veces que aparecen
         en el array de nombres
          contador[0] = 1 (Felipe, es el primero)
          contador[1] = 1 (Carlos, es el primero)
          contador[2] = 2 (Felipe, ya apareció antes 1 vez + este = 2)
          contador[3] = 3 (Felipe, ya apareció antes 2 veces + este = 3)
         */

      for (int i = 0; i < kingdom.length; i++) {
        int count = 1;
        for (int j = 0; j < i; j++) {
          if (kingdom[j].equalsIgnoreCase(kingdom[i])) {
            count++;
          }
        }
        contador[i] = count;
      }

      //Imprimir

      for ( int i = 0; i < kingdom.length; i++) {
        if (contador[i] == 1) {

        }
      }



      //nombresReyes
    }











    //Main
  }







