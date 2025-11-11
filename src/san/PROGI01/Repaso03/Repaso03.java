package san.PROGI01.Repaso03;

/*
Ejercicios de repaso:
1. Metodo countContainWords(String[] phrases, String words) : return int

	* Este metodo se le pasa un array de frases y una palabra. Tiene que devolver el número
	   de frases que contiene esa palabra.

	* Tiempo máximo: 20 min

2. Metodo getFinalNum(int num, double percentage) : return double

	* Este metodo recibe como parámetro un número y un porcentaje. El metodo tiene que devolver un número que será el
	 porcentaje del número dado.
	* Si al realizar la operación el número es inferior a 1000 pero mayor que 100, el número se divide entre 3.
	* Si al realizar la operación el número es inferior a 100 pero mayor que 10, se deja tal cual.
	* Si al realizar la operación el número es menor que 10, se multiplica por 3.

		* Tiempo máximo: 35 min

3. Metodo getFirstRow(int[][] matrix, int columns) return int[]

	* Este metodo se le pasa como parámetro una matriz y el número de columnas que va a tener.
	* Tiene que devolver la primera fila en un array.
	* El número de columnas nos dice que longitud tendrá el array que debemos devolver.

	* Tiempo máximo: 30 min
 */


public class Repaso03 {


  public int countContainWords(String[] phrases, String words) {

    int numFrases = 0;

    for (int i = 0; i < phrases.length; i++) {
      if (phrases[i].toLowerCase().contains(words.toLowerCase())) {
        numFrases++;
      }
    }

    return numFrases;
  }

  public int countContainWords2(String[] phrases, String words) {
    if (words == null) {
      return 0;
    }

    int numFrases = 0;
    String target = words.toLowerCase();

    for (int i = 0; i < phrases.length; i++) {
      if (phrases[i] == null) {
        continue;
      }

      // Dividimos la frase en "palabras" usando espacios (y múltiples espacios)
      String[] palabras = phrases[i].split("\\s+");

      // Buscamos si alguna palabra coincide (ignorando mayúsculas/minúsculas)
      for (String palabra : palabras) {
        if (palabra.toLowerCase().equals(target)) {
          numFrases++;
          break; // contar la frase solo una vez, aunque la palabra aparezca varias veces
        }
      }
    }

    return numFrases;
  }


  public static double getFinalNum(int num, double percentage) {

    double operacion = 0.0;

    operacion = num * percentage/100;


    if (operacion < 10) {
      operacion = operacion * 3;
    } else if ( 10 < operacion && operacion < 100) {
      operacion = operacion * 1;
    }else if ( 100 < operacion && operacion < 1000) {
      operacion = operacion / 3;
    }

    return operacion;
  }






}
