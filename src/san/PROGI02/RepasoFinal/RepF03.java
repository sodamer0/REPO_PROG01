package san.PROGI02.RepasoFinal;

/*

3. getMax(int[] array) : return int
	Dado un array unidimensional, devolver el número mayor.

	Tiempo: 20 min
 */


public class RepF03 {



  public static int getMax(int[] array) {

    int maximo = array[array.length - 1];

    for (int i = 0; i < array.length; i++) {
      if ( array[i] > maximo) {
        maximo = array[i];
      }
    }
    return maximo;
  }




}
