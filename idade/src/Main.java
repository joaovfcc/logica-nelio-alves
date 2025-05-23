import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double idade;
        double media;
        double somaIdade = 0;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite as idades:");
            idade = scanner.nextDouble();

            while (idade >= 0){
                somaIdade += idade;
                idade = scanner.nextDouble();
                contador += 1;
            }
            media = somaIdade / contador;

            if (contador == 0){
                System.out.println("IMPOSSIVEL CALCULAR");
            }else {
                System.out.printf("MEDIA = %.2f%n", media);
            }
        }catch (InputMismatchException e){
            System.out.println("Digite apenas números.");
        }finally {
            scanner.close();
        }
    }
}