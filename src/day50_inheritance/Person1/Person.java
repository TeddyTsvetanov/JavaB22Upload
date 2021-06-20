package day50_inheritance.Person1;
/**
 * Super class
 * Parent class
 * Base class
 */

public class Person {
    String name;
    int age;


    public void walk (){
        System.out.println("A person can walk");
    }

    public void talk (){
        System.out.println("A person can talk");
    }

    public void work(String job) {
        System.out.println("Person is working as " + job);
    }
}
