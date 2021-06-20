package general_practice.family;

public class Child extends Person{
    private boolean hasBicycle;

    public Child(String name, int age){
        super(name, age);
    }

    public Child(String name, int age, boolean hasBicycle){
        super(name, age);
        this.hasBicycle = hasBicycle;
    }

    public void sethasBicycle(boolean hasBicycle){
        this.hasBicycle = hasBicycle ;
    }

    public boolean gethasBicycle(){
        return hasBicycle;
    }

    protected String getType(){
        return "Child";
    }

//    @Override
//    public String toString() {
//        return "Child{" +
//                "hasBicycle=" + hasBicycle +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

}
