package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        //multiples of three print "Fizz" instead of the number and for the multiples of 5 print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
       // multiBranch if statement
//        FizzBuzz - if number is divisible by 3 and (&&) by 5 at the same time
//        Fizz - if number is divisible by 3
//        Buzz - if number is divisible by 5
//        otherwise - the number itself



        int number = 9;
        if (number % 3 ==0 && number %5 == 0) {
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0) {
            System.out.println("Fizz");
        }else{
            System.out.println("Buzz");
        }

    }
}
