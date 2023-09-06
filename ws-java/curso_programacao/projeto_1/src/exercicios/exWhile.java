package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int x, y;
        x = 0;
        y = 4;

        while (x < 4) {
            y += 2;
            x += 1;
            System.out.println(x + " - " + y);

        }

        sc.close();
    }
}
