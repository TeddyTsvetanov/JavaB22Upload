package general_practice;

public class ReturnStatements {
    public static void main(String[] args) {
        //create a function to cube a number

        int myNum = cube(3);
        System.out.println( cube(2) );
        System.out.println( myNum);
    }

    public static int cube(int numberToCube){
        System.out.println("top");
        return (numberToCube * numberToCube * numberToCube);
        //System.out.println("bottom"); //this code will never gonna get executed. Any code after the return statement will never be executed.

    }
}
