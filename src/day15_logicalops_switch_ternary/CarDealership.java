package day15_logicalops_switch_ternary;

public class CarDealership<pupublic> {
      public static void main(String[] args) {
        double budget = 5_000.0;
        String model = "Toyota";
        double carPrice = 4_999.0;

        if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals ("Tesla")) {
            System.out.println("I would like to purchase this " + model + " for the price offered " + carPrice);
        }else{
            System.out.println("Not interested in this " + model + " for the price offered " + carPrice);
        }
    }
}
