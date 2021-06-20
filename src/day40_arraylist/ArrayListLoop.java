package day40_arraylist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();   //Polymorphic way ot declaring
        System.out.println(nums);  //we get empty [], not 0s, not nulls, just empty
        System.out.println("size = " + nums.size());   //size = 0
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);

        //nums.remove(88); -> it will think to remove index 88 -> IndexOutOfBoundException
        nums.remove(new Integer(88));  //this means that it needs to remove the value of 88, not the 88th index
        System.out.println(nums);  //[44, 3, 500, 5, 845, 0, 500, 5, 845, 0]

        nums.remove(new Integer(5));
        System.out.println("nums = " + nums);       //nums = [44, 3, 500, 845, 0, 500, 5, 845, 0] - it removes the first one found

        //for loop - iterate through all values and print
        for(int i=0; i< nums.size(); i++) {         //not nums.length(this is for array)
            System.out.println(nums.get(i));   //not (nums[i]) only - this is for array
        }

        //for each loop, and print all in same line
        for(int each: nums){    //or we can do Integer each
            System.out.print(each + " ");       //44 3 500 845 0 500 5 845 0
        }





    }
}
