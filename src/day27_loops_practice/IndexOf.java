package day27_loops_practice;

public class IndexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'b';
        int index = -1;
        for(int n = 0; n < word.length(); n++){
            //System.out.println(n+ " - " + word.charAt(n));
            if(word.charAt(n) == letter){
                index = n;
                System.out.println(letter + " is found at index" + index);
                break; //exit for loop - can use RETURN as well but it is more powerful and will exit the main method, not only the for loop
            }
        }

        if(index == -1){
            System.out.println(letter + " is not present");
        }



    }
}