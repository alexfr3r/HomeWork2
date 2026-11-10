package practice3;

public class StudentGroup {
    // поля
    String groupName;
    int studentCount;

    // конструтор
    StudentGroup (String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    // геттер для названия группы
    String getGroupName () {
        return this.groupName;
    }

    // геттер для числа студентов
    int getStudentCount() {
        return this.studentCount;
    }

    // сеттер для названия группы
    void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    // сеттер для кол-ва студентов
    void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo() {
        System.out.println("Название группы: " + this.groupName + ", кол-во студентов: " + this.studentCount);
    }
}
