package repl_it_practiceTeddy;

import java.util.Scanner;

/**
 * Using conditional statements, check if number is odd or even. Please follow the below examples and print message accordingly:
 *
 * Enter a number:
 * 10
 *
 * 10 is even
 * Enter a number:
 * 10
 *
 * 10 is even
 * Enter a number:
 * 33
 *
 * 33 is odd
 * Enter a number:
 * 33
 *
 * 33 is odd
 * Enter a number:
 * 0
 *
 * 0 is even
 */
public class EvenOrOddWithIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if(num % 2 == 0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
        }

    }
}
