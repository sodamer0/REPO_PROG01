public class Main {


    /*
  Crear las siguientes funciones en el ejercicios03Tests.Main.
  Recuerda que al estar dentro del main, las funciones deben de ser estáticas.
  1. Crea una función que sea checkWordLength(String word) que devuelva la longitud de cada palabra que se le envíe como
   parámetro.
  2. Crea una función NumOfVowels(String word) que devuelva el número de vocales que contiene esa palabra. Para poder
   realizar este ejercicio, deberás descomponer el String en un array de char[] con la función: toCharArray();
  3. Crea una función llamada checkNumberOfPrimes(int[] numbers) la cual se le envíe como parámetro un array de números
  y nos devuelva cuantos números primos hay. Crea otra función que sea isPrime(int i) que devuelva un boolean. Úsala en la
    primera función.
  4: Crea una función llamada isIdentityMatrix(int[][] matrix) que devuelva un booleano conforme si una matriz es
   identidad o no. Recuerda que una matriz identidad es aquella que su diagonal de izquierda a derecha son
    todo 1 y el resto son todo 0.

	Ejemplos:

	1	0	0
	0	1	0
	0	0	1


	1	0	0	0
	0	1	0	0
	0	0	1	0
	0	0	0	1
     */



  public static int checkWordLength(String word) {

    int tamanho = 0;

    tamanho = word.length();

    return tamanho;
  }


  public static int NumOfVowels(String word) {

    int cantVocales = 0;
    word = word.toLowerCase();

    char [] arrayWord = word.toCharArray();

    char [] arrayVocales = {'a','e','i','o','u'};

    for ( int i=0; i<arrayWord.length; i++){
      for ( int j=0; j<arrayVocales.length; j++){
        if (arrayWord[i] == arrayVocales[j]){
          cantVocales++;
        }
      }
    }

    return cantVocales;
  }

  public static int checkNumberOfPrimes(int[] numbers) {

    int cantOddNum = 0;

    for ( int i=0; i<numbers.length; i++){
      if (isPrime(numbers[i])){
        cantOddNum++;
      }
    }
    return cantOddNum;
  }

  public static boolean isPrime(int i){

    int divisible = 0;
    boolean esPrimo = true;
    if ( i<=1) {
      esPrimo = false;
    }
    for ( int j=1; j<=i; j++) {
      if ( i % j == 0 ) {
        divisible++;
      }
    }
    if (divisible > 2){
      esPrimo = false;
    }
    return esPrimo;
  }

  public static boolean isIdentityMatrix(int[][] matrix) {

    boolean matrizIdentidad = true;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        if (i == j) {
          if (matrix[i][i] != 1) {
            return false;
          }
        } else {
          if (matrix[i][j] != 0) {
            return false;
          }
        }
      }
    }
    return matrizIdentidad;
    //isIdentityMatrix
  }





  //ejercicios03Tests.Main
}
