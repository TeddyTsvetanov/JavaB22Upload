package day54_abstraction;

/**
 * we add abstract keyword to a class to make it an abstract class.
 * We cannot create object of Student class - meaning:
 *      Student student = new Student();
 * What can we do with this Student class? We can extend this class by sub classes
 * Student class will be Parent class for all other types of student related classes
 */

public abstract class Student {
    public void code(String language){
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();  // showing what it can do, but not how
}


