package office_hours_Saim;

//Create variables and give value related to you:
//
//        - String name
//        - byte age
//        - char gender
//        - boolean student
//        - short number of siblings
//        - long favorite number
//        - int number of seasons in your area
//        - double birth date: (month.day)
//        - int year
//        - String full birthday date with year
//        - String favorite quote
//
//        - Print the person information

public class PersonInfo {
    public static void main (String[] args){
        //Variables without any data
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignment of data

        name = "Saim";
        age = 50;
        gender = 'M';
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + "." + year;  //3.2.2021
        favoriteQuote = "have a good mindset";
        System.out.println("." + '.');







    }
}
