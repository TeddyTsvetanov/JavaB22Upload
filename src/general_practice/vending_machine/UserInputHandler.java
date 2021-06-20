package general_practice.vending_machine;

public class UserInputHandler {

    public void greetingMessage(){
        System.out.println("Hello, would you like to order anything?");
    }

    public String goodByeMessage(){
        return "Thank you for your business today";
    }

    public void handleUserInput(String userInput){
        switch (userInput){
            case "yes":
                System.out.println("what would you like to order");
                break;
            case "no":
                System.out.println("Thank you");
                break;
        }
    }

}
