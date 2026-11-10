package practice3;

public class Rectangle {
    // поля
    double width;
    double height;

    // конструктор
    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getter для ширины
    double getWidth() {
        return this.width;
    }

    // getter для высоты
    double getHeight() {
        return this.height;
    }

    // setter для ширины
    void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double calculateArea() {
        return width * height;
    }
}
