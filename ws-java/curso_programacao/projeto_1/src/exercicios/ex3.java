package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
        // calcule e mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
        // D).
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, dif;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        dif = (A * B - C * D);
        System.out.println("A diferença de" + A + " e " + B + " com " + C + " e " + D + " é: " + dif);

        sc.close();
    }
}
