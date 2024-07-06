package at.fhj.msd;
/**
 * Class Cocktail, extends Drink with ingredients and Alcoholic Information
 */
import java.util.*;

public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected List<Liquid> ingredientList;

    /**
     * Cocktail Constructor, creates a new cocktail with name and ingredients
     *
     * @param name   String
     * @param ingredientList  List of Liquids
     */
    public Cocktail(String name, List<Liquid> ingredientList) {
        super(name);
        this.ingredientList = ingredientList;
    }

    /**
     * Calculates the volume of the cocktail by adding together
     * the volume of all ingredients
     *
     * @return volume of all ingredients added together
     */
    @Override
    public double getVolume() {
        double volume =0.0;
        for (Liquid liquid : ingredientList) {
            volume += liquid.getVolume();
        }
        return volume;
    }

    /**
     * Calculates the alcohol content of the cocktail by calculating
     * the volume of alcohol per ingredient and adding them together
     * dividing the result by the added volume
     *
     * @return average alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholPercent = 0.0;
        for (Liquid liquid : ingredientList) {
            alcoholPercent += (liquid.getAlcoholPercent() * liquid.getVolume());
        }
        return (alcoholPercent / getVolume());
    }

    /**
     * Returns true if the cocktail contains any ingredient that
     * has alcohol in it
     *
     * @return boolean true if alcoholic false if not
     */
    @Override
    public boolean isAlcoholic() {
        return getAlcoholPercent() > 0;
    }
}
