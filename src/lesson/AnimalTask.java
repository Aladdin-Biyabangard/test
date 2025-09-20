package lesson;

abstract class Animal {

    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Hav-hav!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Miyau!");
    }
}

public class AnimalTask {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
