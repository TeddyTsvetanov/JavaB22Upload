package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 2000.55;

        if (salesAmount <= 1000.00) {
            bonus = 50;
            System.out.println("Good job, you qualified for bonus!");

        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full bonus");
        }
        System.out.println("Your total bonus is " + bonus);
    }
}
