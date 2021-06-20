package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5,48,3,543,90};

        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int [] {23,65,45,87,98,564,12});  //if we want to do it in 1 line

        System.out.println("sum = " + ArrayUtils.sum(nums));
    }
}
