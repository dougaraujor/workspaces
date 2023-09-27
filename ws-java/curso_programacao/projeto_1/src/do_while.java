import java.util.Locale;
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        // Fazer um programa que leia a temperatura em Celsius e mostrar o equivalente a
        // farenheit.
        // Perguntar se o usuario deseja repetir (s/n). Caso o usuarioo digite s repetir
        // o programa.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double celsius;
        double farenheit;
        char resp;
        do {
            System.out.println("Digite a temperatura em celsius: ");
            celsius = sc.nextDouble();
            farenheit = (9 * celsius / 5) + 32;
            System.out.println("Equivalente a " + farenheit + " Farenheit");
            System.out.println("Deseja continuar? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }
}
