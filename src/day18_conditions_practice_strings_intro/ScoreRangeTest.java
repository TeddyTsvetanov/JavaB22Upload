package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 95;

        if (score >=1 && score <= 40) {
            System.out.println("Grade is D");
        }else if (score >=41 && score <= 60) {
            System.out.println("Grade is C");
        }else if (score >=61 && score <=90) {
            System.out.println("Grade is B");
        }else if (score >=91 && score <= 100) {
            System.out.println("Grade A");
        }else if (score == 0 || score > 100){
            System.out.println( "Invalid score = " + score);



        }
    }
}
