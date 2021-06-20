package day43_list_custom_classes;

public class Company {
    /**
     *add 3 objects of employee class
     */
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Onurcan Dogru";
        emp1.jobTitle = "SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Rahib Heydarov";
        emp2.jobTitle = "Full stack developer";
        emp2.work();

        Employee emp3 = new Employee();
        emp3.name = "Teddy";
        emp3.jobTitle = "Scrum Master";
        emp3.work();
    }


}
