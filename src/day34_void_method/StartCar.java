package day34_void_method;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void pressGasPedal(){
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");
    }

    public static void sitInCar(){
        System.out.println("1. Open the door and sit in driver's seat");
    }

    public static void startTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }

    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal and shift to'D'");
    }
}
