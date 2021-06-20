package day38_methods;

/**
 * start
 *     -> prints "start"
 *     continue();
 * continues
 *     -> prints "continue"
 *     end();
 * end -> prints "end"
 */

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();
    }

    public static void start() {
        System.out.println("start");
        continues();
    }
    public static void continues() {
        System.out.println("continue");
        end();
    }
    public static void end() {
        System.out.println("end");
    }
}
