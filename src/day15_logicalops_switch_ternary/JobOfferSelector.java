package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Chicago";
        double salary = 80000;
        boolean isRemote = true;
        boolean areBenefits = true;

        if(location.equals("Chicago") && salary >= salary && isRemote && areBenefits) {
            System.out.println("I will accept this offer");
        }else{
            System.out.println("Let me think about it");
        }
    }
}

