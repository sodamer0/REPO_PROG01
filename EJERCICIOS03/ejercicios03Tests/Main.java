package ejercicios03Tests;

import java.util.Scanner;

public class Main {

  private static Scanner teclado = new Scanner(System.in);

  public static void main(String[] args) {

    /*
    Crear las siguientes funciones en el ejercicios03Tests.Main.
    Recuerda que al estar dentro de la clase main, las funciones deben de ser estáticas.
    El departamento de RRHH de nuestra empresa nos ha pedido que le desarrollemos unas utilidades para simplificarles
    su trabajo.
    */
    /*
    [1]. Crea una función que sea getSalaryMean(double[] salaries) que devuelva el salario medio de la empresa.

    [2]. Crea una función que sea getSalaryMedian(double[] salaries) que devuelva la mediana de la empresa.

    Recuerda que la mediana es el valor del centro de un conjunto de datos. Esto quiere decir que si la longitud del
    array es Impar (por ejemplo 7) el valor que se pide es el de la posición 4, ya que tiene 3 valores antes (1,2,3) y
    3 valores después (5,6,7). Pero si la longitud del array es par (por ejemplo 8),  para conseguir la mediana tenemos
    que sumar el valor (mitad + mitad+1) /2 o lo que es decir (valor de la posición 4 + valor de la posición 5 y
    toda esto partido entre 2).

    [3]. Crea una función getPayroll(double salary, int children, double percentage, boolean disability) que devuelva el importe
    a pagar a un empleado en base a todos los atributos. El porcentaje será la aportación a la seguridad social, con lo cual
    se descontará del salario total. Además, por cada hijo, se le descontará un 1% del porcentaje enviado como parámetro,
    pero a partir del tercer hijo (este inclusive), será de un 3%. Por último, si el empleado tiene alguna discapacidad,
    se le abonará 500€ a mayores.

    [4]: RRHH nos pide que les creemos una función para realizarles la Matriz transpuesta de los salarios de algunos empleados.
    No sabemos porqué, pero sus razones tendrán! --> transposeMatrix(double[][] matrix).

	Ejemplos:

	1	3	9				  1	2	5
A	2	2	6			A 	3	9	8
	5	6	1


	  1	2	5				  1	3
AT	3	2	6			AT	2	9
	  9	6	1				  5	8
     */



   //main
  }

  public static void setUp() {

  }


  public static double getSalaryMean(double [] salaries) {

    double salariesSum = 0;
    double salaryMean = 0;


    for (int i=0; i<salaries.length; i++) {

      salariesSum += salaries[i];
    }

    salaryMean = salariesSum / salaries.length;

    return salaryMean;
  }

  public static double getSalaryMedian(double [] salaries) {

    double salaryMedian = 0;
    int n = salaries.length;

    if ( n % 2 != 0 ) {
      salaryMedian = salaries[n / 2];
    } else {
      salaryMedian = ( salaries[n / 2 - 1] + salaries[n / 2] )/ 2;
    }

    return salaryMedian;
  }




  public static double getPayroll(double salary, int children, double percentage, boolean disability) {

    double finalSalary = 0;

    double disabilityHelp = 0;

    if (children > 0 && children <= 2 ) {
      percentage = percentage - (double) (children);
    } else if (children >= 3) {
      percentage = percentage - (double) 3;
    }

      if (disability) {
        disabilityHelp = 500;
      } else {
        disabilityHelp = 0;
      }

      finalSalary = salary - (salary * percentage/100) + disabilityHelp;

      return finalSalary;
  }

    public static double[][] transposeMatrix ( double[][] matrix){

      double[][] matrizT = new double[3][3];

      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {

          matrizT[i][j] = matrix[j][i];
        }
      }
      return matrizT;
    }


  //ejercicios03Tests.Main
}
