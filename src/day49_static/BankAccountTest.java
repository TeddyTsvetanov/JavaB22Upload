package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "husband";
        husband.showBalance();  //500
        husband.spend(100.0);
        husband.showBalance();  //400

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();  //400  //if we remove the static word then each husband and wife will have 500$ separately and the balance here will show $500, not $400
        wife.spend(400);
        wife.showBalance();

        husband.showBalance();
        System.out.println(BankAccount.balance);
    }
}
