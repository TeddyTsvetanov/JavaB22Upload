package day39_wrapper_classes;

import java.sql.SQLOutput;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("MIN INT: " + Integer.MIN_VALUE);
        System.out.println("MAX INT: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.9));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1));   //1 - if 1st number is larger than 2nd
        System.out.println(Double.compare(5, 5));   //0 - if both are equal
        System.out.println(Double.compare(5, 45));   //-1 - if 1st is smaller than 2nd

        System.out.println(Character.isDigit('8'));     //true
        System.out.println(Character.isDigit('v'));     //false
        System.out.println(Character.isAlphabetic('Q'));        //true   ?read more about alphabetic
        System.out.println(Character.isLetter('r'));        //true
        System.out.println(Character.isLetter('9'));        //false

        char letter = 'A';

        if(Character.isUpperCase(letter)){
            System.out.println("Letter is Uppercase");
        }

        String word = "JaVa iS FuN";
        for (int i=0; i< word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));           //JVSFN
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);   //always prints True
        System.out.println();


    }
}
