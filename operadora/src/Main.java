import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double valorPlanoBasico = 50.00;
         int minutosPlanoBasico = 100;
         double valorMinutoExcedente = 2.00;
         int tempoExcedente;
         int tempoUtilizado;
         double valorPagar;

         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos utilizada no mês: ");
        tempoUtilizado = scanner.nextInt();

        if (tempoUtilizado <= minutosPlanoBasico){
            System.out.println("Valor a pagar: R$" + valorPlanoBasico);
        } else  {
            tempoExcedente = tempoUtilizado - minutosPlanoBasico;
            valorPagar = (tempoExcedente * valorMinutoExcedente) + valorPlanoBasico;
            System.out.println("Valor a pagar: R$" + valorPagar);

        }
    }


    }
