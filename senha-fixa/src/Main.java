import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int senha = 2002;
        int entradaUsuario;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a senha:");
            entradaUsuario = scanner.nextInt();

            while (entradaUsuario != senha) {
                System.out.println("Senha Invalida! Tente novamente:");
                entradaUsuario = scanner.nextInt();
            }
            System.out.println("Acesso permitido!");
        } catch (InputMismatchException e) {
            System.out.println("Caracteres inválidos!");
        }

        }
    }
