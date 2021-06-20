package day41_arraylist;
import java.util.*;

public class CitiesList {
    public static void main(String[] args) {
        //declare ArrayList
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arrayList -> add methods
        cities.add("Washington DC");  //0 index
        cities.add("New York");  //1 index
        cities.add("Vienna");  //2 index
        cities.add("Adana");  //3 index
        cities.add("LA");  //4 index

        //add Ashgabat to 0 index
        cities .add(0, "Ashgabat");

        //print all values in same line
        System.out.println(cities);

        //print first city
        System.out.println("first city = " + cities.get(0));

        //print first city
        System.out.println("last city = " + cities.get(5));

        //find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + "cities in the list.");


        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();
        //for each loop
        for(String city : cities) {
            System.out.print(city +" ");
        }


        //delete item from arraylist
        //1.Remove using index
        cities.remove(3);

        //2.Remove using object/value
        cities.remove("New York");  //case sensitive - be careful with the capital yonly first

        System.out.println("after remove = " + cities);

        //delete/remove all values from list
        cities.clear();
        //make sure it is cleared
        //1. print|spit it out
        System.out.println("cities = " + cities);

        //2.using isEmpty
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        //3. check size() ==0
        if (cities.size() == 0){
            System.out.println("list is empty");
        }


    }
}
