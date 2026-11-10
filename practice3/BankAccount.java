package practice3;

public class BankAccount {
    // поля
    String owner;
    double balance;

    // конструтор
    BankAccount (String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // getter для владельца
    String getOwner() {
        return this.owner;
    }

    // setter для владельца
    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Владелец: " + this.owner + ", Ваш баланс: " + this.balance);
    }
}
