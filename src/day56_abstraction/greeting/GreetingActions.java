package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        System.out.println("----------------");
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        System.out.println("----------------");
        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        System.out.println("----------------");
        gt = new Japanese();
        gt.hi();
        gt.bye();
    }
}
