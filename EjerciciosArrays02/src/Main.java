import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);
    String palabra="programacion";
    String palabraOculta="____________";
    char [] arrayLetras = new char[palabra.length()];
    char [] arrayAciertos = new char[palabra.length()];
    arrayAciertos = new char[]{'_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_'};

    char [] arrayHorca = new char[20];

    palabra=palabra.toLowerCase();

    for(int i=0; i<palabra.length(); i++){
      arrayLetras[i]=palabra.charAt(i);
    }
    System.out.println(new String(arrayLetras));

    do {
;
      System.out.println("Introduce una letra para descubrir la palabra oculta: ");
      char letra = teclado.next().charAt(0);
      boolean coincidencia = false;

      for (int i = 0; i < arrayLetras.length; i++) {
        if (arrayLetras[i] == letra) {
          arrayAciertos[i] = letra;
          coincidencia=true;
        }
      }

      if(coincidencia){
        System.out.println(new String(arrayAciertos));
      }else {
        System.out.println("La letra '" + letra + "' no aparece en la palabra oculta.");

      }

    }while(!new String(arrayAciertos).equals(palabra));

    System.out.println("Enhorabuena! La palabra oculta era \"" + palabra + "\"");

  }




}