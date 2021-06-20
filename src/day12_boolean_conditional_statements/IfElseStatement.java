package day12_boolean_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("condition is true");
        } else {
            System.out.println( "condition is false");
        }

        int count = 25;

        if (count > 30) {
            System.out.println("count is more than 30");

        } else {
            System.out.println("count is less than 30");

        }

        byte age = 16;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        } else {
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }

    }
}
