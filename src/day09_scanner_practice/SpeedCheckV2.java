package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your current speed (mph): ");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;
        System.out.println("The speed limit in this zone is (mph): " + speedLimit);
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving with " + overTheLimit + "mph over the limit. Slow down!");
    }
}
