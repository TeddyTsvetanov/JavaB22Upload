package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        //if company contains space, print "multiple words company name"
        //else "Signle word company name

        if(company.contains(" ")) {
            System.out.println("Multiple words company name");
        }else{
            System.out.println("Single word company name");
        }

        String etsyTitle = "wooden spoon | Etsy";

    }
}
