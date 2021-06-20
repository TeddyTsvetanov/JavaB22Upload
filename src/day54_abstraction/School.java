package day54_abstraction;

public class School {
    public static void main(String[] args) {

      //  new Student = new Student(); - ERROR - Cannot create object of Student

        OnlineStudent onlineStudent = new OnlineStudent(); //works because Online student is not from Abstract class
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();


    }
}
