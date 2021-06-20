package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        //1) static method can only be called using classname
        StaticMethods.displayMessage("Wooden spoon");
        //1) instance method needs an object to be called
        //StaticMethods.instanceMethod(); ERROR - in order to be able to call this one we need to create an object -
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

    }
}
