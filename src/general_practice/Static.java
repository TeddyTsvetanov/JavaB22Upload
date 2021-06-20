package general_practice;

import java.util.ArrayList;

public class Static {

    static String author = "jt";

    static {
        author = "BB";
    }

    public static void main(String[] args) {
        Static s = new Static();
        s.author = "CP";
        Static s2= new Static();
        System.out.println("Jordan: "+ s.author);
        System.out.println("Jordan: "+ s2.author);

        ArrayList<String> pillows = new ArrayList<>();
        pillows.size();
    }
}
