import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double primeiroSemestre;
        double segundoSemestre;
        double notaFinal;

        System.out.println("Digite a primeira nota: ");
        primeiroSemestre = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        segundoSemestre = scanner.nextDouble();

        notaFinal = primeiroSemestre + segundoSemestre;

        if (notaFinal < 60){
            System.out.println("NOTA FINAL = " + notaFinal + "\nREPROVADO");

        }else {
            System.out.println("NOTA FINAL = " + notaFinal);
        }

        }
    }
