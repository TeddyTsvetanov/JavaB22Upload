package day10_shorthand_operators;

import javax.lang.model.SourceVersion;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);
        balance = balance - kenafa;
        System.out.println("balance = " + balance);

        kenafa = kenafa*0.5;
        System.out.println("kenafa = " + kenafa);

        balance = balance - kenafa;
        System.out.println("balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);

        balance = balance - plov;
        System.out.println("balance = " + balance);

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //buy 4 icedTeas and decrease balance
        balance = balance - icedTea * 4;
        System.out.println("balance = " + balance);

        //return baklava
        balance = balance + baklava;
        System.out.println("balance after returning baklava = " + balance);


    }
}
