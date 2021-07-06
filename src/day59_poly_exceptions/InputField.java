package day59_poly_exceptions;

public class InputField implements WebElement{
    public static final String TAG_NAME = "input";

    public String getValue(){
        System.out.println("Getting value in the InputField");
        return "selenium";

    }
    @Override
    public void sendKeys(String text) {
        System.out.println("Typing into input field - " + text);
    }

    @Override
    public void click() {
        System.out.println("");
    }

    @Override
    public String getText() {
        System.out.println("getting the text of Input field");
        return "java";
    }
}
