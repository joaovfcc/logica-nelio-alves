import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double temperaturaF;
        double temperaturaC;
        double conversorC;
        double conversorF;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Voce vai digitar a temperatura em qual escala (C/F)?");
        if (scanner.nextLine().equalsIgnoreCase("F")){
            System.out.println("Digite a temperatura em Fahrenheit:");
            temperaturaF = scanner.nextDouble();
            conversorC = (5.0/9.0) * (temperaturaF - 32);
            System.out.println("Temperatura equivalente em Celsius: " + conversorC);

        }else {
            System.out.println("Digite a temperatura em Celsius:");
            temperaturaC = scanner.nextDouble();
            conversorF = temperaturaC * (9.0 / 5.0) + 32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + conversorF);
        }




    }
}