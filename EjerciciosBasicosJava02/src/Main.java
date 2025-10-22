//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    /*1. Saludo: Declara una variable con tu nombre y muestra en pantalla el mensaje 'Hola, [nombre]'*
     */
    String miNombre = "Salustiano";
    System.out.println("Hola, " + miNombre);

    /*2. Área de un rectángulo: Declara dos variables con la base y la altura de un rectángulo. Calcula y
    muestra su área.*/
    double base = 10.20;
    double altura = 5.6;
    double areaRectangulo = (base * altura);
    System.out.printf("El área de un rectángulo de [base = %.2f] y [altura = %.2f] es [%.2f]" , base, altura, areaRectangulo);

    }

}