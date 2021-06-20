package day40_arraylist;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer>nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java") - ERROR - Integer type - not a raw one
        System.out.println("size = " + nums.size());    //3 (items)

        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));     //index 0 = 5
        System.out.println("index 1 = " + nums.get(1));     //index 1 = 7
        System.out.println("index 2 = " + nums.get(2));     //index 2 = 11
//        System.out.println("index 2 = " + nums.get(3));     //Out of Bound exception - there is no 3

        //print all values in same line:
        System.out.println(nums);   //Arrays.toString(numArray) - [5,7,11]

        nums.remove(1);     //remove element at index 1
        System.out.println(nums);   //[5,11] - 7 is missing already



    }
}
