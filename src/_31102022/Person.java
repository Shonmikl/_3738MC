package _31102022;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Konst", 33);
    }
}