package day61_exceptions.errors;

import java.util.ArrayList;
import java.util.List;

/**
 * Normally, we should not catch ERROR like below,
 * instead, we should make the code as buggy, and fix it to prevent errors like this.
 */

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverflowError

        try{
            myMethod();
        }catch(StackOverflowError error) {
            System.out.println("StackOverflowError happened");
        }
        System.out.println("---AFTER ERROR---");

        //OutOfMemoryError
        //normally we don't handle this type of errors
        List<Integer> nums = new ArrayList<>();
        while(true){
            nums.add(100);
        }
    }


    static int counter = 0;

    public static void myMethod(){
        System.out.println(counter ++);
        myMethod();
    }

}

