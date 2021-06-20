package repl_it_practiceTeddy.instanceMethod;

public class Person {
    String name;
    int age;
    char gender;
    String job;

    public void run(){
        System.out.println("running");
    }

    public void swim(){
        System.out.println("swimming");
    }

    public void bike(){
        System.out.println("biking");
    }

    public int burnCalory(){
        System.out.println((name + "is running 1 mile"));
        return 10;
    }

    public int burnCaloryPerMile(int mileCount){
        System.out.println(name + "is running" + mileCount + "mile");
        return 10 * mileCount;
    }
}
