import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite dois números:");
            x = scanner.nextInt();
            y = scanner.nextInt();


            while (x != y) {
                if (x < y) {
                    System.out.println("CRESCENTE");
                } else {
                    System.out.println("DECRESCENTE");
                }

                System.out.println("Digite outros dois números");
                x = scanner.nextInt();
                y = scanner.nextInt();


            }
            System.out.println(x + y);
        }
        catch (InputMismatchException e) {
            System.out.println("Digite um número inteiro.");
        }
    }
}