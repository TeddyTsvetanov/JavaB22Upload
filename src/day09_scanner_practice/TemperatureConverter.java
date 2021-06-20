package day09_scanner_practice;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
    System.out.println("*****WELCOME TO CHICAGO, IL, USA*******");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter current temperature in F: ");
        double tempF = scan.nextDouble();
        double tempC = (tempF - 32)*5/9;
        System.out.println("Current temperature in C is: " + tempC);
        System.out.println("Enjoy your stay here!");
//        System.out.println();
//        System.out.println();
    }
}
