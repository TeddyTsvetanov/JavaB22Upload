package repl_it_practiceTeddy;

public class WithoutX {
    public static void main(String[] args) {
/**
 * Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
 *
 * Example:
 *
 * input: xHiX
 *
 * output: Hi
 * input: xHiX
 *
 * output: Hi
 * input: apple
 *
 * output: apple
 * copied!
 * input: apple
 *
 * output: apple
 * input: xUxL
 *
 * output: UxL
 * input: xUxL
 *
 * output: UxL
 * input: JavaX
 *
 * output: Java
 */
        String word = "Milk";
        String str = "";

        if(word.startsWith("x") && word.endsWith("X")){
            str += word.substring(1,word.length()-1);

        }else if(word.startsWith("x")){
            str += word.substring(1,word.length());

        }else if(word.endsWith("X")) {
            str += word.substring(0, word.length() - 1);
        }else{
            System.out.println(word);
        }

        System.out.println(str);

    }
}
