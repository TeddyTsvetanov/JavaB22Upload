package general_practice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AssessmentReview {
    public static void main(String[] args) {
        //how to declare an array
        String [] a = new String [4]; //first way - you are not able to declare an array without a SIZE
        String a1 [] = new String [4]; //2nd way
        String [] a2 = {"a" , "b" , "c"};
        int [] a3 = {1, 5, 6};
        boolean [] isMarried = {true,false};

        //it means if you declare String array -> you need to put String into your array

        System.out.println( "//----------//");
        //re-assign the value in Array
        int []num = {1, 2, 3, 4};
        System.out.println(Arrays.toString(num)); //to print Array

        num [0] = 3;
        System.out.println(Arrays.toString(num)); //{3,2,3,4]

        int number = num [2]; //number is 3
        num [2] = num [3]; //[2] == 4
        System.out.println(Arrays.toString(num)); // [3, 2, 4, 4]

        num [3] = number;
        System.out.println(Arrays.toString(num)); //[3,2,4,3]

        System.out.println(" // ----  // ");

        String [] name = {"mj", "mohammad", "javad", "semati"};

        int size = name.length;

        String firstName = name [1];
        name [1] = name [3];
        System.out.println(Arrays.toString(name));
        name [2] = firstName;
        System.out.println(Arrays.toString(name));

        //---------------------//
        //String Array
        String []words = {"mj", "mohammad", "javad", "semati"};  //each index id s String by itself

        //words.substring(0,20; - we CANNOT do that because words is a String array, not a String only.
        //we can do this
        System.out.println(words[1].toUpperCase());
        System.out.println(Arrays.toString(words));

        words [2].substring(0,4); //java
        System.out.println(Arrays.toString(words));

        words[2] = words[2].substring(0,4);
        System.out.println(Arrays.toString(words));

        words[0] = ""+ words[0].charAt(1);
        System.out.println(words[0]); //==> j

//        char letter = words[0].charAt(1);
//        System.out.println(words[0]); // ==> out of bound


        //concatenating int with String

        String myName = "mj";
        int num3 = 12;

        myName= myName + num3; //mj12
        int num4 = 8;
        System.out.println(num3 + num4 + myName + num3 + num4); //20mj12128
        System.out.println( "-----");

        //Data type in String methods
        String [] sentence = {"my", "name", "is", "Mohammad", "!"}; //length = 5 - size of the array

        int sizeSentence = sentence.length; //5
        System.out.println(sentence [3].length()); //8 characters   ---String (input) ->length - int(output

        //int(input) ==> sustring ==> String(output)
        //int(input) ==> charAt ==> char(output)
        //String(input) ==> contains ==> boolean (output)
        //String(input) ==> startsWith ==> boolean (output)

        System.out.println(sentence[3].indexOf("hammad")); //2
        System.out.println(sentence[3].indexOf('Z'));  //-1   (not present, DOES NOT GIVE ERROR MSG, will compile!!!

        System.out.println("//-----//");

        int [] numArray = {1,2,3,4,5};

        for(int i=0; i< numArray.length-1;  i++){
            System.out.println(numArray [i+1] + " ");
        }
        System.out.println(Arrays.toString(numArray));
        //out of bound is different than ERROR

        System.out.println("mohammad");

        System.out.println("------");

        //BREAK, CONTINUE, RETURN
        //Continue means skip this round of the loop and go to the next one
        //Break - mean stop processing in the loop = then go out of the loop
        //Return - stop processing in main method -> go to the end of main method

        int []num5 = {1,2,3,4,5};

        for (int i=0; i<num5.length; i++){
            if(i==num5.length - 1){
                continue;
            }
            num5 [i]=num5[i+1];

        }
        System.out.println(Arrays.toString(num5));

        int []num6 = {1,2,3,4,5};

        int counter = 0;
        for(int i=0; i<num5.length; i++){
            if (i== 3){
                counter++;
                break;

            }
            counter++;
        }
        System.out.println(counter);

        System.out.println( "//-------//");

        //Reverse loop:

        String [] students = {"bahar", "shirin", "mohammad", "jonathan"};

        System.out.println(Arrays.toString(students));

        for(int i= students.length-1; i>=0; i--){   //false
            students [i] = students[students.length - 1 - i]; //4-1-3=0
        }

        System.out.println(Arrays.toString(students));

            String str="cybertek";
            for(int i=0; i<=8; i+=2){
                System.out.println(str.charAt(i));
            }



    }
}
