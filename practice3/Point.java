package practice3;

public class Point {
    // поля
    double x;
    double y;

    // конструтор
    Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    // геттер для Х
    double getX() {
        return this.x;
    }

    // getter for Y
    double getY() {
        return this.y;
    }

    // setter for X
    void setX(double newX) {
        this.x = newX;
    }

    void print() {
        System.out.println("Координата X: " + this.x + ", координата Y: " + this.y);
    }
}
