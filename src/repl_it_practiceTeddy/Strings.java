package repl_it_practiceTeddy;

public class Strings {
    public static void main(String[] args) {
        String w1 = new String("HELLO");
        String w2 = new String(w1); //w1; // new String("HELLO");
        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));

        String word = "HELLO";
        System.out.println(word.indexOf("He"));

        String  s ="hello:world";
        String sb = s.substring(2);
        System.out.println(sb);
        System.out.println(s.indexOf(":"));

        String h = "";
    }
}
