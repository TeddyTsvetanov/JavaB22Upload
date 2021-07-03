package day58_polymorphism.online_shopping;

public class Amazon extends OnlineShopping implements Prime{


    @Override
    public void buy() {

    }

    @Override
    public void sell() {

    }

    @Override
    public void primeShipping() {
        System.out.println("Free-2day shipping for prime users");
    }
}
