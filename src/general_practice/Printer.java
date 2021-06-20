package general_practice;

public class Printer {

    private String text;

    public Printer(String text){
        this.text=text;
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public void print() {
        System.out.println(text);
    }


}
