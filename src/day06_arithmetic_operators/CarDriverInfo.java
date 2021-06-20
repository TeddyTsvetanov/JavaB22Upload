package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String[] args){
        //carModel, driverName, licenseNumber, speed, automatic, licenseClass;

        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "B256235";
        short speed = 260;
        boolean isAutomatic = true;
        char licenseClass = 'C';  //CDL

        System.out.println(carModel);
        System.out.println(driverName);
        System.out.println(licenseNumber);
        System.out.println(speed);
        System.out.println(isAutomatic);
        System.out.println(licenseClass);

        //Dodge charger is car model.
        System.out.println(carModel + " is car model.");
        //Donald Trump is driving a car.
        System.out.println(driverName + " is driving a car.");
        //Driver name:      Donald Trump
        System.out.println("Driver name:\t\t" + driverName);
        //Donald Trump is driving Dodge charger
        System.out.println(driverName + " is driving " + carModel + ".");
        //Current speed is: 55mph
        System.out.println("Current speed is: "+speed + "mph");
        //Is the car Automatic:
        System.out.println("Is the car Automatic?: " +isAutomatic);

        //
        String firstName = "Adam";
        String lastName = "Smith";
        System.out.println(firstName+lastName);

    }
}
