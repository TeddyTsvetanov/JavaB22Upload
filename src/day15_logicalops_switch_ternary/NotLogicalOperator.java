package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " +(!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        if (!(age > 7)){
            System.out.println("Need to sit in child car seat. Age = " + age);
        }else{
            System.out.println("Can sit is passenger seat. Age = " + age);
        }

        if(true) {

            int a = 6;
            int b =7;
            int c = 6 & 7;
            System.out.println("Jordan: " + c);

        }

        if(true && false) {

        }

        boolean isSmokingAllowed = true;
        //if smoking is not allowed: Print "Smoking is NOT allowed here.Exit"
        if(!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }else{
            System.out.println("This is the smoking area");
        }

        boolean isAffordable = true;

    }
}
