package day08_casting_scanner;

import java.sql.SQLOutput;

public class CastingExamples {
    public static void main(String[] args) {
        //byte - short - int - long
//        int num17 = 200;
//        byte num18 = (byte)num17;
//        System.out.println("num17= " + num17);
//        System.out.println("num18= " + num18);
//
        char letter = 'T';
        int numLetter = letter;
        System.out.println(numLetter);
        System.out.println("numLetter = " + numLetter);

        int num17 = 200;
        byte num18 = (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

    }
}
