package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO ADAIRE APARTMENTS");

        int numberOfBedrooms = 0;
        double startingPrice = 0;


        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio Apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One Bedroom Apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two Bedroom Apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("Five Bedroom Apartment currently unavailable");
                startingPrice = 1725;
                break;

        }
        System.out.println("Starting price: $" +startingPrice);




    }
}
