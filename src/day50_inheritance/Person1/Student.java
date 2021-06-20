package day50_inheritance.Person1;

public class Student extends Person {

    //Student IS-A Person

        String topic = "Inheritance";
        String schoolName = "Cybertek";

        public void study(){
            System.out.println(schoolName + "students today are studying " + topic);
    }
}
