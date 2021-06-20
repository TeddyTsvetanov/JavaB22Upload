package repl_it_practiceTeddy;
import java.util.Scanner;


public class CaffeineOverdose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Caffeine Amount in your drink (in milligrams): ");
        double numOfMilligrams = scan.nextDouble();
        double numOfGrams = numOfMilligrams * 0.001;
        System.out.println("This is equal to " + numOfGrams + " gramms.");
        double drinkCountToOverdoze = 10*1000/numOfMilligrams;

        System.out.println ("It takes 10 gramms of caffein for lethal overdoze. You will need to drink " + drinkCountToOverdoze + " drinks to overdoze.");





    }
}
