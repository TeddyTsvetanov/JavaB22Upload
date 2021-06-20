package day43_list_custom_classes;

public class Employee {
    //instance/object variables
    String name;
    String jobTitle;

    //instance method - this method will be used by the objects in the class
    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }

}
