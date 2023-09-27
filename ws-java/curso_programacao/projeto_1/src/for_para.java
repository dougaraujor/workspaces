import java.util.Locale;
import java.util.Scanner;

public class for_para {
    public static void main(String[] args) {
        // Fazer um programa que le um valor N inteiro e depois N numeros inteiros.
        // Ao final,mostra a soma dos N lidos.
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Insira aqui a quantidade de vezes que desesja digitar um número: ");
        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Quantidade restante de números para serem inseridos: " + (N - i));
            int x = sc.nextInt();
            soma += x;

        }

        System.out.println("A soma total dos números inseridos é de: " + soma);
        sc.close();
    }
}
