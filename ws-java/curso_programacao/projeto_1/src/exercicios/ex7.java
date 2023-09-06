package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é
        // negativo ou não

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        if (num < 0) {
            System.out.println(num + " É um número negativo!");
        } else {
            System.out.println(num + " Não é negativo.");
        }

        sc.close();
    }
}
