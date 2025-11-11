package san.PROGI01.Repaso02;

/*

Trabajas en una empresa de desarrollo de software e IA y tu proyecto está enfocado en sanidad. Tu función es programar
ciertas máquinas con algunos algoritmos punteros.
Check de parámetros de máquinas:
1- checkReset(int[] actual, int[] original): boolean
	Recibe 2 array, uno con el estado original de la máquina y otro con el actual. Si algún parámetro del array dista
	entre ambos de más de 5 se debe se debe de dejar el actual con el valor original.
Enfermedades:
2- hasCovid (char[] array): boolean
	Esta función determina si la analítica de la persona tiene COVID o no.
	La persona tiene covid cuando en el array contiene: ['C', 'C', 'H', 'H', 'H', 'C', 'O']
3 - checkHistory(string[] pacientes, string nombre): boolean
	La función recibe una lista de pacientes y un nombre. Hay que verificar que esté en la lista.
 */



public class Sanidad {

  public static boolean checkReset (int[] actual, int[] original) {

    boolean reset = false;

    for (int i = 0; i < actual.length; i ++) {
      if (Math.abs(actual[i] - original[i]) > 5) {
        return reset = true;
      }
    }

    return reset;
  }


  public static boolean hasCovid(char[] array) {

    char[] arrayCov = {'C', 'C', 'H', 'H', 'H', 'C', 'O'};

    boolean respuesta = false;

    if (array.length >= arrayCov.length) {
      for (int i = 0; i <= (array.length - arrayCov.length); i++) {
        boolean coincidencia = true;
        for (int j = 0; j <= (arrayCov.length - 1); j++) {
          if (array[i+j] != arrayCov[j]) {
            coincidencia = false;
            break;
          }
        }
        if (coincidencia){
          respuesta = true;
        }

      }
    }

    return respuesta;
  }


  public static boolean checkHistory (String[] pacientes, String nombre) {

    boolean respuesta = false;

    for (int i = 0; i < pacientes.length; i++) {
      if (pacientes[i].equalsIgnoreCase(nombre)) {
        return true;
      }

    }


    return respuesta;
  }




}
