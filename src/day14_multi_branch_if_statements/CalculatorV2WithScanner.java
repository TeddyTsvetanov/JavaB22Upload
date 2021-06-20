package day14_multi_branch_if_statements;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class CalculatorV2WithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        System.out.println("Enter operator: + , - , * , /:");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator" + operator);
        }

    }
}


