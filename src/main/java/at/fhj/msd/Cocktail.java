package at.fhj.msd;

import java.util.*;

public class Cocktail extends Drink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected TreeSet<Liquid> ingredientList;

    public Cocktail(String name, TreeSet<Liquid> ingredientList) {
        super(name);
        this.ingredientList = ingredientList;
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
