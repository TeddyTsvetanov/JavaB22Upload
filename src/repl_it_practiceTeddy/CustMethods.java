package repl_it_practiceTeddy;
import java.util.*;

public class CustMethods {
    public static void main(String[] args) {
        plus();

    }

    public static void plus(){
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println ("enter first number:");
        System.out.println ("enter second number:");


        System.out.println(num1 + num2);
    }


}
