package day50_inheritance.Person1;
/**
 * Sub class
 * Child class
 * Derived class
 */
public class Teacher extends Person {

    int teacherID;

    public void teach (String topic){
        System.out.println("Teacher is teaching " + topic);
    }
}
