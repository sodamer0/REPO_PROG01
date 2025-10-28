package san.PROGI01.EjerFunciones01;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    /*Ejercicios de Programación: Creación y Uso de Funciones: Temática: Robótica y Sensores.

    /*1. Crea una función que muestre por pantalla 'Robot inicializado'. Llama a la función desde el main.*/

    /*iniciarRobot();
    System.out.println();
    /* 2. Crea una función que imprima el mensaje 'Sensores calibrados correctamente'. Llama a la función.*/

    /*calibrarSensores();
    System.out.println();*/

    /* 3.Crea una función que muestre un mensaje con tu nombre como si fueras el programador del robot.*/
    //System.out.println("Introduce el nombre del creador: ");
    //String miNombre = teclado.nextLine();
    //mensajeCreador((miNombre));
    //System.out.println();

    /*4. Crea una función que reciba el nombre de un robot como parámetro y muestre un mensaje de bienvenida.*/
    //System.out.println("Introduce el nombre de tu robot: ");
    //String nombreRobot = teclado.nextLine();
    //nombreRobot(nombreRobot);

    /*5. Crea una función que reciba dos números y devuelva la suma como si fueran datos de sensores.*/
    //System.out.println("Temperatura detectada por el sensor interno: ");
    //double temperaturaSensor = teclado.nextDouble();
    //teclado.nextLine();
    //System.out.println("Presión detectada por el sensor del reactor:");
    //double presionSensor = teclado.nextDouble();
    //teclado.nextLine();
    //datosSensores(temperaturaSensor,presionSensor);

    /*6. Crea una función que reciba la velocidad de un motor y muestre si es segura (<100) o peligrosa (>=100).*/
    //System.out.println("Introduzca la velocidad del motor: ");
    //double velocidadMotor = teclado.nextDouble();
    //teclado.nextLine();
    //secureSpeed(velocidadMotor);

    /*7. Crea una función que reciba un número n y en un bucle muestre 'Movimiento ejecutado' n veces.*/
    //System.out.println("Cuántas veces ejecutamos la función?:");
    //int n = teclado.nextInt();
    //teclado.nextLine();
    //ejecutaMov(n);

    /*8. Crea una función que reciba una temperatura y muestre si el robot debe enfriarse (>40 grados) o
    seguir funcionando.*/
    /*System.out.println("Introduzca la temperatura del robot: ");
    double temp = teclado.nextDouble();
    teclado.nextLine();
    tempControl(temp);*/

    /*9. Crea una función que reciba tres lecturas de un sensor de distancia y devuelva la más pequeña
        (mínima).*/
    /*System.out.println("Introduzca las 3 distancias medidas por el sensor: ");
    double d1 = teclado.nextDouble();
    teclado.nextLine();
    double d2 = teclado.nextDouble();
    teclado.nextLine();
    double d3 = teclado.nextDouble();
    teclado.nextLine();
    System.out.printf("Distancia mínima= %.2f[mm]",datosDist(d1,d2,d3));
    System.out.println();
    System.out.printf("Distancia mínima= %.2f[mm]",datosDist2(d1,d2,d3));*/


    /*10. Crea una función que reciba un número n y, usando un bucle, simule que el robot da n pasos,
    mostrando cada paso.*/
    /*System.out.println("Introduzca cuántos pasos va a ejecutar el robot: ");
    int movimientos = teclado.nextInt();
    teclado.nextLine();
    pasitos(movimientos);*/





    System.out.print("Introduce un número decimal: ");
    double numero = teclado.nextDouble();
    System.out.println("Número leído: " + numero);
    teclado.close();



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

  public static void ejecutaMov(int num){
    for(int i=1;i<=num;i++){
      System.out.println("Movimiento Ejecutado");
    }
  }

  public static void tempControl(double temperatura){
    if(temperatura>40){
      System.out.println("Enfriar el robot.");
    }else
      System.out.println("Temperatura segura. Puede seguir funcionando");
  }

  public static double datosDist(double dist1, double dist2, double dist3){
    if(dist1<dist2){
      if(dist2<dist3){
        //System.out.println(dist1 + "<" + dist2 + "<" + dist3);
        return (dist1);
      }else{
        if(dist1<dist3){
          //System.out.println(dist1 + "<" + dist3 + "<" + dist2);
          return (dist1);
        }else{
          //System.out.println(dist3 + "<" + dist1 + "<" + dist2);
          return (dist3);
        }
      }
    }else{
      if(dist3<dist2){
        //System.out.println(dist3 + "<" + dist2 + "<" + dist1);
        return (dist3);
      }else{
        if(dist1<dist3){
          //System.out.println(dist2 + "<" + dist1 + "<" + dist3);
          return (dist2);
        }else{
          //System.out.println(dist2 + "<" + dist3 + "<" + dist1);
          return (dist2);
        }
      }
    }
  }

  public static double datosDist2(double dist1, double dist2, double dist3){
    return Math.min(Math.min(dist1, dist2), dist3);
  }

  public static void pasitos(int pasos){
    for(int i=1; i<=pasos;i++){
      if(i==1){
        System.out.println("Empezamos con un pasito...(" + i + " Paso).");
      }else if(i<pasos){
        System.out.println("Y otro más...(" + i + " Paso).");
      }else{
        System.out.println("Y nos paramos. Has avanzado (" + i + " Pasos en total).");
      }
    }
  }



}
