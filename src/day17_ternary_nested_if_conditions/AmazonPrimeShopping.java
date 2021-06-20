package day17_ternary_nested_if_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30;
        boolean isPrimeMember = true;

//        when isPrimeMember is true
//            print "Eligible for free 2 day shipping"
//
//            otherwise
//                    when itemPrice is more than 25
//            print "Eligible for free regular shipping"
//            otherwise "Not eligible for free shipping.Fee is $10"

        if(isPrimeMember){
            System.out.println("Eligible for free 2 day shipping");
        }else{
            if(itemPrice>= 25.0){
                System.out.println("Eligible for free regular shipping");
            }else{
                System.out.println("Not eligible for free shipping.Fee is $10");
            }
        }



    }
}
