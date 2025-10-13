import java.util.Scanner;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    int num = 0;

    int[] array = new int[100]; // Se especifica un tamaño del array que almacene los números que introduzca el usuario.

    int i = 0;
                                // O se podría preguntar al usario cuántos números va a introducir en total.
    do{
      System.out.println("Numero: ");
      num = teclado.nextInt();
      array[i] = num; // Se van a ir almacenando los números introducidos en el array.
      i++;

    }while(num != 0);

    int contadorPatron = 0; //Cuantas veces se cumple el patrón especificado en la secuencia de números guardados
                            //

    int racha = 0; // Cuántas veces ese patrón se mantiene,

    for (int j = 0; j < array.length-1; j++){ //Se van a comparar los números almacenados, desde el primero [0] hasta el penúltimo,
      if(array[j]<array[j+1]){
          racha++;
        }
      if (array[j] > array[j + i] && racha >= 2) { // racha mayor o igual a 2 porque se han comparado 3 números.
        contadorPatron++;
        racha = 0;
      }else if (array[j] > array[j+1]){
        racha = 0;

      }
      System.out.println("El número de patrones es: " + contadorPatron);
    }


  }

}
