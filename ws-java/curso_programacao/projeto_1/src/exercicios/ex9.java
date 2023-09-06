package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        // "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
        // números devem poder ser digitados em
        // ordem crescente ou decrescente
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int A, B;
        System.out.println("Agora vamos verificar se dois números são multiplos ou não.");
        System.out.println("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.println("Agora digite o segundo: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números " + A + " e " + B + " são multiplos!");
        } else {
            System.out.println("Os números " + A + " e " + B + " não são multiplos!");
        }

        sc.close();
    }
}
