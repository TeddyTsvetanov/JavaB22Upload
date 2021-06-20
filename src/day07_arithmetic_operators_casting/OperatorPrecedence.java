package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main (String[] args){
        System.out.println(2+5*3); //umnojenieto ima predimstvo v Java nad subiraneto
        System.out.println((2+5)*3); // po red otliavo nadiasno
        System.out.println(10+5-3);
        System.out.println(0/10);
        System.out.println(10/5);

        System.out.println(5/2);
        System.out.println(10/3);
        System.out.println(10.0/3.0);   //3.333333335
        System.out.println(5.0/2.0);   //2.5



    }
}
