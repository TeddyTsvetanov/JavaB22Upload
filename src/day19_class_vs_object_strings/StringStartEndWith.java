package day19_class_vs_object_strings;

public class StringStartEndWith {
    public static void main(String[] args) {
        String word = "vacation";
        System.out.println(word.startsWith("ion"));
        System.out.println(word.endsWith("ion"));
        System.out.println("java".startsWith("j"));
        System.out.println(word.startsWith("Vac"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("May be it is a female name");
        }else{
            System.out.println("It is a male's name");
        }

        /**
         * Mr - Man
         * Dr - Doctor
         * Mrs. - Married Woman
         * Ms - Single Woman
         * Sr. - Senior
         */


        String firstName = "Dr. Nadir";


        if(firstName.startsWith("Mr")) {
            System.out.println("Man");
        }else if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs")) {
            System.out.println("Married Woman");
        }else if (firstName.startsWith("Ms")){
            System.out.println("Single woman");
        }else if (firstName.startsWith("Sr")){
            System.out.println("Senior");
        }else{
            System.out.println("Invalid abbreviation");
        }
        }

        /**
         * String url = https://www.stackoverflow.com
         * .com - commerce
         * .ru - russian web site
         * .gov - government
         * .edu - education
         * .org - organization
         */

        String url = "https://www.stim.com";




    }

