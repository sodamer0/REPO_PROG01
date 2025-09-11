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


  }
}
