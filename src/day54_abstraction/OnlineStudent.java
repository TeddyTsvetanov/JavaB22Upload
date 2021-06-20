package day54_abstraction;

/**
 * Online Student extends Student abstract class
 * This class is considered to be concrete class.
 * It is responsible to implement all abstract methods (if any)
 */

public class OnlineStudent extends Student {
    /**
     * attendClass abstract method is implemented by the sub class
     * Subclass is overriding the abstract method of Parent class
     */

    @Override
    public void attendClass(){
        System.out.println("Student is attending class via Zoom");
    }

    //public abstract void askQuestion(); ERROR - abstract method cannot be in normal class

}
