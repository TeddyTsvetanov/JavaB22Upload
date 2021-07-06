package day59_poly_exceptions;

import java.util.EmptyStackException;

public class SwallowingException {


    public static void main(String[] args) {
        try{
            System.out.println("hello");
            System.out.println(5/0);
        }catch(Exception ignore){}

        System.out.println("How are you today?");
        System.out.println("We just suppressed/swallowed the Runtime Exception");
        System.out.println("Error is not reported, we just ignored it and nobody knows about it");


        //from Andrey Chetvertakov
        try {
            throw new EmptyStackException();
        }catch(EmptyStackException pew){
            System.out.println("Caught EmptyStackException");
        }
        System.out.println("it worked!");



    }
}
