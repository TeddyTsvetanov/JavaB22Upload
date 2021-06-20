package general_practice.family;

public class MainDriver {
    public static void main(String[] args) {

        Parent parent1 = new Parent("Melody", 40);

        Child child1 = new Child("Sarah", 10);

        Child child2 = new Child("Penny", 12);
        child2.sethasBicycle(true);

        Child child3 = new Child("John", 5, false);
        System.out.println(child3.toString());

        parent1.addChild(child1);
        parent1.addChild(child2);
        parent1.addChild(child3);

//        for( Child child : parent1.getChildren()){
//
//        }

        for( int i = 0; i < parent1.getChildren().size(); i++ ){
            System.out.println(parent1.getChildren().get(i));
        }

        int age = parent1.getChildren().get(0).age;
        System.out.println(age);
        System.out.println(child2.gethasBicycle());
    }
}
