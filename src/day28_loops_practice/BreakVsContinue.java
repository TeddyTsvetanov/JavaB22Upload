package day28_loops_practice;

public class BreakVsContinue {
    public static void main(String[] args) {
        //BREAK STATEMENT
       // for(int n=1; n<=7; n++){
//            System.out.println(n);
//            break;


        for(int i = 1; i <= 5; i++) {
            if(i == 2 || i == 4) {
                continue; //goto next iteration. skip the code below
            }
            System.out.print(i);

        }
        System.out.println();
        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println("numbers" + i);
        }

        System.out.println();
        for (int i = 0; i < 10; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println("Even numbers" + i);
        }


    }

}

