package repl_it_practiceTeddy;
import java.util.Scanner;

public class SimpleJavaCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("****SIMPLE JAVA CALCULATOR****");
        System.out.println("Please Enter your first Number");
        int num1 = scan.nextInt();
        System.out.println("Please Enter your second Number");
        int num2 = scan.nextInt();

        System.out.println("What would you like to do? Please enter: + - * /" );
        String operation = scan.next();

        if (operation.equals("+")){
            System.out.println(add(num1,num2));
        }
        if (operation.equals("-")){
            System.out.println(sub(num1,num2));
        }
        if (operation.equals("*")){
            System.out.println(mult(num1,num2));
        }
        if (operation.equals("/")){
            System.out.println(div(num1,num2));
        }





    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mult(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        return num1 / num2;
    }
}
