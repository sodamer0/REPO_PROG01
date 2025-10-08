import java.util.Scanner;

public class Main {
  private static Scanner teclado = new Scanner(System.in);
  public static void main(String[] args) {

    /*
    1. Se pedirán 2 números por teclado. Se pedirá que se imprima por pantalla todos aquellos números que
     estén entre ambos. Esto se repetirá indefinidamente hasta que los 2 números sean iguales y
     que en ese caso el programa finalizará.
    */
    System.out.println("Introduzca un número ->");
    int numero1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número ->");
    int numero2 = teclado.nextInt();
    ejercicio01(numero1,numero2);
  }

    /*
2. Modifica el programa anterior para que solo se impriman por pantalla los
números impares.
a. Modifica el programa en Java.
3. Modifica el programa anterior haciendo que al finalizar el programa imprima
por pantalla la cantidad de números pares que se han impreso por pantalla
durante el tiempo que duró el programa hasta que se han escrito 2 números
iguales.
a. Vuelve a realizar el pseudocódigo y modifica el programa en Java.
4. Crea una aplicación que dados 5 números por teclado los vaya sumando hasta
que el valor sea mayor que 3000. Cuando finalice se quiere saber cuántas
iteraciones tuvo que hacer.
5. Una empresa necesita una aplicación para validar DNI. El programa deberá de
pedir DNIs en la clase main hasta que escribamos un 0 para salir. Debemos
hacer otra clase que se llame ValidadorDni que llamando a una función de su
clase “validar()” nos devuelva un Boolean. Los DNI cumplan el patrón descrito
por la administración
a. Longitud de 9 caracteres.
b. Los caracteres de 1 al 8 deben de ser números, el noveno será letra.
c. No son válidos los siguientes DNI: 00000000T, 00000001R, 99999999R.
d. La letra se calcula dividiendo los 8 dígitos entre 23. El resultado del resto
de esa división determina la letra según la siguiente tabla.*/


  public static void ejercicio01(int num1, int num2){

    do{

      if(num1==num2){
        System.out.println(num1 + ", " + num2);
        break;
      }else if (num1<num2){
        for (int i = num1; i <= num2; i++) {
          if (i == num2) {
            System.out.print(i + ".");
          } else
            System.out.print(i + ", ");
          }
      }else if (num2<num1){
        for (int i = num2; i<=num1;i++){
          if (i == num1) {
            System.out.print(i + ".");
          }else
            System.out.print(i + ", ");
        }
      }

    }while(num1==num2);
  }







}
