package san.JetEx;

public class imprimirParImpar {

  static void parImparString () {

    int contador = 1;
    int maxContador = 10;
    String salida = "";
    while (contador <= maxContador) {
      salida += ((contador % 2 == 0) ? "par" : "impar" ) + ",";
      contador++;
    }
    System.out.println(salida);

  }


  static void parImparSecuencia1 () {

        int sumaPares = 0, sumaImpares = 0;
        int i = 0;
        String listaPares = "";
        String listaImpares = "";

        while (i / 2 != 5) {
          i++;
          if (i % 2 == 0) {
            sumaPares += i;
            listaPares += String.valueOf(i) + " ";

          }
          if (i % 2 == 1) {
            sumaImpares += i;
            listaImpares += String.valueOf(i) + " ";
          }
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.println(listaPares);
        System.out.println("La suma de los números impares es: " + sumaImpares);
        System.out.println(listaImpares);


  }

  static void parImparSecuencia2 () {

    int sumaPares = 0, sumaImpares = 0;
    StringBuilder listaPares = new StringBuilder();
    StringBuilder listaImpares = new StringBuilder();

    // Procesar números del 1 al 10 (ajusta el límite si necesitas otro rango)
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        sumaPares += i;
        listaPares.append(i).append(" ");
      } else {
        sumaImpares += i;
        listaImpares.append(i).append(" ");
      }
    }

    System.out.println("La suma de los números pares es: " + sumaPares);
    System.out.println(listaPares.toString().trim()); // trim() quita el último espacio

    System.out.println("La suma de los números impares es: " + sumaImpares);
    System.out.println(listaImpares.toString().trim());


  }




}
