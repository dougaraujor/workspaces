import java.util.Locale;
import java.util.Scanner;

public class sintaxeOpcional {
    public static void main(String[] args) {
        // Fazer um programa que leia os minutos inseridos.
        // O plano adquirido pela franquia de telefonia foi de 100 minutos por 50 reais.
        // Caso exceda os 100 minutos da franquia , serão cobrados 2 reais por cada
        // minuto a mais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Durante quantos minutos foram utilizados o telefone?");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor total a pagar é de R$%.2f%n", conta);

        sc.close();
    }
}
