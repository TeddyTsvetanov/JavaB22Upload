package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void transportPeople() {
        System.out.println("Plane is transporting people in the air");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane ticket to Hawaii costs " + (mile * 0.15) + " and distance from Chicago is " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Plane has a lazy pilot who uses autopilot");
    }

    @Override
    public void hi() {
        System.out.println("Plane attendants say Hello aboard!");
    }

    @Override
    public void bye() {
        System.out.println("Thank you for flying on American airlines");
    }

    public void land() {  //this is not an overridden method because it belongs to plane only (land)
        System.out.println("Plane is landing - buckle up");
    }
}

