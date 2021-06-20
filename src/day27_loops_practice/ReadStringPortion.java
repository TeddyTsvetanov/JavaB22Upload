package day27_loops_practice;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list = "cat,car,cat,red_car,java,selenium";

        for(int i=0; i< list.length()-2; i++){
            System.out.println(list.substring(i, i+3));
            //if statement, if list.substring(i, i+3) equals "cat" or "car" -> print "cat or car found"
            if(list.substring(i, i+3).equals("cat") || list.substring(i, i+3).equals("car")){
                System.out.println("cat or car found");
            }

        }
    }
}
