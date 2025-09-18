import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    /*Ejercicios de Programación: Creación y Uso de Funciones: Temática: Robótica y Sensores.

    /*1. Crea una función que muestre por pantalla 'Robot inicializado'. Llama a la función desde el main.*/

    iniciarRobot();
    System.out.println();
    /* 2. Crea una función que imprima el mensaje 'Sensores calibrados correctamente'. Llama a la función.*/

    calibrarSensores();
    System.out.println();

    /* 3.Crea una función que muestre un mensaje con tu nombre como si fueras el programador del robot.*/
    System.out.println("Introduce el nombre del creador: ");
    String miNombre = teclado.nextLine();
    mensajeCreador((miNombre));
    System.out.println();

    /*4. Crea una función que reciba el nombre de un robot como parámetro y muestre un mensaje de bienvenida.*/
    System.out.println("Introduce el nombre de tu robot: ");
    String nombreRobot = teclado.nextLine();
    nombreRobot(nombreRobot);

    /*5. Crea una función que reciba dos números y devuelva la suma como si fueran datos de sensores.*/
    System.out.println("Temperatura detectada por el sensor interno: ");
    double temperaturaSensor = teclado.nextDouble();
    teclado.nextLine();
    System.out.println("Presión detectada por el sensor del reactor:");
    double presionSensor = teclado.nextDouble();
    teclado.nextLine();
    datosSensores(temperaturaSensor,presionSensor);

    /*6. Crea una función que reciba la velocidad de un motor y muestre si es segura (<100) o peligrosa (>=100).*/
    double velocidadMotor = teclado.nextDouble();
    teclado.nextLine();
    secureSpeed(velocidadMotor);

    /*7. Crea una función que reciba un número N y en un bucle muestre 'Movimiento ejecutado' N
    veces.
    8. Crea una función que reciba una temperatura y muestre si el robot debe enfriarse (>40 grados) o
    seguir funcionando.
    9. Crea una función que reciba tres lecturas de un sensor de distancia y devuelva la más pequeña
        (mínima).
    10. Crea una función que reciba un número N y, usando un bucle, simule que el robot da N pasos,
    mostrando cada paso.*/

  }

  public static void iniciarRobot(){
    System.out.println("Robot inicializado.");
  }

  public static void calibrarSensores(){
    System.out.println("Sensores calibrados correctamente.");
  }

  public static void mensajeCreador(String nombre){
    System.out.println("Robot programado por: " + nombre);
  }

  public static void nombreRobot(String nombre){
    System.out.println("Saludos " + nombre + ". Bienvenido.");
  }

  public static void datosSensores(double temperatura, double presion){
    System.out.printf("\nTemperatura interna: %.2f\u00B0C\n", temperatura);
    System.out.printf("\nPresión en el reactor: %.2fPa\n", presion);
  }

  public static void secureSpeed(double velocidad){
    if(velocidad>=100){
      System.out.printf("Velocidad excesiva. %.2fRPM.", velocidad);
    }else
      System.out.printf("Velocidad segura. %.2fRPM.", velocidad);
  }

}
