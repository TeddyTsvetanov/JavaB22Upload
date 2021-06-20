package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //Equals () method - case sensitive
        System.out.println(city.equals ("Chicago"));
        System.out.println(city.equals ("chicago"));
        System.out.println(city.equals ("Chicago "));

        //Equals.IgnoreCase - Case Insensitive
        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase ("chicago"));
        System.out.println(city.equalsIgnoreCase ("Chicago "));
        System.out.println(city.equalsIgnoreCase ("Chicago1 "));
        System.out.println(city.equalsIgnoreCase ("ChiCago "));

        if (city.equals("CHICAGO)")) {
            System.out.println("equals () true");
        }else{
            System.out.println("equals () false");

        if (city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true");
        }else{
            System.out.println("");
            }


        }



    }

}
