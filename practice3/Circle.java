package practice3;

public class Circle {
    // поля
    double radius;

    // конструтор
    Circle(double radius) {
        this.radius = radius;
    }

    // getter for radius
    double getRadius() {
        return this.radius;
    }

    // setter
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
