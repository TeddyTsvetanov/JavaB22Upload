package day38_methods;

/**
 * add new method:
 * name: isPalidrome
 * params: String str
 * return: boolean
 *
 * returns true if palindrome or false if not
 */

public class StringUtilTest {


    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for(int i=0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i>=0; i--){
            reversed += str.charAt(i);

        }
        return reversed;

    }
}
