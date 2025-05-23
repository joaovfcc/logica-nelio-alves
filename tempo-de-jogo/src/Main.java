import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int horaInicial;
        int horaFinal;
        int duracao;
        int dia = 24;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hora inicial:");
            horaInicial = sc.nextInt();
            System.out.println("Hora final:");
            horaFinal = sc.nextInt();

           if (horaInicial < horaFinal){
              duracao = horaInicial - horaFinal;
               retornarMensagem(duracao);
           }else if (horaInicial > horaFinal){
               duracao = (dia - horaFinal) + horaFinal;
              retornarMensagem();
           }else {
               duracao = dia;
           }
        } catch (InputMismatchException e) {
            System.out.println("Digite um valor valido");;
        }
    }

    public static void retornarMensagem(int x){
        System.out.println(("O JOGO DUROU " + duracao + "HORA(S)"));
    }
}