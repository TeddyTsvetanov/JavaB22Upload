package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {
        fullName();   //Mike Smith
        //                                  Mike Smith
        System.out.println("Full name = " + fullName());
        isMarried();
        getAge();
        System.out.println(fullName() + " is " + getAge() + "years old and is married: " + isMarried());

        System.out.println("Birth year = "+ getRandomYear());  //dynamic - different year each time

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("not married");
        }

    }

    public static String fullName(){
        //System.out.println("inside fullName method");
        return "Mike Smith";  //always the same, not dynamic
    }

    public static boolean isMarried(){
        return false;
    }

    public static int getAge(){
        int age = 35;
        return age;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
