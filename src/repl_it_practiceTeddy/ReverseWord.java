package repl_it_practiceTeddy;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if(word.length() == 5){
            char first = word.charAt(0);
            char second = word.charAt(1);
            char third = word.charAt(2);
            char fourth = word.charAt(3);
            char fifth = word.charAt(4);
            String sentence = fifth + "" + fourth + "" + third + "" + second +  "" + first;

            System.out.println(sentence);
        }else if(word.length() > 5){
            System.out.println("Too long!");
        }else if(word.length() < 5){
            System.out.println("Too short!");
        }




    }
}
