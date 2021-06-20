package repl_it_practiceTeddy;
import java.util.*;

public class ArrayCountEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int evenNum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 ==0){
              evenNum++;
            }
        }
        System.out.println(evenNum);


    }
}
