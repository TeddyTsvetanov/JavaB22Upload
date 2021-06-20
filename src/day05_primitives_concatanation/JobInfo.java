package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args) {
        String title = "Java SDET";
        String company = "Palo Alot Networks";
        String jobDescription = "Experience in Java, Selenium, Cucumber, JMeter";
        double salary = 123000;
        byte yearsExp = 3;
        boolean hasBenefits = true;

        System.out.println("Title: " + title);   //"Java SDET"
        System.out.println("Company: " + company);   //"Palo Alot Networks"
        System.out.println("JobDescription: " + jobDescription);   //"Experience in Java, Selenium, Cucumber, JMeter"
        System.out.println("Salary: $" + salary);   //123000.0
        System.out.println("YearsExp: " + yearsExp);   //3
        System.out.println("Has benefits? " + hasBenefits);   //true

    }

}
