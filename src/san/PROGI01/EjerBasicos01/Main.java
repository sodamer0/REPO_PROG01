package san.PROGI01.EjerBasicos01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Ejercicios Básicos de Java
        //1. Datos personales: Declara variables para almacenar el nombre y la edad de una persona.
        //Muestra un mensaje en pantalla con esos datos concatenados en una sola frase.*/
        String miNombre = "Santiago";
        int edad = 47;

        System.out.println("Me llamo " + miNombre + " y tengo " + edad + "años.\n");

        /*2. Constante matemática: Declara una constante con el valor de π y una variable con el radio de
        un círculo. Calcula y muestra el área del círculo*/
        double π = 3.1416;
        double r = 12.45;
        double areaCirculo = π * (r * r);

        System.out.printf("\nEl área de un círculo de radio " + r + " es %.2f\n" , areaCirculo);

        /*3. Número positivo: Declara una variable entera con cualquier valor. Usa una estructura
        condicional para comprobar si el número es positivo y muestra un mensaje en caso afirmativo.*/
        int num1 = 12;
        if (num1 > 0){
            System.out.println("El número " + num1 + " es un número positivo.");
        }

        /*4. Número positivo o negativo: Declara una variable entera. Mediante un condicional if-else,
        muestra si el número es positivo o negativo.*/
        int num2 = 0;
        if (num2 > 0){
            System.out.println("El entero " + num2 + " es un número positivo.");
            }else if (num2 < 0){
            System.out.println("El entero " + num2 + " es un número negativo.");
            }else{
            System.out.println("Ese es el cero.");
            }
        /*5. Clasificación de notas: Declara una variable con una calificación numérica. Evalúa con if-else-if
        si la nota corresponde a Sobresaliente (≥90), Aprobado (≥70 y <90) o Reprobado (<70).*/
        int nota = 87;
        if (nota >= 90){
            System.out.println("Tienes un sobresaliente.");
        }else if ( nota >= 70 && nota < 90){
            System.out.println("Tienes un Aprobado");
        }else if ( nota <70){
            System.out.println("Tienes un Reprobado.");
        }
        /*6. Comparación de números: Declara dos variables enteras. Usa un condicional para determinar
        cuál de los dos números es mayor y muestra el resultado.*/
        int num4 = 34;
        int num5 = 12;
        if (num4 > num5){
                System.out.println("El entero " + num4 + " es mayor que el entero " + num5);
            }else if (num4 < num5){
                System.out.println("El entero " + num5 + " es mayor que el entero " + num4);
            }else if (num4 == num5){
                System.out.println("Ambos enteros, " + num5 + " y " + num4 + " son iguales.");
        }
        /*7. Número par o impar: Declara una variable entera. Verifica si el número es par o impar y muestra
        el mensaje correspondiente.*/
        int num6 = 56;
        if (num6 % 2 == 0){
                System.out.println("El entero " + num6 + " es par.");
            }else
                System.out.println("El entero " + num6 + " es impar.");
        /*8. Mayoría de edad: Declara una variable para la edad de una persona. Mediante un condicional,
        muestra si la persona es mayor o menor de edad (considerando 18 años como límite).*/
        int edad1 = 0;
        if (edad1 < 18 && edad1 != 0){
                System.out.println("Eres menor de edad.");
            }else if(edad1 >= 18){
                System.out.println("Eres mayor de edad.");
            }else if(edad1 == 0){
                System.out.println("No has nacido.");
            }else
                System.out.println("Introduce una edad válida.");
        /*9. Días de la semana: Declara una variable entera que represente un día de la semana (1 = lunes,
        2 = martes, 3 = miércoles, etc.). Utiliza un switch para mostrar el nombre del día correspondiente.*/
        int diaSemana = 3;
        switch(diaSemana){
            case 1:
                System.out.println("Hoy es lunes.");
                break;
            case 2:
                System.out.println("Hoy es martes.");
                break;
            case 3:
                System.out.println("Hoy es miércoles.");
                break;
            case 4:
                System.out.println("Hoy es jueves.");
                break;
            case 5:
                System.out.println("Hoy es viernes.");
                break;
            case 6:
                System.out.println("Hoy es sábado.");
            case 7:
                System.out.println("Hoy es domingo.");
        }
    /*10. Aplicar descuento: Declara una variable con el precio de un producto y una variable booleana
    que indique si tiene descuento. Si la variable booleana es verdadera, aplica un 10% de descuento
    y muestra el precio final.*/
        String producto = "Portátil i7";
        double precio = 549;
        boolean descuento = true;
        if (descuento == true){
            double precioFinal = precio - (precio * 0.1);
            System.out.printf("\nEl precio final del producto " + producto + " es de %.2f", precioFinal);
        }else
            System.out.printf("\nEl precio final del producto " + producto + " es de %.2f", precio);

    }
}