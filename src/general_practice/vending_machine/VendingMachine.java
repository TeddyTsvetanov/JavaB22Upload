package general_practice.vending_machine;

import general_practice.vending_machine.product.CocaCola;
import general_practice.vending_machine.product.Fanta;
import general_practice.vending_machine.product.Product;
import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> inventory;
    private UserInputHandler userInputHandler;

    public VendingMachine(){
        userInputHandler = new UserInputHandler();
        inventory = new ArrayList<>();
        CocaCola cocaCola = new CocaCola();
        inventory.add(cocaCola);
        inventory.add(new Fanta()); //another way
    }

    public void start(){
        userInputHandler.greetingMessage();
    }

    public void userInput(String userInputMessage){

    }
}
