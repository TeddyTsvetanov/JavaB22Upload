package repl_it_practiceTeddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithMJ {
    public static void main(String[] args) {
        //How to declare an ArrayList:

        ArrayList<String> myArray = new ArrayList<>();    //size = 0; capacity is 10
        ArrayList<String> myArray2 = new ArrayList<>();   //capacity 100, size =0
        System.out.println("myArray2.size()= " + myArray2.size());
        List<String> myArray3 = new ArrayList<>();

        //add some value directly to my ArrayList
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("nums = " + nums);

       // nums = Arrays.asList(2, 3, 4, 5, 6);
        System.out.println("nums = " + nums);

        List<Integer> nums1 = new ArrayList<>();
        nums1.addAll(Arrays.asList(6, 7, 8, 9));
        System.out.println("nums1 = " + nums1);

        nums.addAll(Arrays.asList(8, 9));
        System.out.println("nums = " + nums);

        //--------------------//
        //methods:
        //.add()

        nums.add(2);  //it means add number 2 to the end of my ArrayList
        System.out.println("nums = " + nums);
        System.out.println(nums.add(3));
        System.out.println("nums = " + nums);
        //not only add 3 at the end, but it will return true

        nums.add(3, 5);   //add 5 to index 3
        System.out.println("nums = " + nums);

        //System.out.println(nums.add(5,6));   //it doesn't return value, it is a void method

        //--------------------//
        //.get()

        nums.get(2);
        System.out.println(nums.get(2));

        //--------------------//
        // .remove() -- boolean method

        nums.remove(0); //it is going to remove the value of index 0
        System.out.println("nums = " + nums);
        System.out.println(nums.remove(1));  //it means this method not only remove 3, but also...
        //it will return the original value of index
        System.out.println("nums = " + nums);

        nums.remove("2"); //"2" == 0
        System.out.println(nums.remove("2")); //==> False
        System.out.println("nums = " + nums);

        ArrayList<String> words = new ArrayList<>(Arrays.asList("mj", "mohammad", "javad", "javad"));
        words.remove(1);
        System.out.println("words = " + words);
        words.remove("javad");
        System.out.println("words = " + words);
        words.remove("javad");
        System.out.println("words = " + words);

        System.out.println(words.remove("mj")); //
        System.out.println("words = " + words);
        //this method not only remove "mj" but also return true

        if(words.remove("mj")){
            System.out.println("hello guys");
        }else{
            System.out.println("hello folks");
        }

        //-------------------------//
        //isEmpty ==> return boolean
        System.out.println(words.isEmpty()); //

        //.contain() ==> return true or false if the value is contain or not
        words = new ArrayList<>(Arrays.asList("apple", "banana", "kiwi", "mango"));
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("mj", "mohammad", "javad", "semati"));
        System.out.println(words);

        System.out.println(words.contains("apple"));
        System.out.println(words.containsAll(words2));

        //----------------------------//
        //  .set() replace and update value at certain index:
        //this is method with two parameters (int, value)
        // and also it will return the original value of certain index
        System.out.println("------------");
        System.out.println(words.set(2, "orange"));  //kiwi
        System.out.println("words = " + words);

        ArrayList<Integer> num4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(num4.indexOf(2));  //1
        num4.set(num4.indexOf(2),10);
        System.out.println(num4);

        System.out.println(words);
        //System.out.println(words.indexOf("kiwi"));  //-1
        //System.out.println(words.set(words.indexOf("kiwi") , "grape"));  //out of bound exception

        words.set(words.indexOf("apple"), "kiwi");
        System.out.println(words);




    }
}
