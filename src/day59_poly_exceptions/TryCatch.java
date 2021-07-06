package day59_poly_exceptions;

public class TryCatch {
    public static void main(String[] args) {
        try{        //protected code
            System.out.println(10 / 2);
            System.out.println(10 / 0);  //need to handle the error - surround with try...catch
            System.out.println(10 / 3);  //line 8 will be skipped when printing in the console
        } catch(Exception e){
            //if we want line 8 printed (10/3) ne need to put it out of the try...catch
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first try catch");


        try{        //protected code
            System.out.println(10 / 2);
            System.out.println(10 / 5);
            System.out.println(10 / 3);
        } catch(Exception e){
            //because there is no error now, line 22-Runtime...will not be executed
            System.out.println("RuntimeException happened and handled");
        }
        System.out.println("After first try catch");


        int [] nums = {11,33,43};
        try{
            System.out.println(nums [0]);
            System.out.println(nums [3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException is caught and handled");
        }
        System.out.println("After array code");
    }
}
