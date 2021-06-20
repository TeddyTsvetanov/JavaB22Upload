package day10_shorthand_operators;

import java.sql.SQLOutput;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCode by 1, 3 different ways that we learned today

        linesOfCode = linesOfCode +1;
        System.out.println("lines ofCode " + linesOfCode);

        //type 4 different ways of decreasing the amount
        linesOfCode = linesOfCode - 1;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode -= 1;
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode--;
        System.out.println("linesOfCode = " + linesOfCode);

        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter -= 4;
        System.out.println("letter = " + letter);

        letter--; letter--; letter--;
        System.out.println("letter = " + letter);





    }
}
