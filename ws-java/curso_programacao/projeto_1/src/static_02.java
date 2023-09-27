import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class static_02 {
    public static void main(String[] args) {

        // Fazer um programa para ler um valor numérico qualquer ,e daí mostrar quanto
        // seria aquele valor de circunferência e do volume de uma esfera para um raio
        // daquele valor
        // Informar também o valor de PI com duas casas decimais.
        // Método 02 :> Métodos com a classe Calculator

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double c = Calculator.circunferencia(raio);
        double v = Calculator.volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", Calculator.PI);

        sc.close();
    }
}
