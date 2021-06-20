package day26_loops;
import java.util.*;

import java.sql.SQLOutput;

public class MultiplicationTable {
    public static void main(String[] args) {
        //if the number is 2, using a for loop, print multiplication table for the number
        //if number less than 1 and more than 10 -
        // print ERROR and
        // exit main method: return;

       int number = 2;
        //System.out.println(number + " x " + 1 + " = " + (number * 1));

       for(int i = 1; i <= 10; i++){
           System.out.println(number + " x " + i + " = " + (number * i));

       }
            //with Scanner - Burak Kara
//        Scanner scan = new Scanner(System.in);
//        System.out.println("*****Welcome to multiplication chart*****");
//        System.out.println("Please enter number");
//        int num = scan.nextInt();
//        int result = 0;
//
//        for (int i = 1; i <= 10; i++) {
//            result = num * i;
//            System.out.println(num+ "*" +i+ "=" +result);
//        }


            if (number < 1 || number > 10){
                System.out.println("ERROR: invalid input");
                return;
            }



    }
}
