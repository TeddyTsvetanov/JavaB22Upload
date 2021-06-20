package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);   //TRUE
        System.out.println(true && false);  //false
        System.out.println(false && true);  //false
        System.out.println(false && false); //false

        System.out.println(10 > 5 && 1 == 1);   //true
        System.out.println(8 > 4 && 2 > 4);     //false
        System.out.println(3 < 2 && 5 > 2);     //false
        System.out.println(10 > 15 && 5 > 10);    //false

        int apples = 10;
        int oranges = 5;
        boolean check = apples > 5 && oranges > 3;
        System.out.println("check = " + check);

        if(apples > 6 && oranges >2) {
            System.out.println("I have enough apples and oranges");
        }else{
            System.out.println("I need to buy some fruits.");
        }
    }
}
