package general_practice.char_switch;

import java.util.Scanner;

public class UserInputHandler {
    Scanner scan;

    public static String test;

    static {

    }


    public UserInputHandler(Scanner scan){
        this.scan = scan;
    }

    public String handle (){

        switch (scan.next().charAt(0)){
            case 'y':
                return "Your request is being processed";
            case 'n':
                return "Thank you anyway for your consideration";
            case 'h':
                return "Sorry, no help is currently available";
            default:
                return "Invalid entry, please try again!";
        }
    }


}
