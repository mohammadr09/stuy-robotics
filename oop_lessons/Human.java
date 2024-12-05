package oop_lessons;

public class Human {
    String name;
    int age;
    int grade;

    public Human(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getNextGrade() {
        return age + 1;
    }

    public String changeName(String newName) {
        name = newName;
        return newName + " is now the person's new name";
    }
}