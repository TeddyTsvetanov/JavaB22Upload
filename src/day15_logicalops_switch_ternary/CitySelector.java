package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

        if(city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering " + city);
        }


        String teacher = "Saim";
        //Saim OR Murodil - it is a java class with Saim
        //otherwise -> Soft skills with Nadir

        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        }else{
            System.out.println("Soft skills class with Nadir ");
        }

        //1 - teacher Saim or Murodil - it is java class
        //2 - teacher Nadir -> Soft skill class with
        //any other teacher - some class with Gurhan/Akbar

        String teacher1 = "Murodil";

        if (teacher.equals ("Saim") || teacher.equals ("Murodil")) {
            System.out.println("It is java class");
        }else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher1);
        }else{
            System.out.println("Some class with " + teacher1);
        }


        //company - "Google" OR salary >= 100k -> accept offer

        String company = "Google";
        double salary = 85_000.0;

        if (company.equals("Google") || salary >= 100_000.00) {
            System.out.println("I will accept this offer");
        }else{
            System.out.println("I am not considering this offer");
        }



    }
}
