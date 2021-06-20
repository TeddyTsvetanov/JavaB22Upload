package day28_loops_practice;

public class FindUniqueChars {
    public static void main(String[] args) {
        /** Given a string retrieve and print only unique characters
         *
         */

        String word = "javva";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contains in unique
            //add to unique
            if(!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
            }
        }

    }
}
