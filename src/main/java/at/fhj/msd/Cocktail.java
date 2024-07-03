package at.fhj.msd;

import java.util.*;

public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getAlcoholPercent() {
        return 0;
    }

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
