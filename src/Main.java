//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num = 5;
        String frase = "Te extraño cuando llega la noche!";
        boolean nomeacuerdo = true;
        long jrande = 12345678L;
        final float NOMECAMBIES = 584F;
        int num2= 23;
        int sum = num + num2;
        int resta = num - num2;
        int producto = num * num2;
        int divisionEntera = num / num2;
        int resto = num % num2;
        int num3 = num;
        if(num3 == num){
            System.out.println("Sonche iguais.");
        }else {
            System.out.println("Non che son nin parecidos.");
        }

        String diaSemana="Miércoles";

        switch (diaSemana){
            case "Lunes":
                System.out.println("Hoy es lunes.");
                break;
            case "Martes":
                System.out.println("Hoy es martes.");
                break;
            case "Miércoles":
                System.out.println("Hoy es miércoles.");
                break;
            case "Jueves":
                System.out.println("Hoy es jueves.");
                break;
        }

        for (int i=1; i<=10; i++){
            System.out.println("Sin tele y sin cerveza, Homer pierde la cabeza..." + i);
        }

        System.out.println(num);
        System.out.println(NOMECAMBIES);
    }
}