package repl_it_practiceTeddy;
import java.util.*;

public class VendingMachine {
    public static void main(String[] args) {
        //Write a program that will determine the change given from the vending machine.
        // The program will accept the cents amount and output the change in
        // quarters, dimes, nickels, and pennies.
        //
        //The given cents value should be more than 0 and less than 100.
        // If the given cents is not in the range print "Invalid cents amount"
        // and there should be no other output after

        //In valid cases print the change in this format:
        //Your change is x quarters, x dimes, x nickels, and x pennies
        //
        //Enter cents:
        //95
        //Your change is 3 quarters, 2 dimes, 0 nickels, and 0 pennies

    Scanner scan = new Scanner(System.in);
        int quaters, dimes, nickels, pennies;

        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        quaters = cents / 25;   //842 = 33Q *25 = 825-842=17
        dimes = ((cents % 25)/10);  //17/10 = 1D + 7cents
        nickels = (((cents % 25) % 10)/5); // 7/5 = 1 + 2 pennies
        pennies = (((cents % 25) % 10) % 5)/1;   //2/1= 2 pennies

        if ((cents > 0) && (cents < 100)){
            System.out.println("Your change is " + quaters + " quarters, " + dimes + " dimes, "
                    + nickels + " nickels, and " + pennies + " pennies");
        }else{
            System.out.println("Invalid cents amount");
        }
    }
}
