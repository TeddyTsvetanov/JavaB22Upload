package day13_conditional_statements;

import java.lang.management.ManagementFactory;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

//        if (isHungry == true) {
        if(isHungry){
            System.out.println("I am hungry. I will go get something to eat.");
            System.out.println("Then code java.");

        }else{
            System.out.println("I am not hungry, let's keep coding java.");
        }


        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        boolean isAff;

        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("I can afford it, let's buy!");
        } else {
            System.out.println("Too expensive, let's keep coding java");
        }


        boolean isRemoteJob = true;
        if (isRemoteJob != true) {
            System.out.println("Sorry, I am not interested.");
        }else{
            System.out.println("Sure, I am interested, what is the interview process");
        }
    }
}
