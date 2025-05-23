import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int horaInicial;
        int horaFinal;
        int tempoDeJogo;
        int dia = 24;

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Hora inicial:");
            horaInicial = scanner.nextInt();

            System.out.println("Hora final:");
            horaFinal = scanner.nextInt();

            if (horaInicial < horaFinal){
                tempoDeJogo = horaFinal - horaInicial;
                System.out.print("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
            } else if (horaInicial > horaFinal) {
                tempoDeJogo = (dia - horaInicial) + horaFinal;
                System.out.print("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
            }else {
                tempoDeJogo = dia;
                System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");
            }

         }catch (InputMismatchException e){
            System.out.println("Digite valores inteiros.");
        }
        }
}