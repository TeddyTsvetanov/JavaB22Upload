package day59_poly_exceptions;

/**
 * RunTimeException happens in below code at line 10/0 -> Arithmetic Exception (can not divide by 0
 */

public class RuntimeErrorException {
    public static void main(String[] args) {
        System.out.println(10 / 2);
        System.out.println(10 / 0);
        System.out.println(10 / 3);

    }
}
