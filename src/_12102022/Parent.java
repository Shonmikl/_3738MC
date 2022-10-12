package _12102022;

import java.awt.image.BandCombineOp;

/**
 * 1. Класс
 * 2. Поля
 * 3. Конструктор(ы)
 * 4. Геттеры и Сеттеры
 * 5. Equals and HashCode and ToString
 * 6. Методы
 * */

public class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        //текущего класса имя
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent {
    public Child(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Parent parent = new Parent("Mik", 22);
    }
}