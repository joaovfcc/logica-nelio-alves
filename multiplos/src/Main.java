import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numeroUm;
        int numeroDois;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite dois números inteiros:");
            numeroUm = scanner.nextInt();
            numeroDois = scanner.nextInt();

            if (numeroUm % numeroDois == 0){
                System.out.println("São multiplos");
            }else if (numeroDois % numeroUm == 0){
                System.out.println("São multiplos");
            }else {
                System.out.println("Não são multiplos");
            }
        }catch (InputMismatchException e){
            System.out.println("Digite um número inteiro, para seguir com o programa.6");
        }finally {
            scanner.close();
        }

    }
}