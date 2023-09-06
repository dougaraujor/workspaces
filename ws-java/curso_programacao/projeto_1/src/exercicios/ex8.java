package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou
        // ímpar
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int num;
        System.out.println("Vamos ver o número é par ou ímpar.");
        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número impar.");
        }
        sc.close();
    }
}
