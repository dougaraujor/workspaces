import java.util.Locale;
import java.util.Scanner;

public class static_01 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        // Fazer um programa para ler um valor numérico qualquer ,e daí mostrar quanto
        // seria aquele valor de circunferência e do volume de uma esfera para um raio
        // daquele valor
        // Informar também o valor de PI com duas casas decimais.
        // Método 01 :> Métodos na propria classe do problema.

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        sc.close();
    }

    public static double circunferencia(double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
