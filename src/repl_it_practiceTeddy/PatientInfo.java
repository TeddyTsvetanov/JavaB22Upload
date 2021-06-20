package repl_it_practiceTeddy;
import java.util.Scanner;

public class PatientInfo {
    public static void main(String[] args) {
        //Enter your code here
        String email, street;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");


        System.out.println("Enter your first name");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine();



        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        // continue for city

        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contacts = ("work phone number - " + workPhoneNumber + ", " + "personal phone number - " + personalPhoneNumber + ", email: " + email);
        String fullName = (lastName + ", " + firstName);
        String address = (street + ", " + city + ", " + state + " " + zipCode);

        System.out.println("Patient personal information");
        System.out.println("Full name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Contacts: " + contacts);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Married?: " + isMarried);

    }
}

/**
 *     //Enter your code here
 *     String email, street;
 *
 *         Scanner scan = new Scanner(System.in);
 *
 *         System.out.println("Welcome to the patient portal!");
 *         System.out.println("Please enter your personal information");
 *
 *
 *         System.out.println("Enter your first name");
 *         String firstName = scan.nextLine();
 *
 *         System.out.println("Enter your last name");
 *         String lastName = scan.nextLine();
 *
 *
 *
 *         // this part is already provided DO NOT CHANGE
 *         System.out.println("Enter your email");
 *         email = scan.next();
 *         scan.nextLine();//to capture Enter key press
 *         System.out.println("Enter your street");
 *         street = scan.nextLine();
 *         // continue for city
 *
 *         System.out.println("Enter your city");
 *         String city = scan.nextLine();
 *         System.out.println("Enter your state");
 *         String state = scan.nextLine();
 *         System.out.println("Enter your zip code");
 *         int zipCode = scan.nextInt();
 *         System.out.println("Enter your work phone number");
 *         long workPhoneNumber = scan.nextLong();
 *         System.out.println("Enter your personal phone number");
 *         long personalPhoneNumber = scan.nextLong();
 *         System.out.println("Enter your age");
 *         int age = scan.nextInt();
 *         System.out.println("Enter your height");
 *         double height = scan.nextDouble();
 *         System.out.println("Enter your weight");
 *         double weight = scan.nextDouble();
 *         System.out.println("Are you married?");
 *         boolean isMarried = scan.nextBoolean();
 *
 *         String contacts = ("work phone number - " + workPhoneNumber + ", " + "personal phone number - " + personalPhoneNumber + ", email: " + email);
 *         String fullName = (lastName + ", " + firstName);
 *         String address = (street + ", " + city + ", " + state + " " + zipCode);
 *
 *         System.out.println("Patient personal information");
 *         System.out.println("Full name: " + fullName);
 *         System.out.println("Address: " + address);
 *         System.out.println("Contacts: " + contacts);
 *         System.out.println("Age: " + age);
 *         System.out.println("Height: " + height);
 *         System.out.println("Weight: " + weight + " pounds");
 *         System.out.println("Married?: " + isMarried);
 *
 */
