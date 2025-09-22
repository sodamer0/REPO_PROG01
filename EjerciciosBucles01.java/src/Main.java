import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    /*1. Contador simple (for): Ingresa un número N y muestra los números del 1 al N.*/
    Scanner teclado = new Scanner(System.in);
    /*System.out.println("Introduzca un número entero n como \"contador\": ");
    int n = teclado.nextInt();
    teclado.nextLine();
    for (int i=1; i<=n;i++){
      if(i==n){
        System.out.print(i + ".");
      }else{
        System.out.print(i + ", ");
      }
    }
    System.out.println();*/

    /*2. Cuenta regresiva (for): Ingresa un número N y muestra una cuenta atrás desde N hasta 1.*/

    /*System.out.println("Introduzca un número entero n1 para hacer una cuenta regresiva hasta 1: ");
    int n1 = teclado.nextInt();
    teclado.nextLine();
    for (int i=n1; i>=1; i--){
      if (i==1){
        System.out.print(i + ".");
      }else {
        System.out.print(i + ", ");
      }
    }
    System.out.println();*/

    /*3. Tabla de multiplicar (for): Ingresa un número y muestra su tabla de multiplicar del 1 al 10.*/

    /*System.out.println("Introduce un número entero n3 para calcular su tabla de multiplicar del 1 al 10: ");
    int n3 = teclado.nextInt();
    teclado.nextLine();
    for (int i=1; i<=10; i++){
      System.out.println(n3 + " x " + i + " = " + (i*n3));
    }
    System.out.println();*/


    /*4. Sumatoria (for): Ingresa un número n4 y calcula la suma de los números del 1 al n4.*/
    /*System.out.println("Introduce un numero entero n4 para calcular la suma de los números del 1 a n4: ");
    int n4 = teclado.nextInt();
    teclado.nextLine();
    int suma=0;
    for (int i=1; i<=n4; i++){
        suma += i;
    }
    System.out.print("La suma de los números del 1 al " + n4 + " es " + suma + ".");*/


    /*5. Números pares (while): Ingresa un número N y muestra los números pares desde 1 hasta N.*/
    /*System.out.println("Introduce un número n5 y se mostrarán los números pares desde el 1 hasta n5: ");
      int n5 = teclado.nextInt();
      teclado.nextLine();
      int i=0;
      while(i<=n5){
        if(i%2 == 0){
          System.out.print(i + " ");
        }
        i++;
    }
    System.out.println();*/

    /*6. Adivinar número (while): Ingresa un número secreto y deja que el usuario adivine hasta
    acertar.*/

    /*System.out.println("Introduce un número entero entre 1 y 20 para adivinar el número secreto: ");
    int numSecreto = 13;
    int n6 = 0;
    while(n6!=numSecreto) {
      n6 = teclado.nextInt();
      teclado.nextLine();
      if (n6 < 1 || n6 > 20) {
        System.out.println("Por favor, introduce un número entre 1 y 20.");
      }else if(n6 !=numSecreto){
        System.out.println("Has fallado! Prueba otra vez!");
      }
    }
    System.out.println("Enhorabuena! Has acertado, el número secreto es: " + numSecreto);*/


    /*7. Menú repetitivo (do-while): Muestra un menú simple con opciones hasta que el usuario elija
    salir.*/
    /*int opcion;
    do {
      System.out.println("Elija una opción del menú:");
      System.out.println("1. Crear archivo.");
      System.out.println("2. Modificar archivo.");
      System.out.println("3. Eliminar archivo.");
      System.out.println("4. Listar archivos.");
      System.out.println("5. Salir del menú.\n");

      opcion = teclado.nextInt();
      teclado.nextLine();

      switch(opcion){
        case 1:
          System.out.println("Vamos a crear un archivo.\n");
          break;
        case 2:
          System.out.println("Vamos a modificar un archivo.\n");
          break;
        case 3:
          System.out.println("Vamos a eliminar un archivo.\n");
          break;
        case 4:
          System.out.println("Vamos a listar todos los archivos.\n");
          break;
        case 5:
          System.out.println("Hasta pronto!\n");
          break;
      }

    }while(opcion!=5);*/


    /*8. Suma hasta cero (do-while): Ingresa números y súmalos hasta que se ingrese un cero.*/
    /*int numero;
    int suma=0;
    do {
      System.out.println("Introduzca un número: ");
      numero = teclado.nextInt();
      teclado.nextLine();
      suma += numero;

    }while(numero!=0);
    System.out.println("La suma total de los números es: " + suma);*/


    /*9. Validar contraseña (while): Pide una contraseña hasta que el usuario escriba la correcta.*/
    /*String contrasenha = "adelante";
    String password;
    do{
      System.out.println("Introduzca la contraseña: ");
      password = teclado.nextLine();
    }while(!contrasenha.equalsIgnoreCase(password));
    System.out.println("Acceso permitido.");*/


    /*10. Números impares (for): Ingresa un número n y muestra los impares desde 1 hasta n.*/
    System.out.println("Introduce un número entero n para calcular los impares entre el 1 y n: ");
    int n8 = teclado.nextInt();
    teclado.nextLine();
    System.out.print("Números impares desde 1 hasta " + n8 + ": [ ");
    for(int i=1; i<=n8; i++){
      if (i % 2 != 0){
        System.out.print(i + " ");
      }
    }
    System.out.print("]");
    System.out.println();
  }
}
