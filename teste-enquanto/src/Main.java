import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var soma = 0;
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        x = scanner.nextInt();

        while (x != 0){
            System.out.println("Digite outro número:");
            soma += x;
            x = scanner.nextInt();
            }
        System.out.println("SOMA = " + soma);
    }
}