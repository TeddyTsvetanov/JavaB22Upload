package day43_list_custom_classes;
//firstName, age
public class Person {
    //data - variables
    String firstName;   //2 variables in the class Person
    int age;
    char gender;
    //methods
    public void speak(){
        //void doesn't return value
        System.out.println( "Person is speaking");
    }


}

class People{
    public static void main(String[] args) {
        //create object of Person class
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        //behaviour of the class, because we didn't type static above
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);


        Person person2 = new Person ();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstName= " + person1.firstName);
        System.out.println("person2.firstName= " + person2.firstName);
    }
}
