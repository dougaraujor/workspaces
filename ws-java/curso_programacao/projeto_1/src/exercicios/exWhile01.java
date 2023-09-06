package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exWhile01 {
    public static void main(String[] args) {
        // Escreva um programa que repita a leitura de uma senha até que ela seja
        // válida. Para cada leitura de senha
        // incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
        // informada corretamente deve ser
        // impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
        // a senha correta é o valor 2002.
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Informe a sua senha: ");
        int senha = sc.nextInt();
        int senhaCorreta = 2002;

        while (senha != senhaCorreta) {
            System.out.println("Senha invalida!");
            senha = sc.nextInt();
        }
        System.out.println("Senha correta!!");
        System.out.println("Acesso permitido.");
        sc.close();
    }
}
