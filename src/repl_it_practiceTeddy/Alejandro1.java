package repl_it_practiceTeddy;
import java.util.*;

public class Alejandro1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if(a.contains("dear alejandro.....a lot of text") || a.contains("subject : important project, alejandro we refer to you  this ....")){
            System.out.println("read");
        }else{
            System.out.println("don't read");
        }


    }
}
