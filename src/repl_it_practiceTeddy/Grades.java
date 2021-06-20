package repl_it_practiceTeddy;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double scoreSubject1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double scoreSubject2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double scoreSubject3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double scoreSubject4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double scoreSubject5 = scan.nextDouble();

        System.out.println("Summary: " + subject1 + " - " + scoreSubject1 + ", " +
                subject2 + " - " + scoreSubject2 + ", " +
                subject3 + " - " + scoreSubject3 + ", " +
                subject4 + " - " + scoreSubject4 + ", " +
                        subject5 + " - " + scoreSubject5);

        double averScore = ((scoreSubject1+scoreSubject2+scoreSubject3+scoreSubject4+scoreSubject5)/5);
        System.out.println ("Your average score is: " + averScore);

        System.out.println ("Thank you for using Grader!");
        System.out.println ("Goodbye!");
    }

}
