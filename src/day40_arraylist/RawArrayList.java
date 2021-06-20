package day40_arraylist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        //Declare raw arraylist
        ArrayList list1 = new ArrayList();  //standard way
        List list2 = new ArrayList();       //polymorpjic way - more popular

        //add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);
        list1.add("wooden spoon");
        //when it is raw type it is not limited to one datatype. Here we have MANY

        System.out.println(list1);
        System.out.println();


    }
}
