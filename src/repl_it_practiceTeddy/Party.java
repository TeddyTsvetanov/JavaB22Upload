package repl_it_practiceTeddy;
import java.util.*;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guest = 0;
        String guestList = "";
        int guestCount = 0;
        String guestName = "";
        String extraGuest = "";


        do{
            System.out.println("Please enter guest name:");
            guestName = input.nextLine();
            System.out.println("Do you want to enter new guest name:");
            extraGuest = input.nextLine();
            guestList += guestName + ", ";

        }while(guestCount < 10 && extraGuest.equals("yes"));


        System.out.println("Guest's list: " + guestList.substring(0, guestList.length()-2));

    }
}
