import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int quantidadeComprada;
        int codigoProduto;
        double valorTotal;

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Double> produtos = new HashMap<>();

        produtos.put(1, 5.00);
        produtos.put(2, 3.50);
        produtos.put(3, 4.80);
        produtos.put(4, 8.90);
        produtos.put(5, 7.32);

        try {
            System.out.print("Digite o codigo do produto:");
            codigoProduto = scanner.nextInt();

            System.out.print("Digite a quantidade comprada:");
            quantidadeComprada = scanner.nextInt();

            Double precoUnitario = produtos.get(codigoProduto);

            if (precoUnitario != null){
                valorTotal = precoUnitario * quantidadeComprada;
                System.out.printf("Valor a pagar: R$%.2f%n", valorTotal);
            }else {
                System.out.println("Erro: Codigo invalido! Por favor, insira um código entre 1 e 5.");

        }
        }catch (InputMismatchException e){
            System.out.println("Entrada do usuário inválida. Por favor, digite um número inteiro para o código e a quantidade.");
        }finally {
            scanner.close();
        }

    }
}