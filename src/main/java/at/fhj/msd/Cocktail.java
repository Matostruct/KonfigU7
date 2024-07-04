package at.fhj.msd;
/**
 * Class Coctail, extends Drink with ingredients and Alcoholic Information
 */
import java.util.*;

public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected TreeSet<Liquid> ingredientList;

    /**
     * Coctail Constructor, creates a new Coctail with name and ingredients
     *
     * @param name   String
     * @param ingredientList  Treeset of Liquids
     */
    public Cocktail(String name, TreeSet<Liquid> ingredientList) {
        super(name);
        this.ingredientList = ingredientList;
    }

    /**
     * Gets the coctail Alcohol. Our coctails are without any!
     * @return 0
     */
    @Override
    public double getVolume() {
        return 0;
    }

    /**
     * Gets the coctail Alcohol. Our coctails are without any!
     * @return 0
     */
    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    /**
     * Returns, if the Coctail contains Alcohol. It doesnt.
     * @return false
     */
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
