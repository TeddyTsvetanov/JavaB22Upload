package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split ("a");
        System.out.println(array.length); //2
        int countOfA = array.length;
        if(word.endsWith("a")){    //if ends with a, add one more.
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        //ako dumata zavurshvashva na "a" ne go broi kato null string, no ako zapochva s "a" go broi kato katuv

        System.out.println("---SPLIT WITH EMPTY STRING---");
        String []strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);


        //ReGEX

        String word2 = "java1sql2html";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);

        String password = "Abcd123_5";
        if(password.matches ("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }

    }
}
