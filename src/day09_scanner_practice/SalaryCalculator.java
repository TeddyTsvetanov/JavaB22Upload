package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Input Hourly rate: $");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = (40*hourlyRate);
        double monthlyRate = (173*hourlyRate);
        double annualRate = (12*monthlyRate);
        System.out.println("Weekly rate is: $" + weeklyRate);
        System.out.println("Monthly rate is: $" + monthlyRate) ;
        System.out.println("Annual rate is: $" + monthlyRate);
    }
}
