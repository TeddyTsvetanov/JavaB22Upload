package general_practice;

import java.util.*;

public class NonDuplicateArray {
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);

        int [] nums = { 1, 2,2, 3, 4, 3, 4};


        //TO do: Write your code below

        Arrays.sort(nums);
        for ( int each : nums ){
            System.out.print(each);
        }

        for(int i = 0; i < nums.length; i++){
            int count = 0;


            for(int eachNum : nums){
                if(eachNum == nums [i]) {
                    count++;
                }
            }
            System.out.println("");

            if(count == 1){
                System.out.println(nums[i]);
            }
        }

    }
}
