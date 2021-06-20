package day04_variables_intro;

public class VariableNamingRules {
    public static void main (String[] args){
        //int static = 22;  -> error, static is reserved keyword by Java
        int static2 = 22;
        int _static = 22;
        int $static = 44;
        int staticVar = 234;

        int salary$ = 55;
        //int 1stMonthSalary = 3000; -> error, can not start with number
        int $ = 10;  //fine but not encouraged to use as single characted
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fine, but not recommended. We should be using meaningful variable names.

        //int number-of-friends = 400; ERROR
        int numberOfFriends = 400;
        numberOfFriends = 301;
        int number_of_friends = 401; //- not convention


    }
}
