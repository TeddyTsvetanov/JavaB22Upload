package office_hours_Saim.practice_06_22_2021;

/**
 * Create an abstract class OnlineShopping
 *     - Inherits Shopping and implements Shipping
 *     - Does not need to implement any abstract methods
 */

public abstract class OnlineShopping extends Shopping implements Shipping {

    //there are 3 abstract methods here - 2 from Shopping and 1 from Shipping

    public abstract void viewCart();
}
