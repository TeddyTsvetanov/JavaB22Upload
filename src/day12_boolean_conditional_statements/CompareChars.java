package day12_boolean_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);

        char grade = 'E';
        // ? pass = ?
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + pass);
    }
}
