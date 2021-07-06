package general_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * create an int array called numbers that has length of 100
 * Assign 1-100 to each index of the array.
 * Then use for each loop to print out all the elements of the array
 */
public class ArrayOneToOneHundred {
    public static void main(String[] args) {
//        int [] numbers = new int[100];
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print((numbers[i] = i+1) + "\t");
//        }

//        System.out.println("*****");
//        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
//
//        for (int num : numbers) {
//            System.out.print(num +"\t");
//        }

        int[] numbers = new int[100];
        for (int i = 0; i <=numbers.length - 1; i++){
            numbers[i] = i + 1;
        }
        for (int i : numbers) {
            System.out.print(i + " ");
        }
    }
}
