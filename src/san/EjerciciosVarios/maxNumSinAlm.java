package san.EjerciciosVarios;
import java.util.Scanner;
public class maxNumSinAlm {

  private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {


    }

      public static void darMaxNumSinAlm () {
        // Lee el primer número
        int number = teclado.nextInt();
        // El primer número (si no es 0) será el máximo inicial
        int max = number;
        // Mientras el número no sea 0, sigue leyendo
        while (number != 0) {
          // Compara y actualiza el máximo si es necesario
          if (number > max) {
            max = number;
          }
          // Lee el siguiente número
          number = teclado.nextInt();
        }
        // Imprime el máximo encontrado
        System.out.println(max);

        teclado.close();
      }


 //maxNumSinAlm
}


