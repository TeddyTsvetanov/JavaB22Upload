package general_practice.family;

public class Person {
    protected String name;
    protected int age;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected static void eat(){

    }

    protected String getType(){
        return "Person";
    }

    @Override
    public String toString() {
        return getType() + " {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
