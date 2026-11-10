package practice3;

public class Product {
    // поля
    String name;
    double price;

    // конструктор
    Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getter for name
    String getName() {
        return this.name;
    }

    // getter for price
    double getPrice() {
        return this.price;
    }

    // setter for price
    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void applyDiscount(int discount) {
        this.price =  price * (1 - discount / 100.0);
    }

    public void printInfo() {
        System.out.println("Название товара: " + this.name + ", цена товара: " + this.price);
    }
}
