package _31102022;

public class AnimalEx {


    int tax = 10000;

    protected void say() {
        System.out.println("AnimalEx say()");
    }
}

class Dog extends AnimalEx {

    final int tax = 10;

    public int getTax() {
        return super.tax;
    }

    @Override
    public void say() {
        System.out.println("Dog say()");
    }
}

class Cat extends AnimalEx {

}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getTax());
        AnimalEx animalEx = new AnimalEx();
    }
}