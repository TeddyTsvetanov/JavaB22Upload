package office_hours_Saim.practice_06_14_2021;

/**
 * Create a class Twix [Child class]
 *
 *     * Inherits Candy class
 *
 *     * constructor that invokes the parent constructor
 *
 *     * extra: static hiding, final, sub class
 *
 * Twix is a candy
 * Twix is an Object
 * Twix has a brand Mars
 * Twix has a quantity
 *
 */
public class Twix extends Candy {

    public Twix( int quantity, boolean hasPeanuts) {

        super("Mars", quantity, hasPeanuts);
    }
}
