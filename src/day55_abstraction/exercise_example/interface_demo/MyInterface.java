package day55_abstraction.exercise_example.interface_demo;

public interface MyInterface {
    //interface keyword is used to create an interface in java. We cannot create object of interface
    public abstract void learn();
}

interface MyInterface2{

}

class MyClass implements MyInterface, MyInterface2 {

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }
}

class Main{
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); //ERROR !!! CAN NOT create object of Interface
        MyClass myclass = new MyClass();

    }
}
