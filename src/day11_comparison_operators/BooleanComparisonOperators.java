package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
//        System.out.println(10==10);
//        System.out.println("10==10");
//        System.out.println(1000>100);
//        System.out.println(985.44<98547.8);
//        System.out.println(10 <= 9);
//        System.out.println(10 <= 10);

        int a = 100;
        int b = 200;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a != b);

        boolean result;
        result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 88 < 99;
        System.out.println("result = " + result);

        result = 10 >=10;
        System.out.println("result = " + result);

        result = 123 <= 124;
        System.out.println("result = " + result);

        result = 2 !=2;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city = "Baku");
        System.out.println(city != "Fairfax");

        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);

        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);
//
//        int n1 = 5;
//        int n2 = 3;
////        n1 == n2
//        System.out.println(n1 == n2);
//
//        boolean check = n1 ==n2;
//        System.out.println(check);
    }
}
