package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("Speed limit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("overTheLimit = " + overTheLimit);
        System.out.println("You are driving with " + overTheLimit + "mph over the limit. Slow down!");

    }
}
