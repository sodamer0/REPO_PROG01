import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    String palabra="programacion";
    String palabraOculta="____________";
    char [] arrayLetras = new char[palabra.length()];
    char [] arrayAciertos = new char[palabra.length()];
    int letrasUsadas = 0;
    char [] arrayLetrasUsadas = new char[26];

    arrayAciertos = new char[]{'_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};

    char [] arrayHorca = new char[20];

    palabra=palabra.toLowerCase();

    for(int i=0; i<palabra.length(); i++){
      arrayLetras[i]=palabra.charAt(i);
    }

    int intentos = 0;

    do {
      System.out.println("Introduce una letra para descubrir la palabra oculta: ");
      char letra = teclado.next().charAt(0);

      boolean repetida = false;
      for (int i = 0; i < letrasUsadas; i++) {
        if (arrayLetrasUsadas[i] == letra) {
          repetida = true;
          break;
        }
      }
      if (repetida) {
        intentos++;
        System.out.println("Ya has probado con la letra '" + letra + "'. ¡Pierdes un intento!");
        if (intentos <= 11) {
          dibujarHorca(intentos);
        }
      } else {
        arrayLetrasUsadas[letrasUsadas] = letra;
        letrasUsadas++;

        boolean coincidencia = false;
        for (int i = 0; i < arrayLetras.length; i++) {
          if (arrayLetras[i] == letra) {
            arrayAciertos[i] = letra;
            coincidencia = true;
          }
        }

        if (coincidencia) {
          System.out.println(new String(arrayAciertos));

        } else {
          intentos++;
          System.out.println("La letra '" + letra + "' no aparece en la palabra oculta.");
          if (intentos <= 11) {
            dibujarHorca(intentos);
          }

        }
      }
    }
    while (!new String(arrayAciertos).equals(palabra) && intentos < 11) ;

    if (new String(arrayAciertos).equals(palabra)) {
      System.out.println("¡Enhorabuena! La palabra oculta era \"" + palabra + "\"");
    } else {
      System.out.println("¡Has perdido! La palabra oculta era: \"" + palabra + "\"");
    }


  }






  public static void dibujarHorca(int num){

      switch(num) {
        case 1:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println("---");
          break;
        case 2:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("");
          System.out.println("");
          System.out.println("");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 3:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 4:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 5:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 6:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O");
          System.out.println(" |  ");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 7:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O");
          System.out.println(" |  |");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 8:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O");
          System.out.println(" | /|");
          System.out.println(" |");
          System.out.println("---");
          break;
        case 9:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O");
          System.out.println(" | /|\\");
          System.out.println(" |  ");
          System.out.println("---");
          break;
        case 10:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O");
          System.out.println(" | /|\\");
          System.out.println(" | / ");
          System.out.println("---");
          break;
        case 11:
          System.out.println("Te quedan " + (11 - num) + " intentos.\n");
          System.out.println("_____");
          System.out.println(" |  |");
          System.out.println(" |  O ");
          System.out.println(" | /|\\            ¡ A H O R C A D O !");
          System.out.println(" | / \\ ");
          System.out.println("---");
          break;
        default:
          break;
      }

  }

}