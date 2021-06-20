package general_practice.car_inheritance;

public class Mercedes extends Car {

    public Mercedes(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public Mercedes(String make, String model, double price, int year, boolean isAutomatic) {
        super(make, model, price, year, isAutomatic);
    }
}
