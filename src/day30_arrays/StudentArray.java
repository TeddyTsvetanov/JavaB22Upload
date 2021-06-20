package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1 = new String [5];
        student1[0] = "AD1234";
        student1[1] = "Adam";
        student1[2] = "Smith";
        student1[3] = "B22";
        student1[4] = "202 - 543 - 1234";

        System.out.println("student id = "+student1[0]);
        System.out.println("student1 firstName = "+ student1[1]);
        System.out.println("student1 lastName = "+student1[2]);
        System.out.println("student1 batch Num = "+student1[3]);
        System.out.println("student1 mobile num = "+student1[4]);



        String[] student2 = {"MK4421", "Mike", "Bloomberg", "B22", "703-431-1234"};

        System.out.println("student id = "+student2[0]);
        System.out.println("student1 firstName = "+ student2[1]);
        System.out.println("student1 lastName = "+student2[2]);
        System.out.println("student1 batch Num = "+student2[3]);
        System.out.println("student1 mobile num = "+student2[4]);

        System.out.println("student data length:" + student1.length);

        //check if student1 data array contains 5 items.
        //true: PASS data array has correct length
        //false: FAIL data array has incorrect length

        if(student1.length == 5){
            System.out.println("PASS data array has correct length");
        }else{
            System.out.println("FAIL data array has incorrect length");
        }


        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS - data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */

        if(student1.length == student2.length){
            System.out.println("PASS - data arrays length match");
        }else{
            System.out.println("FAIL: data arrays length mismatch");
        }

        /**
         read from array and print first and last name in upper case
          */

        System.out.println(student1[1].toUpperCase()+" " + student1[2].toUpperCase());


    }
}
