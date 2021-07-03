package day58_polymorphism.superMan;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new SuperMan();
        spMan1.feedKid();
        spMan1.playWithKid();
        spMan1.feedKid();
        //spMan1.work("SDET"); Superman can ONLY do what Father CAN do

        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println("got paid $ " + spMan2.getPaid());
        //spMan2.raiseKid(); ERROR - method from Father class

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scrum Master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();

    }
}
