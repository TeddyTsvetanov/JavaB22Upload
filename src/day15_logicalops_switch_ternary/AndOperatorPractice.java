package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = false;
        String itemName = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Add to my cart");
        }else{
            System.out.println("Continue shopping for good deals on -" + itemName);
        }


        if (onSale && freeShipping && itemName.equals ("Wooden spoon")) {
            System.out.println("Add to my cart");
        }else{
            System.out.println("Continue shopping for good deals on -" + itemName);
        }


    }
}
