package general_practice;

public class Methods {
    public static void main(String[] args) {
        System.out.println("top");
            String myName = "Mike";
            sayHi(myName, 47);
//            sayHi("Dave");
//            sayHi("Phyllys");
//            sayHi("Angela");
        System.out.println("bottom");
    }

    public static void sayHi(String name, int age){
        System.out.println("Hello " + name + " you are "  + age + "years old.");

    }
}
