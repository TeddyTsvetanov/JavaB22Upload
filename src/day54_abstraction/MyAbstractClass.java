package day54_abstraction;

public abstract class MyAbstractClass {
//only one class can be public

    int num = 55;
    public void learn(){
        System.out.println("Learning...");
    }

    public abstract void close();
    //abstract method -> method with no implementation, just the signature.It only shows what a class can do, but not how
}


class Sub extends MyAbstractClass {
    public void close(){
        System.out.println("Close - abstract method implementation");
    }
}


class MyObjects{
    public static void main(String[] args) {
        //MyAbstractClass mac = new MyAbstractClass(); - can not create
        Sub sub = new Sub();
        sub.learn();


    }
}
