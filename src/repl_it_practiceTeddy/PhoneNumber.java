package repl_it_practiceTeddy;
import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args){

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given

        Scanner scan=new Scanner(System.in);
        System.out.println("Print area code ");
        int areaCode=scan.nextInt();
        System.out.println("Print local number: ");
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:

        String fullphoneNumber = "(" + areaCode + ")-" + localNumber;

        System.out.println("Calling number " + fullphoneNumber);









    }
}