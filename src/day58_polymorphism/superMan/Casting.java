package day58_polymorphism.superMan;

public class Casting {
    public static void main(String[] args) {
        //add variable of Worker and create object of superMan
        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();  //kind of what we saw with Javascript Executor in Selenium
        ((SuperMan)worker).playWithKid();

        //downcasting from worker to SuperMan
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("SDET");

    }
}
