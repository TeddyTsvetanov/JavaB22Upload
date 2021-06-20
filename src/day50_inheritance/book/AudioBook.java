package day50_inheritance.book;

public class AudioBook extends Book{
    int length;
    String narrator;
    
    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("Title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("length = " + length);
    }
}
