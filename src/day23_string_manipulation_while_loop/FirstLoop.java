package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i <= 15){
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 3){
            System.out.println("apple ->" + apples++);
        }
        System.out.println("apples = " + apples);           //4
    }
}
