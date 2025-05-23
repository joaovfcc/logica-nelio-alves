import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        double salarioAtual;


        Scanner sc = new Scanner(System.in);

        NavigableMap<Double, Double> tabelaAumento = new TreeMap<>();

        tabelaAumento.put(0.00, 0.20);
        tabelaAumento.put(1000.01, 0.15);
        tabelaAumento.put(3000.01, 0.10);
        tabelaAumento.put(8000.01, 0.05);

        try {
            System.out.println("Digite o salário atual:");
            salarioAtual = sc.nextDouble();

            var entryAumento = tabelaAumento.floorEntry(salarioAtual);

            double percentualAumento;

            if (entryAumento != null ){
                percentualAumento = entryAumento.getValue();

                var aumentoSalario = salarioAtual * percentualAumento;
                var novoSalario = salarioAtual + aumentoSalario;

                System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
                System.out.printf("Aumento: R$ %.2f%n", aumentoSalario);
                System.out.printf("Porcentagem: %.0f%%%n", percentualAumento * 100);
            }else{
                System.out.println("Valor não encontrado.");
            }
        }catch (InputMismatchException e){
            System.out.println("Dados inválidos, tente novamente utilizando caracteres válidos!");
        }finally {
            sc.close();
        }

}
}