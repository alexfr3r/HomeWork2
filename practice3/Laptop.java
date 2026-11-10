package practice3;

public class Laptop {
    // поля
    String brand;
    double price;

    // конструктор
    Laptop (String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // getter for brand
    String getBrand() {
        return this.brand;
    }

    // getter for price
    double getPrice() {
        return this.price;
    }

    // setter for brand
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    // settter for price
    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Бренд ноутбука " + this.brand + ", цена ноутбука: " + this.price);
    }
}
