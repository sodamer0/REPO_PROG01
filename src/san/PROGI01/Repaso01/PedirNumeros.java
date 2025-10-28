package san.PROGI01.Repaso01;

import java.util.Random;
import java.util.Scanner;

public class PedirNumeros {


  public static void pedirNumeros() {

    Scanner teclado = new Scanner(System.in);

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









}
