package repl_it_practiceTeddy;

public class SwitchRestaurantRating {
    public static void main(String[] args) {
        int restaurantRating = 2;
        switch (restaurantRating) {
            case 1:
                System.out.println(" This restaurant  is not my favorite");
                break;
            case 2:
                System.out.println("This restaurant is good.");
                break;
            case 3:
                System.out.println("This restaurant is fantastic");
                break;
            default:
                System.out.println("I've never dined at this restaurant");
                break;
        }

    }

}


