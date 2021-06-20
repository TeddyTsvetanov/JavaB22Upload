package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {


        String jobTitle = "";
        System.out.println(jobTitle.equals(""));
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() ==0);

        if(jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("JobTitle looks good");
        }


        String veggie = "carrots";
        if(!veggie.isEmpty()){
            System.out.println("We have carrots");

        }




    }
}
