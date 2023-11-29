package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();
        System.out.println("Fim do programa");

    }

    public static void method1() {
        System.out.println("Inicio metodo 1");
        method2();
        System.out.println("Fim metodo 1");
    }

    public static void method2() {
        System.out.println("Start do metodo 2");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();

            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Erro de Input!");

        }
        sc.close();
        System.out.println("Final do Metodo 2 ");
    }
}
