import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double coeficienteA;
        double coeficienteB;
        double coefiecienteC;
        double delta;
        double x1;
        double x2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Coeficiente A: ");
        coeficienteA = scanner.nextDouble();

        System.out.println("Coeficiente B: ");
        coeficienteB = scanner.nextDouble();

        System.out.println("Coeficiente C: ");
        coefiecienteC = scanner.nextDouble();

        delta = (Math.pow(coeficienteB, 2)) - 4 * coeficienteA * coefiecienteC;


        if (delta < 0){
            System.out.println("Esta equacao nao possui raizes reais");
        }else {
        x1 = (-coeficienteB + Math.sqrt(delta)) / (2 * coeficienteA);
        x2 = (-coeficienteB - Math.sqrt(delta)) / (2 * coeficienteA);
        System.out.println("X1 = " + x1);
        System.out.println("X2 = " + x2);

        }
    }
}
