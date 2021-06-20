package office_hours_Saim.practice_06_14_2021;

/**
 * Create a class CandyFactory [ No inheritance with Candy classes ]
 *
 *     This class is to create objects of Candy, Take5, Twix and see how they are working
 */
public class CandyFactory {
    public static void main(String[] args) {

        Candy candy = new Candy("generic", -10, true);  //although we set as (-10) it prints 0
        System.out.println(candy);

        Take5 barOne = new Take5(4, true);
        System.out.println(barOne);

        Twix barTwo = new Twix(2, false);
        System.out.println(barTwo);

        System.out.println("Total number of candy objects is: " + Candy.getTotalNumOfCandies());
        System.out.println(barOne.getTotalNumOfCandies());  //you can access the shared static method with is giving you the static variable through an instance reference. But you would normally do it from the class. Print number will be again the same as total number of candy = 3.


    }
}
