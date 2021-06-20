package day40b_ReviewClass;
import java.util.*;

public class MergeStrings{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String one=scan.nextLine();
        String two=scan.nextLine();

        if(two.length()>one.length()){
            for (int i = 0; i < one.length(); i++) {
                System.out.print(""+one.charAt(i)+two.charAt(i));
            }
            System.out.println(two.substring(one.length()));
        }else if(one.length()>two.length()){
            for (int j = 0; j < two.length(); j++) {
                System.out.print(""+one.charAt(j)+two.charAt(j));
            }
            System.out.println(one.substring(two.length()));
        }else{
            for (int i = 0; i < one.length(); i++) {
                System.out.print(""+one.charAt(i)+two.charAt(i));
            }
        }
    }
}
