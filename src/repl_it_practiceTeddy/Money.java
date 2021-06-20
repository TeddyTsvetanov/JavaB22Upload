package repl_it_practiceTeddy;
import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cents:");
        int item=scan.nextInt();
        if(item>0&&item<100){
            int quarters=(item/25);
            int dimes=(item%25)/10;
            int nickels=item%10/5;
            int pennies=item%5/1;
            System.out.println("Your change is "+ quarters+" quarters, "+dimes+" dimes "+nickels+" nickels, and "+pennies+" pennies");
        }else{
            System.out.println("Invalid cents amount");
        }
    }
}

