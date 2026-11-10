package practice3;

public class Book {
    // поля
    String title;
    String author;

    // конструктор
    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // getter для названия
    String getTitle() {
        return this.title;
    }

    // getter для автора
    String getAuthor() {
        return this.author;
    }

    // setter для названия
    void setTitle(String newTitle) {
        this.title = newTitle;
    }

    // setter для автора
    void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void printInfo() {
        System.out.println("Название книги: " + this.title + ", автор книги: " + this.author);
    }
}
