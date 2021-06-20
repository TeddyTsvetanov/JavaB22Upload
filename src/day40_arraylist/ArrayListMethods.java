package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());        //size = 0
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to the mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("Tesla");
        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to the mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);    //Items to buy = 7

        System.out.println("is shoes in my list? - " + shoppingList.contains("shoes"));
        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes...$80");
        shoppingList.remove("shoes");           //even remove returns boolean
        System.out.println(shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all items
        System.out.println(shoppingList);
    }
}
