package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main (String[] args){
        int toyotas =431;
        int hondas =233;
        int vw =2;
        int tesla =20;
        int nissan =1;
        int bmw =155;
        int totalCarsInParking = toyotas+hondas+vw+tesla+nissan+bmw;

        System.out.println("There are "+ totalCarsInParking + " cars in parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        System.out.println(slicesPerPerson);
        //there are 2 slices per person
        System.out.println("There are " + slicesPerPerson + " slices per person.");

        //We order hawaiian pizza with 8 slices, 4 people ate 2 slices each.
        System.out.println("We order pizza with " + slices + " slices, " + people + " people ate " + slices/people + " slices each");

    }
}
