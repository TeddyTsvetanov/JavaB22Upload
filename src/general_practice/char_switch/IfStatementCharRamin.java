package general_practice.char_switch;

import java.util.Scanner;

public class IfStatementCharRamin {

    /**
     * Write a switch statement that tests the value of the char variable response and performs the following actions:
     *
     * if response is y, print: "Your request is being processed is printed"
     * if response is n, print: "Thank you anyway for your consideration is printed"
     * if response is h, print: "Sorry, no help is currently available is printed"
     * for any other value of response, print: "Invalid entry, please try again!"
     */

    static int z;

    public static void main(String[] args) {
        String message;
        System.out.println("Please make a selection");

        UserInputHandler uih = new UserInputHandler(new Scanner (System.in));
        message = uih.handle();

        IfStatementCharRamin r = new IfStatementCharRamin();


        System.out.println("Current selection is " + message);

    }
}
