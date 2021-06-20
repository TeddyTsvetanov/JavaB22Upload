package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String name = "Teodora";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println("The name Teodora has " +name.length() + " characters");

        System.out.println("wooden spoon");
        System.out.println("wooden spoon".length());

        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());

        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";
         //*IF STATEMENT - AMAZON PASSWORD

        if (password.length() >=6){
            System.out.println("Valid Amazon password");
        }else{
            System.out.println("Passwords must be at least 6 characters");


        }

    }
}
