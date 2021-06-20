package day54_abstraction;

public class Pizza extends MenuItem {


    @Override
    public void prepare() {
        System.out.println("Spread dough, throw ingredients, bake");
    }

    @Override
    public void serve() {
        System.out.println("Serve in a plate with a fork and knife");
    }
}
