package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(15);
        displayValue(123);
        displayValue(10);
        int count = 55;
        displayValue(count);   //num = count;

        greetByName("Teddy");
        greetByName("Saim");
        greetByName("Nadir");
        greetByName("100"); //need to put the number in "", otherwise String is not and Int and won't print it

        String name = "Iva";
        greetByName(name);
    }





    public static void displayValue(int num){
        System.out.println("value is " + num);
    }

    public static void greetByName (String name){
        System.out.println("Hello " + name + ", how are you today?");
    }

}
