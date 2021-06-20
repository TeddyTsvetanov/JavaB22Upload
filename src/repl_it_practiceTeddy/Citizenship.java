package repl_it_practiceTeddy;

import java.util.Scanner;

public class Citizenship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String citizenship = "USA"; // next()
       // scanner.next()
        boolean resident = true; // nextBoolean()

        if(citizenship.equalsIgnoreCase("USA") || resident) {
            int age = 18; // nextInt()
            scanner.nextInt();
            if(age >= 18 && age <= 35) {
                boolean hasDiploma = true; // nextBoolean()
                if(hasDiploma) {
                    System.out.println("You are qualified for the US Army");
                } else {
                    "".equals("");
                    boolean t = "" == "";
                    System.out.println("You must have a high school diploma");
                }

            } else {
                System.out.println("Your age must be between 18 to 35 years old");
            }

        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }
    }
}
