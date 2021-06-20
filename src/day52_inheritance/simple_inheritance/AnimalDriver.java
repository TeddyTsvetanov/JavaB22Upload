package day52_inheritance.simple_inheritance;

public class AnimalDriver {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        cat.fly();
        cat.sound("meow meow");

        Dog dog = new Dog("boof");
        dog.sound();
        Dog dog1 = new Dog("woof");
        dog1.sound();
        dog.sound("woofhhhjk");


    }


}
