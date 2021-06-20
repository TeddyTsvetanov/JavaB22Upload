package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'J';

        if(grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with grade " + grade);
        }else if (grade == 'D'){
            System.out.println("Qualify for retake");
        }else if (grade == 'E') {
            System.out.println("Fail");
        }else{
            System.out.println("Invalid grade");
        }



        if((grade == 'A' || grade =='a') || (grade == 'B' || grade == 'b') || (grade == 'C' || grade == 'c')) {
            System.out.println("Passed with grade " + grade);
        }else if (grade == 'D'){
            System.out.println("Qualify for retake");
        }else if (grade == 'E') {
            System.out.println("Fail");
        }else{
            System.out.println("Invalid grade");
        }
    }
}
