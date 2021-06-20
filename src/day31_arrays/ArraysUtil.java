package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {

        //print all nums in same line
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33 };

        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        //Arrays.sort(nums,Collections.reverseOrder());

        String [] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join (", ", words) + "]");

        //sort words in Alphabetical and ASCII table order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());

        System.out.println(Arrays.toString(words));

    }
}
