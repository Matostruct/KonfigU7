package at.fhj.msd;

import java.util.*;

public class Cocktail extends SimpleDrink {

    /**
     * Creates a Drink object with given name and a list of ingredients
     *
     * @param name name of the drink
     * @param List<Liquid> ingredients of the cocktail
     */
    protected List<Liquid> ingredientList;

    public Cocktail(String name, Liquid ingredient) {
        super(name, ingredient);
        this.ingredientList = ingredients;
    }
}
