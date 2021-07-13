package day61_exceptions.checked_exceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");

        /**
         * Thread.sleep(1000); - causes an InterruptedException, which is a checked exception
         * WE ARE HANDLING IT BELOW using try/catch
         */
        try {
            //sleep in underlined but there is no error in syntax
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //this is how we print the error and prints ONLY when exception happens
        }


        /**
         * Second way of handling - DECLARING USING THROW KEYWORD (up in the main method, using THROWS keyword
         */
        Thread.sleep(5000);
        System.out.println("Woke up after 10 seconds");
    }
}
