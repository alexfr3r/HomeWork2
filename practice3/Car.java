package practice3;

public class Car {
    //поля
    String brand;
    int year;

    //конструктор
    Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // геттер для бренда
    String getBrand() {
        return this.brand;
    }

    // setter для бренда
    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    // геттер для года
    int getYear() {
        return this.year;
    }

    // сеттер для года
    void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Бренд: " + this.brand + ", год выпуска: " + this.year);
    }


}
