package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Construtores
    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Construtores

    // Get & Setter name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Get & Setter name

    // Get & Setter Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Get & Setter Price

    // Get & Setter quantity

    public int getQuantity() {
        return quantity;
    }
    // Get & Setter quantity

    public double totalValueInStock() {
        return price * quantity;

    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + " , "
                + quantity + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
