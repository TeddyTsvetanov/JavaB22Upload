package day61_exceptions;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){

    }

    //add constructor
    public ElementaryStudent(String name, int age){
        //this.name = name;
        //this.age = age;
        //need to setName and setAge in order to implement conditions from setters
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //check if name is null first, otherwise we might get nullpointer exception
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty or null");
        }  //may put else but may not, you can also put more conditions (if name is all numbers(check with a loop), or starts with number)

        //if the above condition is true, the below will not be executed anyways
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 5 || age > 12) {
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
