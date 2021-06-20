package repl_it_practiceTeddy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /**
         * Remove Duplicate in Repl.it
         *
         */

        String word = "mohammad";
        System.out.println(nonDup(word));

    }

    public static String nonDup (String name){
        String output = "";
        for(int i=0; i< name.length(); i++){
            //mohammad
            //01234567
            //charAt(i) because "contains" is only for String
            if(!output.contains("" + name.charAt(i))){
                output += name.charAt(i);   //moha
            }
        }

        return output;   //mohad

    }
}
