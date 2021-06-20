package day48_constructors_static;
import java.util.*;

public class CybertekGroups {
    public static void main(String[] args) {
        //dependency injection. Group object creation depends on String name
        Group group1 = new Group ("Cyberbugs");

        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        //can we add member by using Arrays.asList all in one line?
        group1.setMembers(Arrays.asList("Berk","Pavel","Elvin","Ali","Parvin","Rasim","Maria"));


        Group group2 = new Group ("CyberCats");
        //setMembers means ArrayList
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andreea", "Andrei"));
        //print all members. !!! NOT TO STRING
        System.out.println("group 2 members = " + group2.getMembers());

        //use if statement to check if Akrem is in group2

        if(group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is member of group 2");
        }else{
            System.out.println("Akrem is not a group2 member");
        }

        //remove members from the group

        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1.getMembers());
    }
}
