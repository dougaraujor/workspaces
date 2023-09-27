package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ex_sobrecarga01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Account account = new Account();

        System.out.println("Enter number account: ");
        int number = sc.nextInt();

        System.out.println("Enter holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there any initial deposit value (y/n) ?");
        char response = sc.nextLine().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Data: " + account);

        sc.close();
    }
}
