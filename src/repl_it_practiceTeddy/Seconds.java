package repl_it_practiceTeddy;
import java.util.Scanner;

public class Seconds {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        int inputSeconds, hours, minutes, seconds;

        System.out.println("Enter seconds:");

        inputSeconds = scan.nextInt();
        hours = inputSeconds/(60*60);
        //3600 = 60min * 60sec
        //ex: 4000/3600 = 1h 400 sec



        minutes = (inputSeconds % 3600)/60;
        //whatever the remainder of the hours is divided by 60 sec/min
        //400sec left /60 sec in a min => 400/60 = 6 min

        seconds = (((inputSeconds % 3600) % 60) % 60);
        //whatever the remainder of the minutes is divided by 60 sec/min


        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");



    }


}
