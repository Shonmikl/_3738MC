package _05102022.animal;

public class Animal {
}

class Pet extends Animal {
}

class Cat extends Pet {
}

class Dog extends Pet {
}

class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
        Animal catA = new Cat();//расширяющее приведение типов
        Animal dogA = new Dog();
        Animal animal = new Animal();//3 реализации dog, cat, pet
        //1 реализация Dog dog = (Dog) animal;
        Object object = new Object();
//        Cat cat = (Cat) object; //сужение типов
//        Object object1 = new Cat();

        Animal animalCat = new Cat();
        Dog dog = (Dog) animalCat;
        System.out.println(dog);//ошибка кастинга
    }
}