package san.PROGI01.EjerBasicos03;

import java.util.Scanner;

public class Main {
  public static void main (String[] args){
    /*1. Mayoría de edad con nacionalidad: Declara una variable con la edad y otra booleana que
    indique si la persona es ciudadana del país. Muestra 'Puede votar' si es mayor de 18 y ciudadano,
    en caso contrario 'No puede votar'.*/

    int edad = 71;
    boolean ciudadania = true;

    if(edad >= 18 && ciudadania == true){
      System.out.println("\nPuede votar.");
    }else
      System.out.println("\nNo puede votar.");

    /*2. Aprobación con condiciones: Declara una variable con la nota y otra booleana que indique si
    asistió a clases. Muestra 'Aprobado' solo si la nota es mayor o igual a 60 y asistió a clases.*/

    double nota = 68.55;
    boolean asistencia = false;
    if (nota>=60){
      if (asistencia){
        System.out.println("\nAPROBADO.\n");
      }else
        System.out.println("\nREPROBADO.\n");
    }else
      System.out.println("\nNO HA APROBADO.\n");

    /*3. Rango válido: Declara una variable entera. Verifica si está entre 50 y 100 inclusive. Muestra
    'Dentro del rango' o 'Fuera del rango'.*/
    int numerin = 101;
    if(numerin >=50){
      if (numerin <=100){
        System.out.println("Dentro del rango.");
      }else
        System.out.println("Fuera del rango.");
    }else
      System.out.println("Fuera del rango.");
    if (numerin < 50) {
      System.out.println("Fuera del rango.\n");
    } else if (numerin > 100) {
      System.out.println("Fuera del rango.\n");
    } else {
      System.out.println("Dentro del rango.\n");
    }

    /*4. Usuario y contraseña: Declara dos variables String, una para usuario y otra para contraseña. Si
    usuario es 'admin' y contraseña es '1234', muestra 'Acceso permitido', en caso contrario 'Acceso
    denegado'.*/
    String usuario = "admin";
    String contrasenha = "1234";
    if(usuario != "admin"){
      System.out.println("Acceso denegado.\n");
    }else if (contrasenha != "1234"){
      System.out.println("Acceso denegado.\n");
    }else{
      System.out.println("Acceso permitido.\n");
    }

    /*5. Compra con descuento adicional: Declara una variable con el precio y otra booleana que indique
    si tiene tarjeta de cliente. Si el precio es mayor a 200 aplica un 15% de descuento, si además tiene
    tarjeta aplica un 5% extra.*/
    double precio05 = 125.80;
    double precio05Final = precio05; //Por defecto.
    boolean tarjetaSocio = false;
    if (precio05 > 200){
      precio05Final = precio05 * 0.85;
    }if (tarjetaSocio){
      precio05Final *= 0.95;
    }

    System.out.printf("\nEl precio final es de %.2f€\n", precio05Final);

    /*6. Semáforo: Ingresa un color ('rojo', 'amarillo', 'verde'). Muestra: 'Detente', 'Precaución' o
    'Avanza'.*/

    String color = "amarillo";
    if (color.equalsIgnoreCase("rojo")){
      System.out.println("DETENTE");
    }else if(color.equalsIgnoreCase("amarillo")){
      System.out.println("PRECAUCIÓN");
    }else if(color.equalsIgnoreCase("verde")){
      System.out.println("AVANZA");
    }else{
      System.out.println("Error: introduce un color válido.");
    }

    //OTRA OPCIÓN:

    String color02 = "AmArIlLo";
    color02 = color02.trim().toLowerCase(); // normalizas la entrada

    if (color02.equals("rojo")) {
      System.out.println("DETENTE");
    } else if (color02.equals("amarillo")) {
      System.out.println("PRECAUCIÓN");
    } else if (color02.equals("verde")) {
      System.out.println("AVANZA");
    } else {
      System.out.println("Error: introduce un color válido.");
    }


    /*7. Juego de adivinanza: Ingresa un número secreto y luego una suposición. Indica si acertó, si
    el número secreto es mayor o menor.*/
    int numeroSecreto = 12345;
    int suposicion = 12345;
    if(suposicion == numeroSecreto){
      System.out.println("\nACERTASTE!\n");
    }else if (suposicion < numeroSecreto){
      System.out.println("\nEl número secreto es MENOR.\n");
    }else{
      System.out.println("\nEl número secreto es MAYOR.\n");
    }


    /*8. Comparador de palabras: Ingresa dos palabras. Si son iguales, muestra 'Coinciden'. Si no,
    'No coinciden'.*/
    Scanner teclado = new Scanner(System.in);
    String palabra1 = "estetoscopio";
    String palabra2 = "estetoscopiO";
    if(palabra1.equalsIgnoreCase(palabra2)){
      System.out.println("COINCIDEN!!");
    }else{
      System.out.println("NO COINCIDEN...X(");
    }
    /*9. Sistema de votación: Ingresa 3 votos (String: 'A', 'B' o 'C'). Muestra quién ganó o si hay
    empate.*/


    /*10. Calculadora básica: Ingresa dos números y una operación (+, -, *, /). Muestra el resultado
    según la operación.*/
    System.out.println("Introduce un número entero cualquiera: ");
    int numero1 = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Introduce otro número entero cualquiera: ");
    int numero2 = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Elige la operación: ");
    System.out.println("1. SUMA->\n" + "2. RESTA->\n" + "3. PRODUCTO->\n" + "4. DIVISIÓN\n");
    int opcion = teclado.nextInt();
    teclado.nextLine();
    switch(opcion){
      case 1:
        int suma = numero1 + numero2;
        System.out.println("La suma de (" + numero1 + " + " + numero2 + ") da como resultado " + suma);
        break;
      case 2:
        int resta = numero1 - numero2;
        System.out.println("La resta de (" + numero1 + " - " + numero2 + ") da como resultado " + resta);
        break;
      case 3:
        int producto = numero1 * numero2;
        System.out.println("El producto de (" + numero1 + " x " + numero2 + ") da como resultado " + producto);
        break;
      case 4:
        int division = numero1 / numero2;
        System.out.println("La división de (" + numero1 + " / " + numero2 + ") da como resultado " + division);
        break;
    }


  }
}
