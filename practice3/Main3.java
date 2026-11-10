package practice3;

public class Main3 {
    public static void main(String[] args) {

        Car carOne = new Car("Audi", 2021);
        carOne.print();
        carOne.setYear(2023);
        carOne.print();

        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setWidth(20);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        Book book = new Book("Война и Мир", "Толстой");
        book.printInfo();
        book.setAuthor("Пушкин");
        book.printInfo();

        BankAccount bankAccount1 = new BankAccount("Petya", 1000);
        bankAccount1.printBalance();
        bankAccount1.deposit(500);
        bankAccount1.printBalance();
        bankAccount1.withdraw(1200);
        bankAccount1.printBalance();

        Point point = new Point(3,5);
        point.setX(10);
        point.print();

        StudentGroup firstGroup = new StudentGroup ("Первая группа", 10);
        firstGroup.setStudentCount(20);
        firstGroup.printInfo();

        Circle circle = new Circle(5);
        circle.setRadius(7);
        System.out.println("Площадь круга: " + circle.calculateArea());

        Teacher teacher = new Teacher("Олег", "математика");
        teacher.setSubject("История");
        teacher.printInfo();

        Product productOne = new Product("TV", 1000);
        productOne.setPrice(2000);
        productOne.applyDiscount(30);
        productOne.printInfo();

        Laptop laptop = new Laptop("ASUS", 1000);
        laptop.setPrice(2000);
        laptop.printInfo();




    }
}
