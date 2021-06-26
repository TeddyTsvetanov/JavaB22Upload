package day50_inheritance.book;

public class AudioBook extends Book{
    int length;
    String narrator;

//    static {
//        System.out.println("Jordan from static init 1");
//    }
//
//    {
//        System.out.println("Jordan from init block 2");
//
//    }
//
//    public AudioBook(int length) {
//        System.out.println("Jordan from constuctor 3");
//        this.length = length;
//    }
    
    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("Title = " + title);
        System.out.println("author = " + author);
        System.out.println("price = " + price);
        System.out.println("length = " + length);
    }
}
