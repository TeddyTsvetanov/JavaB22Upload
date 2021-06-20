package day17_ternary_nested_if_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        // selection = drink or can be snack
        //drink - tea, coke
        //snack - chips, candy
        //when selection is drink - "drink option is selected"
        // (when tea - "tea is selected"; when coke - "coke is selected")
        //when selection is snack - "snack option is selected:
        //(when chips - "chips is selected"; when candy - "candy is selected")

        String selection = "drink";
        String drinkItem = "tea";
        String snackItem = "chips";

        if (selection.equals ("drink")) {
            System.out.println( "Drink option is selected");
            if (drinkItem.equals("tea")) {
                System.out.println("DrinkItem Tea is selected");
            }else{
                System.out.println("DrinkItem Coke is selected");
            }
        }else if (selection.equals("snack")) {
            System.out.println( "SnackItem is selected");
            if (snackItem.equals("chips")){
                System.out.println("snackItem chips is selected");
            }else{
                System.out.println("SnackItem candy is selected");
            }
        }

    }
}
