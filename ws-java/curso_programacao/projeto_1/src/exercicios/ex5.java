package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
        // valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Calcule e mostre o valor a ser pago
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, pcs1, cod2, pcs2;
        double valPc1, valPc2, total;

        cod1 = sc.nextInt();
        pcs1 = sc.nextInt();
        valPc1 = sc.nextDouble();

        cod2 = sc.nextInt();
        pcs2 = sc.nextInt();
        valPc2 = sc.nextDouble();

        total = valPc1 * pcs1 + pcs2 * valPc2;

        System.out.println("Codigo 1 " + cod1 + "Codigo 2 " + cod2);
        System.out.printf("Valor total a pagar: R$%.2f%n", total);

        sc.close();
    }
}
