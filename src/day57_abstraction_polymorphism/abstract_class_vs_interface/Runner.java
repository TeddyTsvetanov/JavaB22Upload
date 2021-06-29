package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //AbstractA absA = new AbstractA();  //cannot create an object from abstract class, cannot be instantiated
        //InterfaceA iA = new InterfaceA();  //cannot create an object from an abstract Interface

        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE only works with interface.staticMethodE
        ConcreteA.staticMethodC();
    }

}
