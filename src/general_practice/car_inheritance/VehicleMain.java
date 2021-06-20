package general_practice.car_inheritance;

public class VehicleMain {

    public static void main(String[] args) {

//        Mercedes mercedes = new Mercedes("E class", "Mercedes", 15000, 2000);
//        System.out.println(mercedes.make);

        Mercedes mercedesAuto = new Mercedes("E class", "Mercedes", 15000, 2000, true);
        mercedesAuto.getMake();
        System.out.println(mercedesAuto.getMake());
    }
}
