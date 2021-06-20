package general_practice.car_inheritance;

public class Car extends Vehicle{

    protected boolean isAutomatic;

    public Car(String make, String model, double price, int year) {
        super(make, model, price, year);
    }

    public Car(String make, String model, double price, int year, boolean isAutomatic) {
        super(make, model, price, year);
        this.isAutomatic = isAutomatic;
    }
}
