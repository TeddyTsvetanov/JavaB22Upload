package day45_oop;

public class TrafficLightsObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; - we used to do it like this in the past - not a good practice to do it like this.
        trafficLight.changeColor("red");
        //System.out.println("current color = " + trafficLight.color); DIRECT access to variable. NOt recommended
        //call method to access the variable"
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();

    }
}
