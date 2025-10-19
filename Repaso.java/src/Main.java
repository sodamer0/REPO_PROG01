import java.util.Random;
import java.util.Scanner;


public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {
      /*
    1: Pedir números indefinidamente. A medida que se piden números solo queremos
      mostrar los que cumplan al menos uno de los siguientes requisitos:
        • Requisito 1: Que sea par y que al multiplicarlo por 5 sea mayor que 25
        • Requisito 2: Que sea impar y que al multiplicarlo por 3 sea menor que 10
      */
    //pedirNumeros();

    //2: Pedir un número N, y mostrar todos los números del 1 al N.

    //numerosHastaN();

    //3: Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días.

    //validarFecha();
    validarFecha2();

    //EJERCICIO_REPASO_04: Pedir solo un número. Determinar si es un número es primo o no.




    /*
    EJERCICIO_REPASO_05: Se creará un número random del 56 al 108 e intentaremos adivinar cual es.
      El programa tendrá que pedirte dos números.
      • El primero, cuando se pida por teclado se multiplicará por el número random.
      Solo está permitido números impares mayores de 50.
      • Se mostrará el resultado de la multiplicación.
      • El segundo número será tu intento para adivinar el número random.
      Si has acertado, ganas el juego. Si no, sigues intentándolo de nuevo hasta un máximo
      de 3 intentos.
    */
    /*
    System.out.println("Bienvenido a este juego: Descubra el número secreto: Siga las instrucciones ->");

    pedirDosNumeros();
    */


    //main
  }


  public static void pedirNumeros() {

    boolean salir = false;
    int opcion = 0;
    do{
      System.out.println("Menú: \n1. Validar números. \n2. Salir.");
      opcion = teclado.nextInt();
      switch (opcion){
        case 1:
          System.out.println("Introduce un número entero cualquiera -->");
          int numero = teclado.nextInt();
          boolean condicion1 = (numero % 2 == 0) && (numero * 5 > 25);
          boolean condicion2 = (numero % 2 != 0) && (numero * 3 < 10);

          if (condicion1 || condicion2){
            if((numero % 2 == 0) && (numero * 5 > 25)){
              System.out.println("El número " + numero + " es par y multiplicado por 5 da un número mayor que 25. \n");
            }else {
              System.out.println("El número " + numero + " es impar y multiplicado por 3 da un número menor que 10. \n");
            }
          }else {
            System.out.println("El número introducido no cumple ninguna de las condiciones.\n");
          }
        break;
        case 2:
          salir = true;
          System.out.println("Gracias por jugar!");
          break;

        }

    }while(!salir);
  }

  public static void numerosHastaN(){
    int numero;
    System.out.println("Introduce un número entero cualquiera --> ");
    numero = teclado.nextInt();

    for(int i=1; i<numero; i++){
      System.out.print(i + ", ");
    }
    System.out.println(numero + ".");
  }

  public static void validarFecha(){

    System.out.println("Introduzca el día  -->");
    int dia = teclado.nextInt();
    System.out.println("Introduzca el mes en formato numérico-->");
    int mes = teclado.nextInt();
    System.out.println("Introduzca el año -->");
    int anho = teclado.nextInt();

    boolean condicionMes30 = (mes==4 || mes==6 || mes==9 || mes==11);
    boolean condicionMes28 = (mes == 2);
    boolean condicionMes31 = !(condicionMes30 || condicionMes28);


    if (anho>0 && (mes>=1 && mes<=12)){
      if (condicionMes30){
        if (dia>0 && dia<=30){
          System.out.println("La fecha es correcta.");
        }else{
          System.out.println("La fecha NO es válida.");
        }
      }else if (condicionMes28){
        if (dia>0 && dia<= 28){
          System.out.println("La fecha es correcta.");
        }else{
          System.out.println("La fecha NO es válida.");
        }
      }else{
        if(dia>0 && dia<=31){
          System.out.println("La fecha es correcta.");
        }else{
          System.out.println("La fecha NO es válida.");
        }
      }
    }else{
      System.out.println("Por favor, introduzca un año y/o mes válidos.");
    }


  }

  public static void validarFecha2(){


    System.out.println("Introduzca el día  -->");
    int dia = teclado.nextInt();
    System.out.println("Introduzca el mes en formato numérico-->");
    int mes = teclado.nextInt();
    System.out.println("Introduzca el año -->");
    int anho = teclado.nextInt();

    int diasEnMes = 0;
    boolean esBisiesto = (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);
    boolean fechaValida = false; // Flag para manejar el resultado al final

    if (anho > 0 && mes >= 1 && mes <= 12) {
      // --- 1. Lógica consolidada (DRY) para determinar el límite de días ---
      if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        diasEnMes = 30;
      } else if (mes == 2) {
        diasEnMes = esBisiesto ? 29 : 28; // Manejo DRY del caso 28/29
      } else {
        diasEnMes = 31;
      }

      // --- 2. Validación única (DRY) del día contra el límite ---
      if (dia > 0 && dia <= diasEnMes) {
        fechaValida = true;
      }

      // --- 3. Mensajes consolidados (DRY) ---
      if (fechaValida) {
        System.out.println("La fecha es correcta.");
      } else {
        System.out.println("La fecha NO es válida.");
      }

    } else {
      // Caso de error inicial
      System.out.println("Por favor, introduzca un año y/o mes válidos.");
    }
  }

  public static void pedirDosNumeros(){

    Random rand = new Random();
    int userNumber1 = 0;
    int userNumber2 = 0;
    int randomSecretNumber = rand.nextInt(108 - 56 + 1) + 56;

    System.out.println("Por favor, introduzca un número impar mayor de 50 ->");

    do{
      userNumber1 = teclado.nextInt();
      if (userNumber1 % 2 != 0 && userNumber1 > 50){
        int producto = userNumber1 * randomSecretNumber;
        System.out.println("El número proporcionado, multiplicado por el número secreto da como resultado: " + producto);
        System.out.println("Ahora, intente adivinar el número secreto ->");
        boolean adivinado = false;

        for(int i=1; i<=3; i++){
          userNumber2 = teclado.nextInt();

          if (userNumber2 == randomSecretNumber){
            System.out.println("Enhorabuena!. Ha acertado el número secreto!: " + randomSecretNumber);
            adivinado = true;
            break;
          }else{
            if (i<3){
              System.out.println("Ese no es el número secreto! Inténtelo otra vez->");
              System.out.println("Le quedan " + (3 - i) + " intentos.");
            }
          }
        }

        if (!adivinado){
          System.out.println("Lo siento, ha perdido!. Juegue otra vez.");
        }
        break;

      }else{
        System.out.println("Por favor, número no válido. Inténtelo otra vez->");
      }

    }while(userNumber1 % 2 == 0 || userNumber1 <= 50);




    //pedirDosNumeros
  }




  //Main
}