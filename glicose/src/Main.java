import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double glicoseUsuario;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida da glicose: ");
        glicoseUsuario = scanner.nextDouble();
        if (glicoseUsuario <= 100){
            System.out.println("Classificação: NORMAL");

        } else if (glicoseUsuario > 100 && glicoseUsuario <= 140) {
            System.out.println("Classificação: ELEVADO");

        } else if (glicoseUsuario > 140) {
            System.out.println("Classificação: DIABETES14");

        }

    }
    }
