package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);

        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);

        // short hand
        cars += 5;
        System.out.println("cars in parking lot = " + cars);

        cars = cars - 6;
        System.out.println("cars in parking lot = " + cars);


        String word = "Java";
        System.out.println("word = " + word);

//        word = word + "programming";
//        System.out.println("word = " + word);

        //add "is fun"

        char letter = 'A';
        System.out.println("letter" + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 'U' to letter;
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee = " + parkingFee);
//        double earlyBird = parkingFee/2;
//        System.out.println("earlyBird = " + earlyBird);
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("Weekend parking fee is equal to = " + parkingFee);

    }
}
