package san.TESTSPI.Sensores.probando;

public class Main {

  public static void main(String[] args) {

    double [] sensoresProb1 = new double[]{23.5,18,14,2,9,70,22,55};

    double[] sensoresPorb2 = new double[]{10.5, 1, 1, 2, 9, 7.5, 10.2, 0.2};

    boolean result = isValidCar(sensoresProb1);

    boolean result2 = isValidCar(sensoresPorb2);

    System.out.println(result);
    System.out.println(result2);
    //main
  }
  public static boolean isValidCar(double[] sensoresProb1){

    double sumaProbabilidades = 0;
    double mediaProbabilidades = 0;

    for (int i = 0; i < sensoresProb1.length; i++) {
      sumaProbabilidades += sensoresProb1[i];
    }
    mediaProbabilidades = sumaProbabilidades / sensoresProb1.length;

    System.out.println(sumaProbabilidades);
    System.out.println(mediaProbabilidades);

    return mediaProbabilidades < 10;
  }




  //san.TESTSPI.Sensores
}
