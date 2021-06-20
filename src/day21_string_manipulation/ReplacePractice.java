package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());    //GITHUB
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word = " + word);

        word = word.replace ("hub", "lab");
        System.out.println("word = "+word);

        //gitlab
        //i->o   a->i  - gotlib
        System.out.println(word.replace('i','o'));

        String result = "1-48 of over 4,000 results for java book";
                //result = 4000
        result=result.replace("1-48 of over ", "").replace(",", "").replace(" results for java book", "");
        System.out.println(result);




    }
}
