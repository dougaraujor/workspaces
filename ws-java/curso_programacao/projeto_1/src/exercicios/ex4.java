package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        // Fazer um programa que leia o número de um funcionário, seu número de horas
        // trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o
        // salário do funcionário, com duas casas
        // decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horas, funcionario;
        double valorHora, salario;

        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = valorHora * horas;

        System.out.println("Número: " + funcionario);
        System.out.printf("Salario: U$%.2f%n", salario);

        sc.close();
    }
}
