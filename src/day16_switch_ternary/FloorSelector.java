package day16_switch_ternary;

import java.sql.SQLOutput;

public class FloorSelector {
    public static void main(String[] args) {
        //declare variable floorNum = 1
        //when floorNum is 1 -> print "Floor 1 selected.Companies: Lobby, Verizon, Starbucks"
        //when floorNum in 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
        //when floorNum in 3 -> print "Floor 3 selected. Companies: Lyft,BOfA, Steakhouse"
        //anything else: print "Invalid floor - 6"

        int floorNum = 3;

        if(floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft,BOfA, Steakhouse");
        }else{
            System.out.println("Invalid floor - 6");
        }

        System.out.println("******SWITCH STATEMENT VERSION");
        floorNum = 1;
        switch(floorNum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft,BOfA, Steakhouse");
                break;
            default:
                System.out.println("Invalid floor selection");
                break;


        }






    }
}
