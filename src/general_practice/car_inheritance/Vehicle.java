package general_practice.car_inheritance;

public class Vehicle {

    protected String make;
    protected String model;
    protected double price;
    protected int year;

    public Vehicle(String make, String model, double price, int year) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
