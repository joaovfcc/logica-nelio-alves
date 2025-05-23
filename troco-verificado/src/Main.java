import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double precoProduto;
        int quantidade;
        double dinheiroRecebido;
        double troco;
        double precoTotal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Preço unitário do produto: ");
        precoProduto = scanner.nextDouble();

        System.out.println("Quantidade comprada: ");
        quantidade = scanner.nextInt();

        System.out.println("Dinheiro recebido:");
        dinheiroRecebido = scanner.nextDouble();

       precoTotal = quantidade * precoProduto;

       if (dinheiroRecebido < precoTotal){
           System.out.println("DINHEIRO INSUFICIENTE. FALTAM: R$ " + (precoTotal - dinheiroRecebido));
       }else {
           troco = dinheiroRecebido - precoTotal;
           System.out.println("TROCO = " + troco);
       }

        }
    }
