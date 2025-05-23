import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de X:");
        x = scanner.nextDouble();
        System.out.print("Valor de Y:");
        y = scanner.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0)  {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Q4");
        }
        else if (x > 0 && y == 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0 && y > 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Origem");
        }
    }
}