package day61_exceptions;

public class CustomInsufficientBalanceExceptionTest {
    public static void main(String[] args) {
        double balance = 400;
        double price = 500;
        System.out.println("I have $" + balance + " and purchasing item for $ " + price);

        if(price > balance){
            throw new InsufficientBalanceException("Purchase declined.Insufficient funds");
        }
        System.out.println("Item purchased successfully");
    }


}
