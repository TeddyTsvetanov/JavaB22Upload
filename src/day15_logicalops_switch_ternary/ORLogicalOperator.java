package day15_logicalops_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 10;

        System.out.println(apples == 0 || oranges == 0);

        if (apples == 0 || oranges == 0) {
            System.out.println("We need to purchase some fruit");
        }else{
            System.out.println("We are good on fruits, no need to go shopping today");
        }
    }
}
