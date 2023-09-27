import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class poo03 {
    public static void main(String[] args) {
        // Fazer um programa para ler os dados de um produto em estoque (nome, preço e
        // quantidade no estoque). Em seguida:
        // • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor
        // total no
        // estoque)
        // • Realizar uma entrada no estoque e mostrar novamente os dados do produto
        // • Realizar uma saída no estoque e mostrar novamente os dados do produto
        // Para resolver este problema, você deve criar
        // uma CLASSE conforme projeto ao lado:
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price");
        double price = sc.nextDouble();

        System.out.println("Quantity in Stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        System.out.println("Product data: " + product);
       

        System.out.println();

        System.out.print("Enter the number of products to be added in Stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from Stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
