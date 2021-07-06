package day53_inheritance.tesla;

public class Roadster extends ElectricCar {
    //Roadster r = new Roadster("Roadster", 200000, 2022, 620); - tova e v Driver class-a CarObjects
    public Roadster(String model, double price, int year, int range){
        //          "Roadster", 200000, 2022, 620
        super("Tesla", model, price, year, range);
        //!!! when we write super it ALWAYS has to be the first line!!!
        System.out.println("Welcome new Roadster");
    }


}
