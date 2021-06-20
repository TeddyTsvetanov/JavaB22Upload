package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main (String [] args){
//        balance -> 345.55
//        price1 = 20.88
//        price2 = 89.99
//        price3 = 15.0
//        remainingBlance = (price1 + price2 + price 3)

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = (balance -(price1 + price2 + price3));


        System.out.println(remainingBalance);
        System.out.println(20.88+89.99+15);

        int balanceWithNoCents = (int) remainingBalance;
        System.out.println(balanceWithNoCents);
        System.out.println("Your remaining balance without cents: $" + balanceWithNoCents);



    }
}
