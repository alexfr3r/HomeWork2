package practice3;

public class Teacher {
    // поля
    String name;
    String subject;

    // конструктор
    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // getter for name
    String getName() {
        return this.name;
    }

    // getter for subject
    String getSubject() {
        return this.subject;
    }

    // setter for name
    void setName(String newName) {
        this.name = newName;
    }

    // setter for subject
    void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo() {
        System.out.println("Имя преподователя: " + this.name + ", предмет: " + this.subject);
    }
}
