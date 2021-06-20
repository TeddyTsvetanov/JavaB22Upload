package repl_it_practiceTeddy;
import java.util.Scanner;

public class FindTheLength {
//    public static void main(String[] args) {
//        System.out.println("Please enter the text");
//
//        Scanner word = scan.nextLine();
//
//        System.out.println("Length is: " + word.length());
//
//
//
//    }


    public static void main (String[] args)  {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String fullName = scan.nextLine();

        if(fullName.equalsIgnoreCase("Max Payne") || fullName.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }

    }
}
