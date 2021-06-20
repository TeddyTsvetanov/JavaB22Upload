package day52_inheritance.simple_inheritance;

public class Animal {

     void sound(){
         System.out.println("Animal" + " sound");
    }

    protected void fly(){
        System.out.println("Animal" + " fly");
    }

    protected void sound(String sound){
        System.out.println("Animal says " + sound);
    }

    protected static void myStaticMethod() {

    }
}
