package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
        // valor da área deste círculo com quatro
        // casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double R, pi, area;
        R = sc.nextDouble();
        pi = 3.14159;
        area = pi * R * R;
        System.out.printf("A area = %.4f%n", area);
        sc.close();
    }
}
