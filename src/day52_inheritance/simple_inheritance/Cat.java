package day52_inheritance.simple_inheritance;

public class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("Cat meow");
    }

    protected void fly() {
        System.out.println("Cat fly");
    }

}
