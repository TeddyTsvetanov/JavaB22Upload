package day32_arrays_split;
import java.util.*;

public class MallShopping {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,     9.99,   250.0 ,     439.50,     39.99};
        int[] itemIDs =   {12345 ,   12346,     12347,  12348,      12349,      12350};

        System.out.println("-----FIND THE INDEX OF 'Gloves' in items array----");
        //use for loop with condition

        for(int i = 0; i< items.length; i++){
            //System.out.println(i + " -" + items [i]);
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }
        }


        System.out.println("-----set boolean to true if first Ipad is found");
        boolean  iPadExists = false;
        for(String item : items) {
            if(item.equalsIgnoreCase("ipad")) {
                iPadExists =  true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);

        for(String item : items) {
            if(item.equalsIgnoreCase("iPad")) {
                iPadExists =  true;
                break;
            }
        }

        System.out.println("iPadExists = " + iPadExists);
        if(iPadExists){
            System.out.println("We bought the iPad");
        }else{
            System.out.println("We forgot the iPad");
        }

        /**
         * Shoes - $99.99 - #12345
         * ....
         *
         */

        for(int i=0; i < items.length; i++){
            System.out.println(items[i]+" - $"+prices[i]+" - #"+itemIDs[i]);
        }

        System.out.println("----look for 'Jacket' in items and print all details----");
        for(int i=0; i< items.length; i++){
            if (items[i].equalsIgnoreCase("Jacket")){
                System.out.println("\n Item name: " + items[i] + ", Price: " + prices[i] + ", Jacket ID: " + itemIDs[i]);
                break;
            }
        }
    }
}
