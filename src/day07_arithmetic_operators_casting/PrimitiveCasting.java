package day07_arithmetic_operators_casting;

import java.util.Scanner;

public class PrimitiveCasting {
    public static void main(String[] args){
        int num1 = 100;
        byte b1 = (byte) num1;
        short shNum1 = (short) num1;
        long lNum1 = num1;

        System.out.println(num1);     //num1:100
        System.out.println(b1);
        System.out.println(shNum1);
        System.out.println(lNum1);

        new Scanner(System.in).nextLine();

    }


}
