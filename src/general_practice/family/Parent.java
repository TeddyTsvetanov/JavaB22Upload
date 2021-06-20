package general_practice.family;

import java.util.ArrayList;

public class Parent extends Person{

    ArrayList<Child> children = new ArrayList<>();

    public Parent(String name, int age){
        super(name, age);
    }

    public void addChild(Child child){
        children.add(child);
    }

    public ArrayList<Child> getChildren() {
        return children;
    }


}
