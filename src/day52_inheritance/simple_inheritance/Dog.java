package day52_inheritance.simple_inheritance;

public class Dog extends Animal {
    private String sound;

    public Dog(String sound){
        this.sound = sound;
    }

    @Override
    void sound(){
        System.out.println("Dog says " + sound);
    }

    @Override
    protected void sound (String sound){
        super.fly();

    }




}
