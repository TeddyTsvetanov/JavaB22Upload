package repl_it_practiceTeddy;
import java.util.*;

public class MergeSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        if ((word1.length() == 3) && (word2.length() == 3)) {
            char word1Letter1 = word1.charAt(0);
            char word1Letter2 = word1.charAt(1);
            char word1Letter3 = word1.charAt(2);
            char word2Letter1 = word2.charAt(0);
            char word2Letter2 = word2.charAt(1);
            char word2Letter3 = word2.charAt(2);
            String sentence = (word1Letter1 + "" + word2Letter1 + "" + word1Letter2 + "" + word2Letter2 + "" + word1Letter3 + "" + word2Letter3);

            System.out.println (sentence);

        }else{
            System.out.println("cannot merge");
        }




    }
}
