import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double distanciaUm;
        double distanciaDois;
        double distanciaTres;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite as tres distancias:");
        distanciaUm = scanner.nextDouble();
        distanciaDois = scanner.nextDouble();
        distanciaTres = scanner.nextDouble();

        if (distanciaUm > distanciaDois && distanciaUm > distanciaTres){
            System.out.println("MAIOR DISTANCIA = " + distanciaUm);
        } else if (distanciaDois > distanciaUm && distanciaDois > distanciaTres) {
            System.out.println("MAIOR DISTANCIA = " + distanciaDois);

        } else if (distanciaTres > distanciaUm && distanciaTres > distanciaDois) {
            System.out.println("MAIOR DISTANCIA = " + distanciaTres);
        } else if (distanciaUm > distanciaDois && distanciaDois > distanciaTres) {
            System.out.println("MAIOR DISTANCIA = " + distanciaUm);
        }
    }
}