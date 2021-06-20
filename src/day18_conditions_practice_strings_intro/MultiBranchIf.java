package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
       //number =>5;

        int number = 5;

        if(number > 0){
            System.out.println("Number " + number + " is positive");
        }else if (number < 0){
            System.out.println("Number " + number + " is negative");
        }else{
            System.out.println("Number " + number + " is 0");
        }
    }
}
