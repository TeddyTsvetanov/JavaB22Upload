package day38_methods;

public class RecursiveMethod {
    // IQ - print numbers 1-100 without using loop
    public static void main(String[] args) {
        int num = 1;
        printNum(num);
    }

    public static void printNum (int num){
        System.out.print(num+ " ");
        num++;
        if(num<=100){
            printNum(num);
        }
    }
}
