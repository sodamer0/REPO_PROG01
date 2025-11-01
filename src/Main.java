import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  private static Scanner teclado = new Scanner(System.in);

  /*
  Trabajamos para una empresa de sensores que se dedica generalmente a la domótica y a sensores industriales.
Necesitamos programar para unos nuevos tipos de sensores ciertas funcionalidades:


1. getDistance(double speed, double time) : return double
	Para los sensores infrarojos debemos devolver a qué distancia está el objeto con la famosa fórmula de distancia =
	 velocidad * tiempo.
	Pero ojo, un rayo choca contra un objeto en X tiempo, pero ese rayo tiene que reflejarse de vuelta al sensor para
	 saber que ha golpeado un objeto.
	 Deduce la fórmula.

2. isValidCar(double[] sensorProbability) : return boolean
	Un coche pasa por muchos sensores antes de darse como un coche válido. Esta función es la que valida si un coche está
	 bien fabricado o no.
	Para ello, se nos pasa como parámetro un array de todas las probabilidades de los sensores que ha pasado. Cuanta más probabilidad,
	 más ha detectado el sensor que algo ha podido ir mal. Si la media de los sensores es inferior a 10% se da como un coche bien
	  fábricado.

3. checkObjectWithPatternBlackAndWhite(boolean[][] pattern, boolean[][] object): return double
	Esta función se le envía como parámetro un objeto bien creado (pattern) y el objecto que está visualizando el sensor en esos
	 momentos.
	Al ser una imagen, esta función necesita devolver qué probabilidad tiene el objeto de estar bien creado con respecto a su patrón.
	¿Cómo hacerlo? Necesitamos saber cuantos pixeles tienen las imagenes (ambas tendrán el mismo tamaño) y cuántos píxeles son
	 distintos entre ellos.
	 Devolver el porcentaje de píxeles distintos.

4. checkObjectWithPatternColour(int[][] pattern, int[][] object): return double
	Esta función es exactamente igual que la anterior pero necesitamos que sea a color. Para ello, en vez de true o false, ahora
	 los píxeles van de 0 a 255.
	Determinamos que un pixel es distinto a otro si la diferencia es mayor que 10.

   */
  public static void main(String[] args) {

    //main
  }

  public static double getDistance(double speed, double time) {
    double distance = 0;

    distance = (speed * time) / 2;


    return distance;
  }


  public static boolean isValidCar(double[] sensoresProb1){

    double sumaProbabilidades = 0;
    double mediaProbabilidades = 0;

    for (int i = 0; i < sensoresProb1.length; i++) {
      sumaProbabilidades += sensoresProb1[i];
    }
    mediaProbabilidades = sumaProbabilidades / sensoresProb1.length;

    return mediaProbabilidades < 10;
  }

  public static double checkObjectWithPatternBlackAndWhite(boolean[][] patternBlack, boolean[][] objectBlack) {

    double countDiffPixel = 0;

    int matrixElements = patternBlack.length * patternBlack[0].length;
    double differentsPercentage = 0;
    for(int i = 0; i < patternBlack.length; i++) {
      for (int j = 0; j <patternBlack[0].length; j++) {
        if (patternBlack[i][j] != objectBlack[i][j]) { //Me piden porcentaje de los píxeles que son DIFERENTES.
          countDiffPixel++;
        }
      }
    }
    differentsPercentage = (countDiffPixel / matrixElements) * 100;

    return differentsPercentage;
  }

  public static double checkObjectWithPatternColour(int[][] patternColour, int[][] objectColour) {
    double countDiffPixel = 0;
    double differentColorPercen = 0;
    int matrixElements = patternColour.length * patternColour[0].length;

    for (int i = 0; i < patternColour.length; i++) {
      for(int j = 0; j < patternColour[0].length; j++) {
       // if (Math.abs(patternColour[i][j] - objectColour[i][j]) > 10) {
        if ((patternColour[i][j] - objectColour[i][j] > 10) || (objectColour[i][j] - patternColour[i][j] > 10)) {
          countDiffPixel++;
        }
      }
    }

    differentColorPercen = (countDiffPixel / matrixElements) * 100;


    return differentColorPercen;
  }



//Main
}
