package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();
        System.out.println("----------------");
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
    }
}
