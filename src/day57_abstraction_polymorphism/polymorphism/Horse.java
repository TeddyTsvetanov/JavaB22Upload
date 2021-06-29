package day57_abstraction_polymorphism.polymorphism;

public class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Cat is saying <neigh neigh>");
    }
}
