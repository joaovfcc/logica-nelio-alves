import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int primeiroNumero;
        int segundoNumero;
        int terceiroNumero;
        int menor;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        segundoNumero = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        terceiroNumero = scanner.nextInt();

        if(primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero){
            menor = primeiroNumero;
            System.out.println("MENOR = " + menor);
        } else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            menor = segundoNumero;
            System.out.println("MENOR = " + menor);
        } else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
            menor = terceiroNumero;
            System.out.println("MENOR = " + menor);
        } else if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
            menor = primeiroNumero;
            System.out.println("MENOR = " + menor);

        }

    }
}